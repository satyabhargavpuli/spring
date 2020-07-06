package info.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration

public class DataSourceFactory {

	@Bean
	private DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	dataSource.setUsername("mydb");
	dataSource.setPassword("tiger");
		
		return dataSource;
	}
	
	
 }
