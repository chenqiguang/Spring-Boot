package com.chenqiguang.springboot.configuration;


import org.jooq.TransactionContext;
import org.jooq.TransactionProvider;
import org.jooq.exception.DataAccessException;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class SpringTransactionProvider implements TransactionProvider {
    private final PlatformTransactionManager transactionManager;

    SpringTransactionProvider(PlatformTransactionManager transactionManager){
        this.transactionManager = transactionManager;
    }
    @Override
    public void begin(TransactionContext transactionContext) throws DataAccessException {
        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition(6);
        TransactionStatus status = this.transactionManager.getTransaction(transactionDefinition);
        transactionContext.transaction(new SpringTransaction(status));
    }

    @Override
    public void commit(TransactionContext transactionContext) throws DataAccessException {
        this.transactionManager.commit(getTransactionStatus(transactionContext));
    }

    @Override
    public void rollback(TransactionContext transactionContext) throws DataAccessException {
        this.transactionManager.rollback(getTransactionStatus(transactionContext));
    }

    private TransactionStatus getTransactionStatus(TransactionContext transactionContext){
        SpringTransaction transaction = (SpringTransaction) transactionContext.transaction();
        return transaction.getStatus();
    }
}
