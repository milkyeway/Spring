package tw.jerry.demo.model;

public class Phone {

	private int id;

	private String phoneName;

	private String phoneBrand;

	public Phone() {
	}

	public Phone(int id, String phoneName, String phoneBrand) {
		super();
		this.id = id;
		this.phoneName = phoneName;
		this.phoneBrand = phoneBrand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public String getPhoneBrand() {
		return phoneBrand;
	}

	public void setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
	}

}