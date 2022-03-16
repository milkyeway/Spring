package tw.jerry.demo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.model.CredictCard;

public class Demo8ComponentAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		CredictCard card = (CredictCard) context.getBean("credictCardHappy");
		
		card.useCard(" ¶RªF¦è");
		
		context.close();
	}

}
