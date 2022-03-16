package tw.jerry.demo.model;

public class Book {

	private int bookid;

	private String booktitle;

	public Book() {
	}

	public Book(int bookid, String booktitle) {
		super();
		this.bookid = bookid;
		this.booktitle = booktitle;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
}
