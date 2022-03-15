package tw.jerry.demo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.model.Car;

public class Demo4CarAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Car car1 = (Car) context.getBean("car1");
		
		System.out.println(car1.getCarId());
		System.out.println(car1.getName());
		System.out.println(car1.getBrand());
		System.out.println("=========================");
		
		Car car2 = (Car) context.getBean("car2");
		
		System.out.println("car2 release Date: " + car2.getReleaseDate());
		
		context.close();
		
		context.close();
	}


}