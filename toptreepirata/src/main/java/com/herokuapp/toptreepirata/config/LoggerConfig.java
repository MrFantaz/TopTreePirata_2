package com.herokuapp.toptreepirata.config;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LoggerConfig {

    @Bean
    @Scope("prototype")
    public Logger getLogger(InjectionPoint point) {
        return Logger.getLogger(point.getClass());

    }
}
