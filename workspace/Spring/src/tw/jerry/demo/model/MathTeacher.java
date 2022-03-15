package tw.jerry.demo.model;

public class MathTeacher implements Teacher {

	public MathTeacher() {
	}

	@Override
	public void teach(String content) {
		System.out.println("數學教學" + content);

	}

}