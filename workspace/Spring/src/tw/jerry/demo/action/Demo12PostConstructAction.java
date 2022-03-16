package tw.jerry.demo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.model.Employee;

public class Demo12PostConstructAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee emp = context.getBean("employee", Employee.class);

		emp.setId(1);
		emp.setName("Mary");

		System.out.println("id: " + emp.getId());
		System.out.println("name: " + emp.getName());
		System.out.println("vacation: " + emp.getVacation() + " Day");

		context.close();

	}

}
