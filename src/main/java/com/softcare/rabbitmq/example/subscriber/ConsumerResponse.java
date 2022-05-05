package com.softcare.rabbitmq.example.subscriber;

import com.softcare.rabbitmq.example.entity.OrderStatus;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerResponse {

    @RabbitListener(queues = "softcare_queue" )
    public void response(OrderStatus orderStatus){
        System.out.println("Message : "+orderStatus);
    }
}
