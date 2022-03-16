package tw.jerry.demo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.model.CompanySoGo;

public class Demo9AutowiredAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CompanySoGo sogo = (CompanySoGo) context.getBean("companySoGo");

		sogo.usecard();

		context.close();
	}

}
