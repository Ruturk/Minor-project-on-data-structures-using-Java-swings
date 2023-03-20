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

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element;
	private JTextField element2;
	private JTextField displaybox;
	class Node{
		int data;
		Node link;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(220, 72, 35));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 21));
		lblNewLabel.setBounds(151, 22, 386, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1.setForeground(new Color(128, 128, 192));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(22, 85, 177, 20);
		contentPane.add(lblNewLabel_1);
		
		element = new JTextField();
		element.setBounds(239, 74, 137, 29);
		contentPane.add(element);
		element.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_2.setForeground(new Color(128, 128, 192));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(22, 147, 177, 20);
		contentPane.add(lblNewLabel_2);
		
		element2 = new JTextField();
		element2.setBounds(239, 136, 137, 29);
		contentPane.add(element2);
		element2.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERT REAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// INSERT AT REAR CODE HERE
					Node temp;
					int elem = Integer.valueOf(element.getText());
					Node newnode = new Node();
					newnode.data=elem;
					newnode.link=null;
					if(first == null)
					{
						first = newnode;
						String msg = "Element inserted is :" + first.data;
						JOptionPane.showMessageDialog(contentPane,msg);
						element.setText("");
					}
					else
					{
						temp = first;
						while(temp.link != null)
						{
							temp = temp.link;
						}
						temp.link=newnode;
						String msg = "Element inserted is :" + temp.data;
						JOptionPane.showMessageDialog(contentPane,msg);
						element.setText("");
					}
				}
				
		});
		btnNewButton.setForeground(new Color(128, 64, 0));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton.setBounds(463, 69, 137, 36);
		contentPane.add(btnNewButton);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERT AT FRONT CODE
				Node temp;
				int elem = Integer.valueOf(element2.getText());
				Node newnode = new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.link=first;
					first=newnode;
					String msg = "Element inserted is :" + first.data;
					JOptionPane.showMessageDialog(contentPane,msg);
					element2.setText("");
				}
			}
		});
		btnInsertFront.setForeground(new Color(128, 64, 0));
		btnInsertFront.setFont(new Font("Constantia", Font.BOLD, 16));
		btnInsertFront.setBounds(463, 131, 149, 36);
		contentPane.add(btnInsertFront);
		
		JButton btnNewButton_1 = new JButton("DELETE REAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE AT REAR END CODE
				Node temp;
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link == null)
				{
					String msg = "Element deleted is : " + first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.link.link != null)
					{
						temp=temp.link;
					}
					String msg = "Element deleted is : " +temp.link.data;
					JOptionPane.showMessageDialog(contentPane,msg);
					temp.link=null;
				}
				
			}
		});
		btnNewButton_1.setForeground(new Color(255, 128, 64));
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_1.setBounds(239, 207, 149, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("DELETE FRONT");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE AT FRONT END CODE
				if(first == null)
				{
					System.out.println("Deletion not possible");
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link == null)
				{
					String msg = "Element deleted is : " +first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
				}
				else
				{
					String msg  = "element deleted is : " + first.data;
					JOptionPane.showMessageDialog(contentPane,msg);
					first=first.link;
				}
				
			}
		});
		btnNewButton_1_1.setForeground(new Color(255, 128, 64));
		btnNewButton_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_1_1.setBounds(239, 268, 161, 36);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("DISPLAY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY CODE HERE
				String msg =" ";
				Node temp;
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.link == null)
				{
					msg = msg + " " + first.data;
					displaybox.setText(msg);
				}
				else
				{
					temp=first;
					while(temp != null)
					{
					    msg = msg + " " + temp.data;
						temp=temp.link;
					}
					displaybox.setText(msg);
				}
				
			}
		});
		btnNewButton_2.setForeground(new Color(0, 128, 0));
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_2.setBounds(273, 340, 107, 29);
		contentPane.add(btnNewButton_2);
		
		displaybox = new JTextField();
		displaybox.setBounds(151, 405, 386, 29);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
