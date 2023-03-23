package com.nttdata.bank.account.model;

import lombok.Data;

@Data

public class ClientProductPaymentDto {

    private Integer id;
    private Integer idClient;
    private String product;
    private String typeProduct;
    private String status;
}
