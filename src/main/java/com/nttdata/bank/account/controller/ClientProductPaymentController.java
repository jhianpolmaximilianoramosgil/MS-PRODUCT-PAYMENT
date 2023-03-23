package com.nttdata.bank.account.controller;

import com.nttdata.bank.account.service.ClientProductPaymentService;
import com.nttdata.bank.account.model.ClientProductPayment;
import com.nttdata.bank.account.model.ClientProductPaymentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/client-product-payment")
public class ClientProductPaymentController {

    @Autowired
    private ClientProductPaymentService clientProductPaymentService;

    @GetMapping
    public Flux<ClientProductPayment> getAll() {
        return clientProductPaymentService
                .getAll();
    }

    @GetMapping("/{id}")
    public Mono<ClientProductPayment> findById(@PathVariable("id") Integer id) {
        return clientProductPaymentService
                .findById(id);
    }

    @PostMapping
    public Mono<ClientProductPayment> save(@Valid @RequestBody ClientProductPaymentDto clientProductPaymentDto) {
        return clientProductPaymentService
                .save(clientProductPaymentDto);
    }

    @PostMapping("/updActivo")
    public Mono<ClientProductPayment> update(@Valid @RequestBody ClientProductPaymentDto clientProductPaymentDto) {
        return clientProductPaymentService
                .update(clientProductPaymentDto);
    }

    @PostMapping("/consumo-tarjetas")
    public Mono<ClientProductPayment> update(@PathVariable Integer idClient, @PathVariable Float amount,@RequestBody ClientProductPaymentDto request) {
        return clientProductPaymentService
                .uploadConsumer(idClient,amount,request);
    }
}
