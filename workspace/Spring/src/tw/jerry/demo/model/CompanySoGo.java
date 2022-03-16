package tw.jerry.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CompanySoGo {

	@Autowired
	@Qualifier(value = "credictCardHappy")
	private CredictCard credictCard;

	public CompanySoGo() {
	}
	
	public void usecard() {
		credictCard.useCard("¨Ó SoGo ¨ê¥d°e«B³Ê");
	}

}
