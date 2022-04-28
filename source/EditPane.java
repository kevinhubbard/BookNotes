import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class EditPane extends JPanel {
	ArrayList<Book> loadList = new ArrayList<Book>();
	JComboBox bookList = new JComboBox();
	JLabel loadLbl = new JLabel("Choose book to edit:");
	JLabel editLbl = new JLabel("Edit");
	JPanel loadPane = new JPanel();
	JPanel editPane = new JPanel();

	public void setupLoadPanel() {
		loadPane.setBackground(Color.GREEN);
		loadPane.add(loadLbl);
		loadPane.add(bookList);
	}

	public void setupEditPanel() {
		editPane.setBackground(Color.RED);
		editPane.add(editLbl);
	}

	public void loadBooks() {
		try {
			FileInputStream fis = new FileInputStream("book.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			while (true) {
				Book b = (Book) ois.readObject();
				loadList.add(b);
			}
		} catch (Exception e) {e.printStackTrace();}
		System.out.println("inside loadbooks:" + loadList.size());
	}
	
	//Constructor
	public EditPane() {
		loadBooks();
		setupLoadPanel();
		setupEditPanel();
		setLayout(new BorderLayout());
		add(loadPane, BorderLayout.PAGE_START);
		add(editPane, BorderLayout.CENTER);
	}
}