import java.util.*;
import java.io.*;

public class Book implements Serializable {
	private String title;
	private String author;
	private ArrayList<Chapter> chapters;

	public Book(String t, String a) {
		setTitle(t);
		setAuthor(a);
	}

	public void addChapter(String n, String s) {
		Chapter c = new Chapter(n,s);
		chapters.add(c);
	}
	
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void setTitle(String s) {
		title = s;
	}

	public void setAuthor(String n) {
		author = n;
	}

}