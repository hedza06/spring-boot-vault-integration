package com.hedza06.spring_vault_integration.configurations;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("datasource")
public class DataSourceVaultConfiguration {

    private String name;
    private String url;
    private String username;
    private String password;

}
