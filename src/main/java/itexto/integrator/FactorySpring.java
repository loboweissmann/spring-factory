package itexto.integrator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactorySpring {
	
	private final ApplicationContext applicationContext;
	
	public FactorySpring() {
		applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
	}
	
	public Integrador create(String nome) {
		return applicationContext.getBean("integrador" + nome, Integrador.class);
	}
	
	public String toString() {
		return "Spring";
	}
	
}
