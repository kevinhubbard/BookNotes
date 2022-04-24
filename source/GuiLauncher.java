import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class GuiLauncher {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Lets create a book.");

		System.out.println("Enter a Book Title:");
		String title = s.nextLine();
		System.out.println("Enter number of Chapters:");
		String chap = s.nextLine();
		Book one = new Book(title, chap);

		System.out.println(one.getBookName());
		System.out.println(one.getNumOfChapters());
	}
}