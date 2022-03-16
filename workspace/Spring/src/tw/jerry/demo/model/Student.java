package tw.jerry.demo.model;

import org.springframework.stereotype.Component;

@Component //可不用指定ID 預設小寫 class名
public class Student {

	private Integer id;

	private String name;

	private String nickname;

	public Student() {
	}

	public Student(Integer id, String name, String nickname) {
		super();
		this.id = id;
		this.name = name;
		this.nickname = nickname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}
