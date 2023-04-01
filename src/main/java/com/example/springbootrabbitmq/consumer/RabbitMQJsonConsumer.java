package com.example.springbootrabbitmq.consumer;


import com.example.springbootrabbitmq.dto.User;
import com.example.springbootrabbitmq.publisher.RabbitMQJsonProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public void consumerJsonMessage(User user){
        LOGGER.info(String.format("Received JSON message -> %s", user.toString()));
    }

}
