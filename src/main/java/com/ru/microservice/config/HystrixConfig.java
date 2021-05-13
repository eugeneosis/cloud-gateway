package com.ru.microservice.config;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;
import org.springframework.stereotype.Component;

@Component
public class HystrixConfig extends HystrixCommand<String> {

    public HystrixConfig() {
        super(HystrixCommandGroupKey.Factory.asKey("HystrixConfigGroup"));
    }

    @Override
    protected String run() throws Exception {
        HystrixCommandProperties.Setter()
                .withExecutionTimeoutInMilliseconds(10000);
        return execute();
    }
}
