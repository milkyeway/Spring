package tw.jerry.demo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.model.Book;

public class Demo5BookStaticFactoryAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Book javaBook = context.getBean("javaBook", Book.class);

		System.out.println(javaBook.getBooktitle());

		context.close();
	}

}
