package tw.jerry.demo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.model.Book;

public class Demo6BookFactoryAction {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Book book3 = context.getBean("marketBook", Book.class);

		System.out.println("book3 id: " + book3.getBookid());
		System.out.println("book3 title" + book3.getBooktitle());

		Book book4 = context.getBean("tcpBook", Book.class);
		System.out.println("book4 id: " + book4.getBookid());
		System.out.println("book4 title" + book4.getBooktitle());

		context.close();

	}
}
