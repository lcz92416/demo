package cn.com.betasoft.saas.demo.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean(name = "mysql")
    @ConfigurationProperties(prefix = "spring.datasource.mysql") // application.properteis中对应属性的前缀
    @Primary
    public DataSource dataSource1() {
        return DataSourceBuilder.create().build();
    }




    @Bean(name = "pgsql")
    @ConfigurationProperties(prefix = "spring.datasource.pgsql") // application.properteis中对应属性的前缀
    public DataSource dataSource2() {
        return DataSourceBuilder.create().build();
    }

}
