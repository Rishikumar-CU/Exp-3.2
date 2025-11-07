package com.example.service;

import com.example.dao.AccountDAO;
import com.example.entity.Account;
import com.example.entity.TransactionRecord;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankingService {

    private final AccountDAO accountDAO;
    private final SessionFactory sessionFactory;

    public BankingService(AccountDAO accountDAO, SessionFactory sessionFactory) {
        this.accountDAO = accountDAO;
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void transferMoney(int fromId, int toId, double amount) {
        Account from = accountDAO.getAccount(fromId);
        Account to = accountDAO.getAccount(toId);

        if (from.getBalance() < amount) {
            throw new RuntimeException("Insufficient funds");
        }

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        accountDAO.updateAccount(from);
        accountDAO.updateAccount(to);

        TransactionRecord record = new TransactionRecord(fromId, toId, amount);
        sessionFactory.getCurrentSession().save(record);
    }
}
