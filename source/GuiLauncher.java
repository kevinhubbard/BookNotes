import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class GuiLauncher {
	private JFrame frame = new JFrame("Book Notes");
	private JPanel optionPane = new JPanel();
	private CardLayout cl;
	private JPanel cardPanel;

	public static void main(String[] args) {
		GuiLauncher launch = new GuiLauncher();
		launch.createGui();
	}


	public JPanel createTopPanel() {
		JButton addBook = new JButton("Add Book");
		JButton editBook = new JButton("Edit Book");
		optionPane.add(addBook);
		optionPane.add(editBook);
		addBook.addActionListener(new AddListener());
		editBook.addActionListener(new EditListener());

		return optionPane;
	}

	public JPanel viewPanel() {
		cardPanel = new JPanel();
		cl = new CardLayout();
		cardPanel.setLayout(cl);
		BookPane bp = new BookPane();
		EditPane ep = new EditPane();
		cardPanel.add(bp, "1");
		cardPanel.add(ep, "2");

		return cardPanel;
	}

	public void createGui() {
		frame.setSize(new Dimension(500,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.NORTH, createTopPanel());
		frame.getContentPane().add(BorderLayout.CENTER, viewPanel());
		frame.setVisible(true);
	}

		public static void main(String[] args) {
		GuiLauncher launch = new GuiLauncher();
		launch.createGui();
	}

	public class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("add");
			cl.show(cardPanel, "1");
		}
	}

	public class EditListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("edit");
			cl.show(cardPanel, "2");
		}
	}	
}