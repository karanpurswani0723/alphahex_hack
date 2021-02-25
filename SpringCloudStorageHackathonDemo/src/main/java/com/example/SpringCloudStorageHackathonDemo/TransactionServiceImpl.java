package com.example.SpringCloudStorageHackathonDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("transactionService")
public class TransactionServiceImpl implements TransactionService {


    /*@Autowired
    TransactionRepository transactionRepository;*/


    @Override
    public void create(Transaction transaction) {

        //Transaction transaction1=transactionRepository.insert(transaction);
        System.out.println("transaction created---");

    }

    @Override
    public void update(Transaction transaction) {
        //Transaction transaction1 = transactionRepository.save(transaction);
        System.out.println("Updated:- " );

    }

    @Override
    public void delete(Transaction transaction) {
        //transactionRepository.delete(transaction);
        System.out.println("Deleted:- " + transaction.getAccountNumber());

    }

    @Override
    public void deleteAll() {
      //  transactionRepository.deleteAll();

    }

    @Override
    public Transaction find(Transaction transaction) {
        return null;
    }

    @Override
    public List<Transaction> findByAccountNumber(String accountNumber) {
        return new ArrayList<>();
               // transactionRepository.findByAccountNumber(accountNumber);
    }

    @Override
    public List<Transaction> findAll() {
        return
                new ArrayList<>();
                //transactionRepository.findAll();
    }
}
