package tw.jerry.demo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.service.LoginService;

public class Demo3LoginServiceAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		LoginService service = context.getBean("loginService", LoginService.class);
		
		boolean result = service.checkLogin("jerry", "pwdd");
		
		System.out.println("result: " + result);
		
		context.close();
	}


}