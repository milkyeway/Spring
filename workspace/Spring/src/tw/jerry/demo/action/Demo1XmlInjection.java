package tw.jerry.demo.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.model.Teacher;

public class Demo1XmlInjection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Teacher teacher = (Teacher) context.getBean("teacher1");
//		Teacher teacher2 = context.getBean("teacher1", Teacher.class);
		teacher.teach(" ±Â½Ò");
		
		String str1 = (String) context.getBean("string0");
		System.out.println("str1:" + str1);
		
        ((ConfigurableApplicationContext)context).close();

	}

}