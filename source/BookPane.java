import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class BookPane extends JPanel {
	JLabel nameLbl = new JLabel("Title:");
	JLabel authLbl = new JLabel("Author:");
	JTextField nameField = new JTextField(15);
	JTextField authField = new JTextField(15);
	JButton addBtn = new JButton("Add");
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
		add(firstPan);
		add(secondPan);
		add(thirdPan);
		addBtn.addActionListener(new AddListener());
	}

	private class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			Book book = new Book(nameField.getText(), authField.getText());

			try {
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("book.ser"));
				out.writeObject(book);
				out.close();
			} catch (IOException io) {io.getStackTrace();}

		}
	}
}