package tw.jerry.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tw.jerry.demo.model.Phone;

@Configuration
public class SpringAppConfig {

	@Bean("myPhone")
	public Phone myPhone() {
		return new Phone(1, "iPhone12", "Apple");
	}

}