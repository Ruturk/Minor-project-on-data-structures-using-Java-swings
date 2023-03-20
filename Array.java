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

public class ArrayJava extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deletepos;
	private JTextField insertposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayJava frame = new ArrayJava();
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
	public ArrayJava() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 567);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURES");
		lblNewLabel.setForeground(new Color(0, 0, 160));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(170, 25, 289, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH :");
		lblNewLabel_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(104, 90, 188, 20);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(316, 87, 156, 23);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton btn1 = new JButton("CREATE AN ARRAY");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR CREATING AN ARRAY
				String len = length.getText();
				int l = Integer.valueOf(len);
				//int len = Integer.valueOf(length.getText());
				arr = new int[l];
				String message = "Array of length" + l + "Created";
				JOptionPane.showMessageDialog(contentPane,message);
				
			}
		});
		btn1.setForeground(new Color(0, 128, 128));
		btn1.setFont(new Font("Constantia", Font.BOLD, 16));
		btn1.setBounds(250, 139, 177, 29);
		contentPane.add(btn1);
		
		element = new JTextField();
		element.setBounds(258, 204, 87, 26);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INSERTION
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(insertposition.getText());
				arr[pos]=elem;
				String message = "Element " + elem + " Inserted @ position "+ pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
			}
		});
		insert.setForeground(new Color(0, 128, 128));
		insert.setFont(new Font("Constantia", Font.BOLD, 16));
		insert.setBounds(581, 204, 91, 29);
		contentPane.add(insert);
		
		JLabel lblNewLabel_2 = new JLabel("DELETE POSITION");
		lblNewLabel_2.setForeground(new Color(128, 0, 64));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(55, 256, 185, 20);
		contentPane.add(lblNewLabel_2);
		
		deletepos = new JTextField();
		deletepos.setBounds(258, 254, 87, 27);
		contentPane.add(deletepos);
		deletepos.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("INSERT AN INTEGER ELEMENT");
		lblNewLabel_3.setForeground(new Color(255, 128, 0));
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 203, 238, 27);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("POSITION");
		lblNewLabel_4.setForeground(new Color(128, 128, 0));
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_4.setBounds(363, 203, 87, 27);
		contentPane.add(lblNewLabel_4);
		
		insertposition = new JTextField();
		insertposition.setBounds(455, 204, 104, 26);
		contentPane.add(insertposition);
		insertposition.setColumns(10);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETION
				int pos = Integer.valueOf(deletepos.getText());
				arr[pos] = 0;
				String message = "Element Deleted @ the position " +pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deletepos.setText("");
				
			}
		});
		btnDelete.setForeground(new Color(0, 128, 128));
		btnDelete.setFont(new Font("Constantia", Font.BOLD, 16));
		btnDelete.setBounds(381, 254, 93, 29);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY
				String msg ="";
				for(int i=0; i<=arr.length-1;i++)
				{
					msg=msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		btnDisplay.setForeground(new Color(0, 128, 128));
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 16));
		btnDisplay.setBounds(292, 314, 101, 29);
		contentPane.add(btnDisplay);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(211, 252, 252));
		displaybox.setBounds(123, 398, 450, 38);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
