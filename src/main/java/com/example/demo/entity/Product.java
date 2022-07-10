package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "product_service_table")
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String description;
    private BigDecimal price;
    private Long stock;
}
