package com.softcare.rabbitmq.example.producer;

import com.softcare.rabbitmq.example.entity.OrderStatus;
import com.softcare.rabbitmq.example.entity.Orders;
import com.softcare.rabbitmq.example.service.ProducerService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class ProducerController {

    @Autowired
    private ProducerService service;

    @PostMapping("/{restaurantName}")
    public String publishMessage(@RequestBody Orders orders, @PathVariable("restaurantName") String restaurantName) {
        service.publishMessage(orders, restaurantName);
        return "Success !!!";
    }
}
