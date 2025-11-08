package com.andreibel.backend;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration("UUIDConfig")
public class UUIDConfig {
    @Bean
    public ObjectIdGenerators.UUIDGenerator uuidGenerator() {
        return new ObjectIdGenerators.UUIDGenerator();
    }
}
