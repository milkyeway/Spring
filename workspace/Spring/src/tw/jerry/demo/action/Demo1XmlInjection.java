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
		teacher.teach(" 授課");
		
        ((ConfigurableApplicationContext)context).close();

	}

}