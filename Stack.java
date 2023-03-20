import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField inputlength;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 496);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(226, 10, 277, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE:");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(82, 62, 187, 20);
		contentPane.add(lblNewLabel_1);
		
		inputlength = new JTextField();
		inputlength.setBounds(302, 60, 143, 20);
		contentPane.add(inputlength);
		inputlength.setColumns(10);
		
		JButton create = new JButton("CREATE STACK");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//STACK CREATION CODE
				size = Integer.valueOf(inputlength.getText());
				s=new int[size];
				String message = "Stack of size" + size + "Created";
				JOptionPane.showMessageDialog(contentPane,message);
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 16));
		create.setForeground(new Color(255, 128, 64));
		create.setBounds(256, 104, 149, 29);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT:");
		lblNewLabel_2.setForeground(new Color(0, 128, 128));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(82, 166, 162, 20);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(256, 158, 116, 27);
		contentPane.add(element);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PUSH CODE HERE
				int elem;
				if(top == size-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Push not possible");
				}
				else {
					elem = Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane,"Push successfull");
					element.setText("");
				}
				
			}
		});
		push.setForeground(new Color(128, 64, 0));
		push.setFont(new Font("Constantia", Font.BOLD, 16));
		push.setBounds(426, 162, 77, 29);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.setForeground(new Color(128, 128, 0));
		pop.setFont(new Font("Constantia", Font.BOLD, 16));
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//POP CODE HERE
				if(top == -1)
				{
					JOptionPane.showMessageDialog(contentPane, "Pop not possible");
				}
				else
				{
					String message = "Element deteted is :" + s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
				}
				
			}
		});
		pop.setBounds(261, 221, 67, 29);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY CODE HERE
				String msg = "";
				if(top == -1)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else {
					for(int i=top; i>=0;i--)
					{
						msg = msg + " " + s[i];
					}
					displaybox.setText(msg);
				}
				
			}
		});
		display.setForeground(new Color(128, 128, 255));
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(256, 286, 101, 29);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(204, 254, 129));
		displaybox.setBounds(153, 361, 364, 29);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
