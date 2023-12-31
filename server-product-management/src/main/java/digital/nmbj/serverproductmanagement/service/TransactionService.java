package digital.nmbj.serverproductmanagement.service;

import digital.nmbj.serverproductmanagement.model.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction saveTransaction(Transaction transaction);

    Long numberOfTransaction();

    List<Transaction> findAllTransactions();
}
