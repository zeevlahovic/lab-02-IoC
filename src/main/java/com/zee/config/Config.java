package com.zee.config;

import com.zee.Currency;
import com.zee.account.Current;
import com.zee.account.Saving;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.UUID;

@Configuration
public class Config {

    @Bean
    public Currency currency() {
        return new Currency("1234","Dollar");
    }

    @Bean
    public Current current(Currency currency) {
        return new Current(currency, BigDecimal.valueOf(100), UUID.randomUUID());
    }

    @Bean
    public Saving saving(Currency currency) {
        return new Saving(currency,BigDecimal.valueOf(200),UUID.randomUUID());
    }
}
