package com.hedza06.spring_vault_integration.configurations;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("credentials")
public class FakeStoreApiConfiguration {

    private String username;
    private String password;

}
