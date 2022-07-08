package com.sachin.SpringMVCDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//    	BeanFactory bf = new XmlBeanFactory(new FileSystemResource("spring.xml"));

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

//		Alien obj = ctx.getBean(Alien.class);
		Alien obj1 = (Alien) ctx.getBean("alien");
		obj1.code();
		System.out.println(obj1.getAge());
		// or
//        
//        Alien obj = (Alien) ctx.getBean("alien");
//        
//        obj.code();

//    	 Alien obj1 = ctx.getBean(Alien.class);
//    	 
//    	obj1.code();
//    	
//    	//setter Injection
//    	int a = obj1.getAge();
//    	System.out.println(a);

	}
}
