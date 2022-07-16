package com.hedza06.spring_vault_integration;

import com.hedza06.spring_vault_integration.configurations.DataSourceVaultConfiguration;
import com.hedza06.spring_vault_integration.configurations.FakeStoreApiConfiguration;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class SpringVaultIntegrationApplication implements CommandLineRunner {

	private final FakeStoreApiConfiguration fakeStoreApiConfiguration;
	private final DataSourceVaultConfiguration dataSourceVaultConfiguration;


	public static void main(String[] args) {
		SpringApplication.run(SpringVaultIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		log.info("Fake Api Config: {}", fakeStoreApiConfiguration);
		log.info("Datasource Config: {}", dataSourceVaultConfiguration);
	}
}
