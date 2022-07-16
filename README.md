## Spring Boot Integration With Vault
This project demonstrates integration between Spring Boot and Vault Server.
There are two scenarios: external configuration for fake api integration and more important external 
configuration for database connection. All external properties are located in Vault _(not in YML properties)_.

HashiCorp Vault is an identity-based secrets 
and encryption management system. A secret is anything that you want to tightly control access to, such as API 
encryption keys, passwords, and certificates. Vault provides encryption services that are gated by authentication 
and authorization methods. Using Vault’s UI, CLI, or HTTP API, access to secrets and other sensitive data can be 
securely stored and managed, tightly controlled (restricted), and auditable.  

A modern system requires access to a multitude of secrets, including database credentials, API keys for external 
services, credentials for service-oriented architecture communication, etc. It can be difficult to understand who is 
accessing which secrets, especially since this can be platform-specific. Adding on key rolling, secure storage, and 
detailed audit logs is almost impossible without a custom solution. This is where Vault steps in.

### Running Vault in Docker Container
1. Change directory to `docker` by running the following command: `cd docker`
2. Run command: `docker-compose up -d`. This command will bootstrap the Vault Server. 
Vault server will be running on port 8200 on local address.
3. Check logs of vault container by running the command: `docker logs -f vault` and pick up the generated token
4. Open `bootstrap.yml` file which is located in **resources** folder and paste token in property _spring.cloud.vault.token_
5. Open terminal and run command: `docker exec -it vault sh` and after that run the following commands:
```
* export VAULT_TOKEN="your-token-here"  
* vault kv put secret/spring_vault_integration credentials.username=some-dummy-username credentials.password=some-dummy-password
* vault kv put secret/spring_vault_integration datasource.username=root datasource.password=root datasource.url=jdbc:mysql://localhost:3306/vault?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=CET&allowPublicKeyRetrieval=true
```
Third command is **important** because you are setting datasource credentials that are used for database connection. So 
you have to put all datasource properties with your own values.

Run the project and check your console.

**NOTE**: Do not run Vault in production before you check production hardening: 
https://learn.hashicorp.com/tutorials/vault/production-hardening

### Contribution
If someone is interested for contribution or have some suggestions please contact me on e-mail _hedzaprog@gmail.com_. 

### Author
Heril Muratović   
Software Engineer  
<br>
**Mobile**: +38269657962  
**E-mail**: hedzaprog@gmail.com  
**Skype**: hedza06  
**Twitter**: hedzakirk  
**LinkedIn**: https://www.linkedin.com/in/heril-muratovi%C4%87-021097132/  
**StackOverflow**: https://stackoverflow.com/users/4078505/heril-muratovic