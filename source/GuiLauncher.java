import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class GuiLauncher {
	JFrame frame = new JFrame("Book Notes");
	JPanel optionPane = new JPanel();
	private CardLayout cl;
	private JPanel cardPanel;


	public JPanel createTopPanel() {
		JButton addBook = new JButton("Add Book");
		JButton loadBook = new JButton("Load Book");
		JButton editBook = new JButton("Edit Book");
		optionPane.add(addBook);
		optionPane.add(loadBook);
		optionPane.add(editBook);
		addBook.addActionListener(new AddListener());
		loadBook.addActionListener(new LoadListener());
		editBook.addActionListener(new EditListener());

		return optionPane;
	}

	public JPanel viewPanel() {
		cardPanel = new JPanel();
		cl = new CardLayout();
		cardPanel.setLayout(cl);
		BookPane bp = new BookPane();
		LoadPane lp = new LoadPane();
		EditPane ep = new EditPane();
		cardPanel.add(bp, "1");
		cardPanel.add(lp, "2");
		cardPanel.add(ep, "3");

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
	public class LoadListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("load");
			cl.show(cardPanel, "2");
		}
	}
	public class EditListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("edit");
			cl.show(cardPanel, "3");
		}
	}	
}