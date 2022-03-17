package tw.hibernatedemo.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class AppConfig {

	@Bean
	public HikariDataSource datasource() {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:sqlserver://localhost:1433;databaseName=SpringDB");
		config.setUsername("sa");
		config.setPassword("Passw0rd!");
		config.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		config.setMaximumPoolSize(10);
//		HikariDataSource ds = new HikariDataSource(config);
//		return ds;
		
		return new HikariDataSource(config);
	}
	
	public Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", org.hibernate.dialect.SQLServer2016Dialect.class);
		properties.put("hibernate.show_sql", Boolean.TRUE);
		properties.put("hibernate.format_sql", Boolean.TRUE);
//		properties.put("hibernate.hbm2ddl.auto", "update");
		return properties;
	}

}