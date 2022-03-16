package tw.jerry.demo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.model.Phone;

public class Demo11ConfigurationBeanAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Phone phone1 = context.getBean("myPhone", Phone.class);

		System.out.println("phone name: " + phone1.getPhoneName());
		System.out.println("phone name: " + phone1.getPhoneBrand());

		context.close();

	}

}