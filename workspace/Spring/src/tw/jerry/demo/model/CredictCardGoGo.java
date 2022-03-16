package tw.jerry.demo.model;

import org.springframework.stereotype.Component;

@Component
public class CredictCardGoGo implements CredictCard {

	public CredictCardGoGo() {
	}

	@Override
	public void useCard(String message) {
		System.out.println("GoGo Card ¡G" + message);
	}

}