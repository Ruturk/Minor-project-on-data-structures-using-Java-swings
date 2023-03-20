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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(184, 253, 2));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(185, 10, 245, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE:");
		lblNewLabel_1.setForeground(new Color(86, 105, 169));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(79, 70, 156, 20);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(258, 61, 172, 27);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE QUEUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CREATE QUEUE CODE HERE
				size = Integer.valueOf(length.getText());
				q=new int[size];
				String message = "Queue of size " +  size + " Created";
				JOptionPane.showMessageDialog(contentPane,message);
			}
		});
		btnNewButton.setForeground(new Color(255, 128, 128));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton.setBounds(233, 115, 155, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_2.setForeground(new Color(128, 128, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(29, 167, 166, 20);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(205, 158, 156, 27);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("INSERT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERT CODE HERE
				int elem;
				if(r == size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
				else {
					elem = Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane,"Element inserted successfully");
					element.setText("");
				}
			}
		});
		btnNewButton_1.setForeground(new Color(0, 128, 255));
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_1.setBounds(410, 165, 91, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE CODE HERE
				if(r==-1 || f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "Delete not possible");
				}
				else {
					String message = "Element deleted is :" + q[f];
					JOptionPane.showMessageDialog(contentPane, message);
					++f;
				}
				
			}
		});
		btnNewButton_2.setForeground(new Color(128, 128, 192));
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_2.setBounds(243, 217, 101, 27);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DISPLAY");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY CODE HERE
				String msg = "";
				if(r==-1 || f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else
				{
					for(int i=f; i<=r; i++)
					{
						msg = msg + " " + q[i];
					}
					displaybox.setText(msg);
				}
				
				
			}
		});
		btnNewButton_3.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_3.setBounds(243, 280, 101, 29);
		contentPane.add(btnNewButton_3);
		
		displaybox = new JTextField();
		displaybox.setBounds(119, 361, 350, 29);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
