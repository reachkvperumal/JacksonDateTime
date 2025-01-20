package com.kv.demo.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DisableNetworkCaching implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        java.security.Security.setProperty("networkaddress.cache.ttl", "0");
        java.security.Security.setProperty("networkaddress.cache.negative", "false");
    }
}
