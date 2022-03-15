package tw.jerry.demo.model;

import java.util.Date;

public class Car {

	public Car() {
	}

	private Integer carId ;
	
	private String name;
	
	private String brand;

	private Date releaseDate;
	
	public Car(Date releaseDate) {
		super();
		this.setReleaseDate(releaseDate);
	}

	public Car(Integer carId, String name, String brand) {
		super();
		this.carId = carId;
		this.name = name;
		this.brand = brand;
	}

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
}
