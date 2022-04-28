import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class BookPane extends JPanel {
	ArrayList<Book> list = new ArrayList<Book>();
	JLabel nameLbl = new JLabel("Title:");
	JLabel authLbl = new JLabel("Author:");
	JTextField nameField = new JTextField(15);
	JTextField authField = new JTextField(15);
	JButton addBtn = new JButton("Add");
	JButton saveBtn = new JButton("Save");
	JPanel firstPan = new JPanel();
	JPanel secondPan = new JPanel();
	JPanel thirdPan = new JPanel();

	//Constructor
	public BookPane() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		firstPan.add(nameLbl);
		firstPan.add(nameField);
		secondPan.add(authLbl);
		secondPan.add(authField);
		thirdPan.add(addBtn);
		thirdPan.add(saveBtn);
		add(firstPan);
		add(secondPan);
		add(thirdPan);
		addBtn.addActionListener(new AddListener());
		saveBtn.addActionListener(new SaveListener());
	}

	private class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			Book book = new Book(nameField.getText(), authField.getText());
			list.add(book);
			System.out.println("Number of Books: " + list.size());
			
		}
	}

	private class SaveListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("book.ser"));
				out.writeObject(list);
				out.close();
			} catch (Exception io) {io.printStackTrace();}

		}
	}
}