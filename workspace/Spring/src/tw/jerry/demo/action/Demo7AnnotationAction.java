package tw.jerry.demo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.model.Student;

public class Demo7AnnotationAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Student st1 = (Student) context.getBean("student");
		
		st1.setId(1);
		st1.setName("Tom");
		st1.setNickname("Uzra");
		
		System.out.println("Id¡G " + st1.getId());
		System.out.println("Name¡G " + st1.getName());
		System.out.println("Nickname¡G " + st1.getNickname());
		
		context.close();
	}

}
