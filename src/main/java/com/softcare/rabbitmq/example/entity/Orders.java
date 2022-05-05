package com.softcare.rabbitmq.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders {

    private String orderId;
    private String orderName;
    private String quantity;
    private double price;

}
