package tw.jerry.demo.action;

import tw.jerry.demo.model.EnglishTeacher;
import tw.jerry.demo.model.Teacher;

public class TeacherAction {

	public static void main(String[] args) {
		Teacher teacher = new EnglishTeacher();
		teacher.teach("單字教學");

	}

}