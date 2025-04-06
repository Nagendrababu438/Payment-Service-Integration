package com.myproductservice.paymentservice.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
@MappedSuperclass
@Getter
@Setter
public class BaseModel {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
