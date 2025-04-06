package com.myproductservice.paymentservice.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
//import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Getter
@Setter
public class Payment extends BaseModel{
    private Long amount;
    private PaymentStatus paymentStatus;
    private Long UserID;
    private  Long OrderId;
    private String PaymentLink;
    private Long PaymentGatewayReferenceID;
    private PaymentGateway paymentGateway;



}
