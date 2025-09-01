package com.tnsif.SampleSpring;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext var = new ClassPathXmlApplicationContext("ApplicationContext.xml"); 
        Customers c1=var.getBean("customer1",Customers.class);
        c1.order();
        
    }
}
