package com.ust.ioc2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.ust.ioc.Connection;
import com.ust.ioc.Login;
import com.ust.iocautowiring.B;

public class TestDrawing {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		B b= (B) context.getBean("b");
		System.out.println(b);
		context.registerShutdownHook();
		// TODO Auto-generated method stub
		//BeanFactory factory= new XmlBeanFactory(new FileSystemResource("beans.xml"));// Beanfactory is old
		//Object obj1 = factory.getBean("point1");
		//Object obj2=factory.getBean("point2");
//		Object obj3=factory.getBean("line");
//		Line l2=(Line) obj3;
//		System.out.println(obj3);
//		l2.drawLine();
		// ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");//ClassPathXmlApplicationContex reads the context from classpath.
		//ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");// Application context is more powerful and more implemented.Applicationcontect is inherited by beanfactory, it is the son of beanfactory
//		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
//		context.registerShutdownHook();
//		boolean exists=context.containsBean("line");
//		System.out.println(exists);
//		if(exists)
//		{
//			Object object= context.getBean("line");
//			if(object instanceof Line) {
//				Line line=(Line) object;
//				line.drawLine();
//			}
//			
//		}
//		boolean type= context.isSingleton("line");
//		System.out.println(type);// every bean created by Appication context or beanfactory are by default singleton
		
//		Object object= context.getBean("line");
//		Object object2= context.getBean("line");
//		if(object.hashCode()==object2.hashCode()) {
//			System.out.println("line is singleton");
//		}
//		else {
//			System.out.println("line is not a singleton");
//		}
//	}
	
//		Line line1= (Line) context.getBean("line");
//		Line line2= (Line) context.getBean("line");
//		if(line1.hashCode()==line2.hashCode()) {
//			System.out.println("line is singleton");
//		}
//		else {
//			System.out.println("line is not a singleton");
//		}
	}

}
