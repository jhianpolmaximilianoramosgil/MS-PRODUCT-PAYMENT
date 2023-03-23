package com.nttdata.bank.account.repository;

import com.nttdata.bank.account.model.ClientProductPayment;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientProductPaymentRepository extends ReactiveMongoRepository<ClientProductPayment, Integer> {

}
