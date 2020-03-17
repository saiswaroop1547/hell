package beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) 
	{
				// TODO Auto-generated method stub
				ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
				Employee e=(Employee) ap.getBean("emp");
				System.out.println("Employee Name is:"+e.getName());
				System.out.println("Employee Department is:"+e.getDept());
	}

}
