package kalkulator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kalkulator {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	public String operacija;
	public String broj;
	public String broj2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator window = new Kalkulator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Kalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setForeground(Color.PINK);
		textField.setBounds(26, 25, 383, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String text=textField.getText();
				textField.setText(text+"7");
			}
		});
		btnNewButton.setBounds(10, 90, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=textField.getText();
				textField.setText(text+"8");
			}
		});
		btnNewButton_1.setBounds(123, 90, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=textField.getText();
				textField.setText(text+"9");
			}
		});
		btnNewButton_2.setBounds(236, 90, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String broj=textField.getText();
				textField.setText("");
				String operacija = "zbir";
			}
		});
		btnNewButton_3.setBounds(335, 90, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=textField.getText();
				textField.setText(text+"4");
			}
		});
		btnNewButton_4.setBounds(10, 134, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=textField.getText();
				textField.setText(text+"5");
			}
		});
		btnNewButton_5.setBounds(123, 134, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=textField.getText();
				textField.setText(text+"6");
			}
		});
		btnNewButton_6.setBounds(236, 134, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("-");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String broj=textField.getText();
				textField.setText("");
				String operacija = "razlika";
			}
		});
		btnNewButton_7.setBounds(335, 134, 89, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=textField.getText();
				textField.setText(text+"1");
			}
		});
		btnNewButton_8.setBounds(10, 180, 89, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("2");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=textField.getText();
				textField.setText(text+"2");
			}
		});
		btnNewButton_9.setBounds(123, 180, 89, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=textField.getText();
				textField.setText(text+"3");
			}
		});
		btnNewButton_10.setBounds(236, 180, 89, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("*");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String broj=textField.getText();
				textField.setText("");
				String operacija = "proizvod";
			}
		});
		btnNewButton_11.setBounds(335, 180, 89, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("C");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
			}
		});
		btnNewButton_12.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("0");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=textField.getText();
				textField.setText(text+"0");
			}
		});
		btnNewButton_13.setBounds(123, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String broj2=textField.getText();
				if(operacija == "zbir") {
			     int rez=Integer.parseInt(broj)+Integer.parseInt(broj2);
					textField.setText(rez+"");
				}
				
			}
		});
		btnNewButton_14.setBounds(236, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("/");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String broj=textField.getText();
				textField.setText("");
				String operacija = "kolicnik";
			}
		});
		btnNewButton_15.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_15);
	}
}
