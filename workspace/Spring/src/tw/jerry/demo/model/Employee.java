package tw.jerry.demo.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Employee implements InitializingBean {

	private int id;

	private String name;

	private int vacation;

	public Employee() {
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
//	@PostConstruct
//	public void initial() {
//		vacation = 3;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVacation() {
		return vacation;
	}

	public void setVacation(int vacation) {
		this.vacation = vacation;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		vacation = 3;
	}

}