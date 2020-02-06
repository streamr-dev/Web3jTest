package network.streamr.contracts;

import io.reactivex.Flowable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.5.14.
 */
@SuppressWarnings("rawtypes")
public class Community extends Contract {
    public static final String BINARY = "Bin file was not provided";

    public static final String FUNC_WITHDRAWALLTO = "withdrawAllTo";

    public static final String FUNC_WITHDRAW = "withdraw";

    public static final String FUNC_PROVE = "prove";

    public static final String FUNC_WITHDRAWALL = "withdrawAll";

    public static final String FUNC_TOTALWITHDRAWN = "totalWithdrawn";

    public static final String FUNC_JOINPARTSTREAM = "joinPartStream";

    public static final String FUNC_CLAIMOWNERSHIP = "claimOwnership";

    public static final String FUNC_EARNINGS = "earnings";

    public static final String FUNC_OPERATOR = "operator";

    public static final String FUNC_WITHDRAWALLFOR = "withdrawAllFor";

    public static final String FUNC_CALCULATEROOTHASH = "calculateRootHash";

    public static final String FUNC_WITHDRAWN = "withdrawn";

    public static final String FUNC_BLOCKFREEZESECONDS = "blockFreezeSeconds";

    public static final String FUNC_BLOCKTIMESTAMP = "blockTimestamp";

    public static final String FUNC_BLOCKHASH = "blockHash";

    public static final String FUNC_SETADMINFEE = "setAdminFee";

    public static final String FUNC_OWNER = "owner";

    public static final String FUNC_ADMINFEE = "adminFee";

    public static final String FUNC_SETOPERATOR = "setOperator";

    public static final String FUNC_TOTALPROVEN = "totalProven";

    public static final String FUNC_COMMIT = "commit";

    public static final String FUNC_WITHDRAWTO = "withdrawTo";

    public static final String FUNC_PROOFISCORRECT = "proofIsCorrect";

    public static final String FUNC_WITHDRAWFOR = "withdrawFor";

    public static final String FUNC_PENDINGOWNER = "pendingOwner";

    public static final String FUNC_TRANSFEROWNERSHIP = "transferOwnership";

    public static final String FUNC_TOKEN = "token";

    public static final Event OPERATORCHANGED_EVENT = new Event("OperatorChanged", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}));
    ;

    public static final Event ADMINFEECHANGED_EVENT = new Event("AdminFeeChanged", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    ;

    public static final Event OWNERSHIPTRANSFERRED_EVENT = new Event("OwnershipTransferred", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}));
    ;

    public static final Event BLOCKCREATED_EVENT = new Event("BlockCreated", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Bytes32>() {}, new TypeReference<Utf8String>() {}));
    ;

    @Deprecated
    protected Community(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Community(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Community(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Community(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> withdrawAllTo(String recipient, BigInteger blockNumber, BigInteger totalEarnings, List<byte[]> proof) {
        final Function function = new Function(
                FUNC_WITHDRAWALLTO, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.generated.Uint256(blockNumber), 
                new org.web3j.abi.datatypes.generated.Uint256(totalEarnings), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.datatypes.generated.Bytes32.class,
                        org.web3j.abi.Utils.typeMap(proof, org.web3j.abi.datatypes.generated.Bytes32.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> withdraw(BigInteger amount) {
        final Function function = new Function(
                FUNC_WITHDRAW, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> prove(BigInteger blockNumber, String account, BigInteger balance, List<byte[]> proof) {
        final Function function = new Function(
                FUNC_PROVE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(blockNumber), 
                new org.web3j.abi.datatypes.Address(160, account), 
                new org.web3j.abi.datatypes.generated.Uint256(balance), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.datatypes.generated.Bytes32.class,
                        org.web3j.abi.Utils.typeMap(proof, org.web3j.abi.datatypes.generated.Bytes32.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> withdrawAll(BigInteger blockNumber, BigInteger totalEarnings, List<byte[]> proof) {
        final Function function = new Function(
                FUNC_WITHDRAWALL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(blockNumber), 
                new org.web3j.abi.datatypes.generated.Uint256(totalEarnings), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.datatypes.generated.Bytes32.class,
                        org.web3j.abi.Utils.typeMap(proof, org.web3j.abi.datatypes.generated.Bytes32.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> totalWithdrawn() {
        final Function function = new Function(FUNC_TOTALWITHDRAWN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> joinPartStream() {
        final Function function = new Function(FUNC_JOINPARTSTREAM, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> claimOwnership() {
        final Function function = new Function(
                FUNC_CLAIMOWNERSHIP, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> earnings(String param0) {
        final Function function = new Function(FUNC_EARNINGS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> operator() {
        final Function function = new Function(FUNC_OPERATOR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> withdrawAllFor(String recipient, BigInteger blockNumber, BigInteger totalEarnings, List<byte[]> proof) {
        final Function function = new Function(
                FUNC_WITHDRAWALLFOR, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.generated.Uint256(blockNumber), 
                new org.web3j.abi.datatypes.generated.Uint256(totalEarnings), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.datatypes.generated.Bytes32.class,
                        org.web3j.abi.Utils.typeMap(proof, org.web3j.abi.datatypes.generated.Bytes32.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<byte[]> calculateRootHash(byte[] hash, List<byte[]> others) {
        final Function function = new Function(FUNC_CALCULATEROOTHASH, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(hash), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.datatypes.generated.Bytes32.class,
                        org.web3j.abi.Utils.typeMap(others, org.web3j.abi.datatypes.generated.Bytes32.class))), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<BigInteger> withdrawn(String param0) {
        final Function function = new Function(FUNC_WITHDRAWN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> blockFreezeSeconds() {
        final Function function = new Function(FUNC_BLOCKFREEZESECONDS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> blockTimestamp(BigInteger param0) {
        final Function function = new Function(FUNC_BLOCKTIMESTAMP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<byte[]> blockHash(BigInteger param0) {
        final Function function = new Function(FUNC_BLOCKHASH, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<TransactionReceipt> setAdminFee(BigInteger _adminFee) {
        final Function function = new Function(
                FUNC_SETADMINFEE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_adminFee)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> owner() {
        final Function function = new Function(FUNC_OWNER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> adminFee() {
        final Function function = new Function(FUNC_ADMINFEE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setOperator(String newOperator) {
        final Function function = new Function(
                FUNC_SETOPERATOR, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, newOperator)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> totalProven() {
        final Function function = new Function(FUNC_TOTALPROVEN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> commit(BigInteger blockNumber, byte[] rootHash, String ipfsHash) {
        final Function function = new Function(
                FUNC_COMMIT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(blockNumber), 
                new org.web3j.abi.datatypes.generated.Bytes32(rootHash), 
                new org.web3j.abi.datatypes.Utf8String(ipfsHash)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> withdrawTo(String recipient, String account, BigInteger amount) {
        final Function function = new Function(
                FUNC_WITHDRAWTO, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.Address(160, account), 
                new org.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> proofIsCorrect(BigInteger blockNumber, String account, BigInteger balance, List<byte[]> proof) {
        final Function function = new Function(FUNC_PROOFISCORRECT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(blockNumber), 
                new org.web3j.abi.datatypes.Address(160, account), 
                new org.web3j.abi.datatypes.generated.Uint256(balance), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.datatypes.generated.Bytes32.class,
                        org.web3j.abi.Utils.typeMap(proof, org.web3j.abi.datatypes.generated.Bytes32.class))), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> withdrawFor(String recipient, BigInteger amount) {
        final Function function = new Function(
                FUNC_WITHDRAWFOR, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> pendingOwner() {
        final Function function = new Function(FUNC_PENDINGOWNER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> transferOwnership(String newOwner) {
        final Function function = new Function(
                FUNC_TRANSFEROWNERSHIP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, newOwner)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> token() {
        final Function function = new Function(FUNC_TOKEN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public List<OperatorChangedEventResponse> getOperatorChangedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(OPERATORCHANGED_EVENT, transactionReceipt);
        ArrayList<OperatorChangedEventResponse> responses = new ArrayList<OperatorChangedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            OperatorChangedEventResponse typedResponse = new OperatorChangedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.newOperator = (String) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<OperatorChangedEventResponse> operatorChangedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, OperatorChangedEventResponse>() {
            @Override
            public OperatorChangedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(OPERATORCHANGED_EVENT, log);
                OperatorChangedEventResponse typedResponse = new OperatorChangedEventResponse();
                typedResponse.log = log;
                typedResponse.newOperator = (String) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<OperatorChangedEventResponse> operatorChangedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(OPERATORCHANGED_EVENT));
        return operatorChangedEventFlowable(filter);
    }

    public List<AdminFeeChangedEventResponse> getAdminFeeChangedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(ADMINFEECHANGED_EVENT, transactionReceipt);
        ArrayList<AdminFeeChangedEventResponse> responses = new ArrayList<AdminFeeChangedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            AdminFeeChangedEventResponse typedResponse = new AdminFeeChangedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.adminFee = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<AdminFeeChangedEventResponse> adminFeeChangedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, AdminFeeChangedEventResponse>() {
            @Override
            public AdminFeeChangedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(ADMINFEECHANGED_EVENT, log);
                AdminFeeChangedEventResponse typedResponse = new AdminFeeChangedEventResponse();
                typedResponse.log = log;
                typedResponse.adminFee = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<AdminFeeChangedEventResponse> adminFeeChangedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ADMINFEECHANGED_EVENT));
        return adminFeeChangedEventFlowable(filter);
    }

    public List<OwnershipTransferredEventResponse> getOwnershipTransferredEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(OWNERSHIPTRANSFERRED_EVENT, transactionReceipt);
        ArrayList<OwnershipTransferredEventResponse> responses = new ArrayList<OwnershipTransferredEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.previousOwner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.newOwner = (String) eventValues.getIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<OwnershipTransferredEventResponse> ownershipTransferredEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, OwnershipTransferredEventResponse>() {
            @Override
            public OwnershipTransferredEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(OWNERSHIPTRANSFERRED_EVENT, log);
                OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
                typedResponse.log = log;
                typedResponse.previousOwner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.newOwner = (String) eventValues.getIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<OwnershipTransferredEventResponse> ownershipTransferredEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(OWNERSHIPTRANSFERRED_EVENT));
        return ownershipTransferredEventFlowable(filter);
    }

    public List<BlockCreatedEventResponse> getBlockCreatedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(BLOCKCREATED_EVENT, transactionReceipt);
        ArrayList<BlockCreatedEventResponse> responses = new ArrayList<BlockCreatedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            BlockCreatedEventResponse typedResponse = new BlockCreatedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.blockNumber = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.rootHash = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.ipfsHash = (String) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<BlockCreatedEventResponse> blockCreatedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, BlockCreatedEventResponse>() {
            @Override
            public BlockCreatedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(BLOCKCREATED_EVENT, log);
                BlockCreatedEventResponse typedResponse = new BlockCreatedEventResponse();
                typedResponse.log = log;
                typedResponse.blockNumber = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.rootHash = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.ipfsHash = (String) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<BlockCreatedEventResponse> blockCreatedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(BLOCKCREATED_EVENT));
        return blockCreatedEventFlowable(filter);
    }

    @Deprecated
    public static Community load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Community(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Community load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Community(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Community load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Community(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Community load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Community(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class OperatorChangedEventResponse extends BaseEventResponse {
        public String newOperator;
    }

    public static class AdminFeeChangedEventResponse extends BaseEventResponse {
        public BigInteger adminFee;
    }

    public static class OwnershipTransferredEventResponse extends BaseEventResponse {
        public String previousOwner;

        public String newOwner;
    }

    public static class BlockCreatedEventResponse extends BaseEventResponse {
        public BigInteger blockNumber;

        public byte[] rootHash;

        public String ipfsHash;
    }
}
