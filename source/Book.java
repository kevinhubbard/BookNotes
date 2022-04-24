import java.util.*;

public class Book {
	private String title;
	private String numOfChapters;
	private ArrayList<Chapter> chapters;

	public Book(String t, String n) {
		setBookName(t);
		setNumOfChapters(n);
	}

	public void addChapter(String n, String s) {
		Chapter c = new Chapter(n,s);
		chapters.add(c);
	}
	
	public String getBookName() {
		return title;
	}

	public String getNumOfChapters() {
		return numOfChapters;
	}

	public void setBookName(String s) {
		title = s;
	}

	public void setNumOfChapters(String n) {
		numOfChapters = n;
	}

}