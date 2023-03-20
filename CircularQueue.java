import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 508);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(210, 251, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 21));
		lblNewLabel.setBounds(114, 10, 389, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE :");
		lblNewLabel_1.setForeground(new Color(230, 165, 153));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(75, 77, 160, 20);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(257, 69, 170, 26);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE QUEUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR CREATING A QUEUE
				size = Integer.valueOf(length.getText());
				cq=new int[size];
				String message = "Queue of size " +  size + " Created";
				JOptionPane.showMessageDialog(contentPane,message);
				
			}
		});
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setBounds(196, 124, 155, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(43, 195, 166, 20);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(227, 189, 117, 26);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("INSERT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERT ELEMENT TO QUEUE CODE HERE 
				if(count==size)
				{
					JOptionPane.showMessageDialog(contentPane,"Insertion is not possible");
				}
				else
				{
					int elem = Integer.valueOf(element.getText()); 
					r=(r+1)%size;
					cq[r]=elem;
					count++;
					JOptionPane.showMessageDialog(contentPane,"Element inserted successfully");
					element.setText("");
				}
			}
			
		});
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_1.setBounds(376, 186, 91, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE TO DELETE ELEMENT IN QUEUE
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else
				{
					String message = "Element deleted is :" + cq[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f=(f+1)%size;
					count--;
				}
				
			}
		});
		btnNewButton_2.setForeground(new Color(255, 128, 128));
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_2.setBounds(223, 253, 93, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DISPLAY");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY ELEMENTS IN A QUEUE
				int f1=f;
				String msg = "";
				if(count==0)
				{
					
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else
				{
					for(int i=1; i<=count; i++)
					{
						msg = msg + " " + cq[f1];
						f1 = (f1+1)%size;
					}
					displaybox.setText(msg);
				}
				
			}
		});
		btnNewButton_3.setForeground(new Color(0, 64, 0));
		btnNewButton_3.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_3.setBounds(223, 315, 101, 29);
		contentPane.add(btnNewButton_3);
		
		displaybox = new JTextField();
		displaybox.setBounds(124, 386, 359, 29);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
