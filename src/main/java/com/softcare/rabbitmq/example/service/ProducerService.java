package com.softcare.rabbitmq.example.service;

import com.softcare.rabbitmq.example.configuration.MessagingConfig;
import com.softcare.rabbitmq.example.entity.OrderStatus;
import com.softcare.rabbitmq.example.entity.Orders;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProducerService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public String publishMessage(Orders orders, String restaurantName) {
        orders.setOrderId((UUID.randomUUID().toString()));
        OrderStatus status = new OrderStatus(orders, "PROCESSING","Order Placed Successfully " +
                "in "+restaurantName);
        rabbitTemplate.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, status);
        return "Success !!!";
    }
}
