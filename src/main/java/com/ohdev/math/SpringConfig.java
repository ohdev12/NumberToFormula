package com.ohdev.math;

import com.ohdev.math.repository.JpaMathRepository;
import com.ohdev.math.repository.MathRepository;
import com.ohdev.math.service.MathService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {

    private final EntityManager em;

    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    public MathService mathService() {
        return new MathService(mathRepository());
    }

    @Bean
    public MathRepository mathRepository() {
        return new JpaMathRepository(em);
    }
}
