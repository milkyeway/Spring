package tw.jerry.demo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.service.LoginService;

public class Demo3LoginServiceAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		建構子注入
		LoginService service = context.getBean("loginService", LoginService.class);
		
		boolean result = service.checkLogin("jerry", "pwdd");
		
		System.out.println("result: " + result);

//		Setter注入
		LoginService service2 =(LoginService) context.getBean("loginService");
		
		boolean result2 = service2.checkLogin("jerry", "pwdd");
		
		System.out.println("result2: " + result2);
		
		context.close();
	}


}