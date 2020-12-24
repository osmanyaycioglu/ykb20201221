package com.training.ykb.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.training.ykb.rest.error.RestErrorDecoder;

import feign.codec.ErrorDecoder;


@Configuration
@RibbonClient(name = "ACCOUNTING", configuration = RibonConfig.class)
public class OrderConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public ErrorDecoder errorHandler() {
        return new RestErrorDecoder();
    }

}
