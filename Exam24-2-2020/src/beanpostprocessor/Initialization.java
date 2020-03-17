package beanpostprocessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Initialization implements BeanPostProcessor 
{
public Object postProcessBeforeInitialization(Object bean,String beanName)
throws BeansException{
	System.out.println("before init");
	return bean;
	
}
public Object postProcessAfterInitialization(Object bean,String beanName)
throws BeansException{
	System.out.println("After init");
	return bean;
	
}
}
