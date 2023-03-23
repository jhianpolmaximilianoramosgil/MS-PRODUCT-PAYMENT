package com.nttdata.bank.account.service;


import com.nttdata.bank.account.model.ClientProductPayment;
import com.nttdata.bank.account.model.ClientProductPaymentDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientProductPaymentService {

  Flux<ClientProductPayment> getAll();

  Mono<ClientProductPayment> save(ClientProductPaymentDto productPaymentDto);

  Mono<ClientProductPayment> update(ClientProductPaymentDto productPaymentDto);

  Mono<ClientProductPayment> findById(Integer accountId);

  Mono<ClientProductPayment> uploadConsumer(Integer idClient, Float ammount,ClientProductPaymentDto request);

}