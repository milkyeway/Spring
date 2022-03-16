package tw.jerry.demo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.model.LightBean;

public class Demo10PropertiesFileConfigDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		LightBean lightBean = (LightBean) context.getBean("lightBean");

		System.out.println("id: " + lightBean.getId());
		System.out.println("Red: " + lightBean.getRed());
		System.out.println("Green: " + lightBean.getGreen());
		System.out.println("Yellow: " + lightBean.getYellow());

		context.close();
	}

}
