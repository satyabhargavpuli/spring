package info.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App 
{
	
	@Autowired
    public void m1(Employee employee) {
		employee.m1();
		System.out.println("eggg");
		
	}

	public static void main( String[] args )
    {
    App app = new App();

    }
}
