package tw.jerry.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LightBean {

	@Value("#{props.id}")
	private Integer id;
	
	@Value("#{props.red}")
	private Integer red;
	
	@Value("#{props.green}")
	private Integer green;
	
	@Value("#{props.yellow}")
	private Integer yellow;

	public LightBean() {
	}

	public LightBean(Integer id, Integer red, Integer green, Integer yellow) {
		super();
		this.id = id;
		this.red = red;
		this.green = green;
		this.yellow = yellow;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRed() {
		return red;
	}

	public void setRed(Integer red) {
		this.red = red;
	}

	public Integer getGreen() {
		return green;
	}

	public void setGreen(Integer green) {
		this.green = green;
	}

	public Integer getYellow() {
		return yellow;
	}

	public void setYellow(Integer yellow) {
		this.yellow = yellow;
	}

}