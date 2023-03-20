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

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element;
	private JTextField element2;
	private JTextField displaybox;
	class Node{
		int data;
		Node prelink;
		Node nextlink;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 21));
		lblNewLabel.setBounds(132, 10, 393, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 79, 177, 20);
		contentPane.add(lblNewLabel_1);
		
		element = new JTextField();
		element.setBounds(227, 68, 125, 29);
		contentPane.add(element);
		element.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(10, 140, 177, 20);
		contentPane.add(lblNewLabel_1_1);
		
		element2 = new JTextField();
		element2.setColumns(10);
		element2.setBounds(227, 131, 125, 29);
		contentPane.add(element2);
		
		JButton btnNewButton = new JButton("INSERT REAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERT REAR CODE
				Node temp;
				int elem = Integer.valueOf(element.getText());
				Node newnode = new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first == null)
				{
					first = newnode;
					String msg = "Element inserted at Rear is : " + first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					element.setText("");
				}
				else {
					temp=first;
					while(temp.nextlink != null)
					{
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
					String msg1 = "Element inserted at Rear is : " + newnode.data;
					JOptionPane.showMessageDialog(contentPane, msg1);
					element.setText("");
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 128, 64));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton.setBounds(403, 68, 143, 33);
		contentPane.add(btnNewButton);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERT FRONT CODE
				int elem = Integer.valueOf(element2.getText());
				Node newnode = new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first == null)
				{
					first = newnode;
					String msg = "Element inserted at front is : " + first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					element2.setText("");
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
					String msg1 = "Element inserted at front is : " + first.data;
					JOptionPane.showMessageDialog(contentPane, msg1);
					element2.setText("");
				}
			}
		});
		btnInsertFront.setForeground(new Color(255, 128, 64));
		btnInsertFront.setFont(new Font("Constantia", Font.BOLD, 16));
		btnInsertFront.setBounds(403, 140, 149, 31);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE REAR CODE
				Node temp;
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane,"Deletion not possible");
				}
				else if(first.nextlink == null)
				{
					String msg = "Element deleted is : " + first.data;
					first = null;
					JOptionPane.showMessageDialog(contentPane,msg);
				}
				else
				{
					temp=first;
					while(temp.nextlink.nextlink != null)
					{
						temp=temp.nextlink;
					}
					String msg1 = "Element deleted is : " +temp.nextlink.data;
					temp.nextlink=null;
					JOptionPane.showMessageDialog(contentPane,msg1);
				}
				
			}
		});
		btnDeleteRear.setForeground(new Color(0, 128, 128));
		btnDeleteRear.setFont(new Font("Constantia", Font.BOLD, 16));
		btnDeleteRear.setBounds(214, 198, 143, 33);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE FRONT CODE
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.nextlink == null)
				{
					first = null;
					String msg = "Element deleted is : " +first.data;
					
					JOptionPane.showMessageDialog(contentPane, msg);
					
				}
				else
				{
					first = first.nextlink;
					String msg1 = "Element deleted is : " +first.prelink.data;
					JOptionPane.showMessageDialog(contentPane, msg1);
					first.prelink=null;
				}
				
			}
		});
		btnDeleteFront.setForeground(new Color(0, 128, 128));
		btnDeleteFront.setFont(new Font("Constantia", Font.BOLD, 16));
		btnDeleteFront.setBounds(214, 258, 153, 33);
		contentPane.add(btnDeleteFront);
		
		JButton btnDisplayForward = new JButton("DISPLAY FORWARD");
		btnDisplayForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY FORWARD CODE
				Node temp;
				String msg = "";
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
				}
				else if(first.nextlink == null)
				{
					msg = msg + " "+ first.data;
					displaybox.setText(msg);
				}
				else
				{
					temp=first;
					while(temp != null)
					{
						msg = msg + " " + temp.data +" ";
						temp = temp.nextlink;
					}
					displaybox.setText(msg);
				}
				
			}
			
		});
		btnDisplayForward.setForeground(new Color(64, 0, 0));
		btnDisplayForward.setFont(new Font("Constantia", Font.BOLD, 16));
		btnDisplayForward.setBounds(92, 329, 189, 33);
		contentPane.add(btnDisplayForward);
		
		JButton btnDisplayReverse = new JButton("DISPLAY REVERSE");
		btnDisplayReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY REVERSE CODE
				Node temp;
				String msg = "";
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.nextlink == null)
				{
					msg = msg + " " + first.data;
					displaybox.setText(msg);
				}
				else
				{
					temp=first;
					while(temp.nextlink != null)
					{
						temp = temp.nextlink;
					}
					while(temp != null)
					{
						msg = msg + " "  +temp.data + " ";
						temp = temp.prelink;
					}
					displaybox.setText(msg);
				}
				
				
			}
		});
		btnDisplayReverse.setForeground(new Color(64, 0, 0));
		btnDisplayReverse.setFont(new Font("Constantia", Font.BOLD, 16));
		btnDisplayReverse.setBounds(336, 329, 189, 33);
		contentPane.add(btnDisplayReverse);
		
		displaybox = new JTextField();
		displaybox.setBounds(92, 414, 433, 39);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
