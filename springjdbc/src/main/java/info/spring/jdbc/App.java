package info.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
@ComponentScan
public class App 
{
   
	public static void main( String[] args )
    {
    	ApplicationContext container = new AnnotationConfigApplicationContext();
    	
   JdbcTemplate jdbcTemplate = container.getBean(JdbcTemplate.class);
   jdbcTemplate.update("insert into EMP_TBL values(?,?,?)",2,"balraj",12000);
   ((AbstractApplicationContext) container).close();
    }
}
