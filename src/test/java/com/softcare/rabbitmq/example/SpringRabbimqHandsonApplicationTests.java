package com.softcare.rabbitmq.example;

import com.softcare.rabbitmq.example.configuration.MessagingConfig;
import com.softcare.rabbitmq.example.entity.OrderStatus;
import com.softcare.rabbitmq.example.entity.Orders;
import com.softcare.rabbitmq.example.service.ProducerService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class SpringRabbimqHandsonApplicationTests {

    @Autowired
    private ProducerService service;

	@Mock
	private RabbitTemplate rabbitTemplate;

    @Test
    void testpublishMessage() {
        assertEquals(true,true);
    }

}
