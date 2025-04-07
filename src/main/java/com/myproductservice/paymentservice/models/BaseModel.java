package com.myproductservice.paymentservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
//@MappedSuperclass
@Getter
@Setter
@Entity
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
