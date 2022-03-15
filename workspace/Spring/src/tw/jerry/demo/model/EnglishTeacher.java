package tw.jerry.demo.model;

public class EnglishTeacher implements Teacher {

	public EnglishTeacher() {
	}

	@Override
	public void teach(String content) {
		System.out.println("Teach English" + content);

	}

}