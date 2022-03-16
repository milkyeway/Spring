package tw.jerry.demo.model;

import org.springframework.stereotype.Component;

@Component
public class CredictCardHappy implements CredictCard {

	public CredictCardHappy() {
	}

	@Override
	public void useCard(String message) {
		System.out.println("Happy Card ¡G" + message);
	}

}