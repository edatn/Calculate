package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.UIManager;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Cursor;
import java.awt.SystemColor;

public class Calculator {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
			// TODO: handle exception
			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.window);
		frame.getContentPane().setForeground(SystemColor.window);
		frame.setBounds(500, 100, 285, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);
		
	    value1 = new JTextPane();
	    value1.setBounds(196, 22, 47, 33);
	    value1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		value1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		value1.setBorder(null);
		frame.getContentPane().add(value1);
		
	    value2 = new JTextPane();
	    value2.setBounds(36, 66, 207, 27);
	    value2.setToolTipText("");
	    value2.setFocusable(false);
	    value2.setFocusTraversalKeysEnabled(false);
	    value2.setFocusCycleRoot(false);
	    value2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		value2.setBorder(null);
		frame.getContentPane().add(value2);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(28, 11, 222, 89);
		editorPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		editorPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(editorPane);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.setBackground(new Color(51, 102, 102));
		btnNewButton.setBounds(28, 131, 47, 33);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value2.setText(value2.getText()+ 9);
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("6");
		btnNewButton_1.setBackground(new Color(51, 102, 102));
		btnNewButton_1.setBounds(28, 175, 47, 33);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value2.setText(value2.getText()+ 6);
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBackground(new Color(51, 102, 102));
		btnNewButton_2.setBounds(28, 219, 47, 33);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value2.setText(value2.getText()+ 3);
			}
		});
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("8");
		btnNewButton_3.setBackground(new Color(51, 102, 102));
		btnNewButton_3.setBounds(85, 131, 47, 33);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value2.setText(value2.getText()+ 8);
			}
		});
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBackground(new Color(51, 102, 102));
		btnNewButton_4.setBounds(85, 175, 47, 33);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value2.setText(value2.getText()+ 5);
			}
		});
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("2");
		btnNewButton_5.setBackground(new Color(51, 102, 102));
		btnNewButton_5.setBounds(85, 219, 47, 33);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value2.setText(value2.getText()+ 2);
				}
		});
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("0");
		btnNewButton_6.setBackground(new Color(51, 102, 102));
		btnNewButton_6.setBounds(28, 263, 104, 33);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value2.setText(value2.getText()+ 0);
			}
		});
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("7");
		btnNewButton_8.setBackground(new Color(51, 102, 102));
		btnNewButton_8.setBounds(142, 131, 47, 33);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value2.setText(value2.getText()+ 7);
			}
		});
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("4");
		btnNewButton_9.setBackground(new Color(51, 102, 102));
		btnNewButton_9.setBounds(142, 175, 47, 33);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value2.setText(value2.getText()+ 4);
			}
		});
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("1");
		btnNewButton_10.setBackground(new Color(51, 102, 102));
		btnNewButton_10.setBounds(142, 219, 47, 33);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 1);
			}
		});
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.setBackground(new Color(135, 206, 250));
		btnNewButton_11.setForeground(new Color(0, 0, 0));
		btnNewButton_11.setBounds(142, 263, 47, 33);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int one=Integer.parseInt(value1.getText());
				int two=Integer.parseInt(value2.getText());
				if(ActionRecived.getText().equals("sub")){
					int sub=one-two;
					value2.setText(String.valueOf(sub));
				}if(ActionRecived.getText().equals("add")){
					int add=one+two;
					value2.setText(String.valueOf(add));
				}if(ActionRecived.getText().equals("div")){
					int div=one/two;
					value2.setText(String.valueOf(div));
				}if(ActionRecived.getText().equals("mul")){
					int mul=one*two;
					value2.setText(String.valueOf(mul));
				}
			}
		});
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.setBackground(new Color(135, 206, 250));
		btnNewButton_12.setBounds(199, 131, 47, 33);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				ActionRecived.setText("add");
				value2.setText(null);
			}
		});
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.setBackground(new Color(135, 206, 250));
		btnNewButton_13.setBounds(199, 175, 47, 33);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				ActionRecived.setText("sub");
				value2.setText(null);
			}
		});
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("*");
		btnNewButton_14.setBackground(new Color(135, 206, 250));
		btnNewButton_14.setBounds(199, 219, 47, 33);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	       		value1.setText(value2.getText());
			   ActionRecived.setText("mul");
				value2.setText(null);
				}
		});
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.setBackground(new Color(135, 206, 250));
		btnNewButton_15.setBounds(199, 263, 47, 33);
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				ActionRecived.setText("div");
				value2.setText(null);
			}
		});
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_7 = new JButton("C");
		btnNewButton_7.setBackground(new Color(135, 206, 250));
		btnNewButton_7.setBounds(199, 311, 44, 33);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value1.setText(null);
				value2.setText(null);
				ActionRecived.setText(null);
			}
		});
		frame.getContentPane().add(btnNewButton_7);
		
	   ActionRecived = new JLabel("");
	   ActionRecived.setBounds(169, 104, 81, 17);
	   ActionRecived.setForeground(SystemColor.control);
		frame.getContentPane().add(ActionRecived);
	}
	private JLabel ActionRecived;
	private JTextPane value1;
	private JTextPane value2;
}
