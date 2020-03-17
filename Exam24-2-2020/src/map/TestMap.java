package map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {

	public static void main(String[] args) 
	{
				ApplicationContext context=new ClassPathXmlApplicationContext("map.xml");
				 Maptest m=(Maptest) context.getBean("map");
				m.displayAnswers();
	}

}
