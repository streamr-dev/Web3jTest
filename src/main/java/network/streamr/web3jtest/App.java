package network.streamr.web3jtest;

import network.streamr.contracts.Community;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.methods.response.EthSubscribe;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.websocket.WebSocketClient;
import org.web3j.protocol.websocket.WebSocketService;
import org.web3j.protocol.websocket.events.NewHeadsNotification;
import org.web3j.tx.ChainIdLong;
import org.web3j.tx.gas.DefaultGasProvider;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;

public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static final String url = "https://mainnet.infura.io/v3/538d11fcc52941a0a32984e096812f20";
    public static final String wsurl = "wss://mainnet.infura.io/ws/v3/538d11fcc52941a0a32984e096812f20";
    //public static final String url = "http://localhost:8545";
    //public static final String wsurl = "http://localhost:8545";
    public static void main(String[] args) throws Exception {
        //listenBlocksHttp();
        //listenBlocksWs();

        String memberAddress = "0x242752acA5c560457a3C49d17d6F7824a595af18";
        BigInteger tokens = getWithdrawnTokens(memberAddress);
        log.info("Tokens withdrawn by " + memberAddress + ": " + tokens.toString());
    }

    // Check manually at https://etherscan.io/address/0xF24197f71fC9b2F4F4c24ecE461fB0Ff7C91FD23#readContract
    // At "6. withdrawn" and "<input> (address)" enter 0x242752acA5c560457a3C49d17d6F7824a595af18 and hit "Query"
    public static BigInteger getWithdrawnTokens(String memberAddress) throws Exception {
        Web3j web3j = Web3j.build(new HttpService(url));
        String communityAddress = "0xF24197f71fC9b2F4F4c24ecE461fB0Ff7C91FD23";
        String privateKey = "0000000100000001000000010000000100000001000000010000000100000001";
        Community c = Community.load(communityAddress, web3j, Credentials.create(privateKey), new DefaultGasProvider());
        return c.withdrawn(memberAddress).send();
    }

    public static void listenBlocksHttp() throws IOException {
        Web3j web3j = Web3j.build(new HttpService(url));
        log.info("Connected to " + url + ", client version: " + web3j.web3ClientVersion().send().getWeb3ClientVersion());

        log.info("Subscribing to new blocks");
        web3j.blockFlowable(false).subscribe(blockEvent -> {
            log.info("Detected block number " + blockEvent.getBlock().getNumberRaw());
        }, Throwable::printStackTrace);
    }

    public static void listenBlocksWs() throws Exception {
        WebSocketClient client = new WebSocketClient(new URI(wsurl));
        log.info("Connecting to " + wsurl);
        client.connectBlocking();
        WebSocketService service = new WebSocketService(client, true);
        log.info("Subscribing to new blocks");
        service.subscribe(new Request(
                "eth_subscribe",
                Arrays.asList("newHeads", Collections.emptyMap()),
                service,
                EthSubscribe.class),
            "eth_unsubscribe",
            NewHeadsNotification.class
        ).subscribe(event -> {
            log.info("Detected block number " + event.getParams().getResult().getNumber());
        }, Throwable::printStackTrace);
    }
}
