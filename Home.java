import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose a Data Structure");
		lblNewLabel.setForeground(new Color(255, 128, 192));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 15));
		lblNewLabel.setBounds(151, 10, 212, 21);
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENING CODE HERE
				ArrayJava a =	new ArrayJava();
				a.setVisible(true);
				new ArrayJava().setVisible(true);
			}
		});
		array.setForeground(new Color(255, 0, 0));
		array.setFont(new Font("Constantia", Font.BOLD, 12));
		array.setBounds(181, 51, 73, 23);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK WINDOW OPENING CODE HERE
				Stack s = new Stack();
				s.setVisible(true);
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(new Color(0, 0, 255));
		stack.setFont(new Font("Constantia", Font.BOLD, 12));
		stack.setBounds(51, 99, 71, 23);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW OPENING CODE HERE
				Queue q = new Queue();
				q.setVisible(true);
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(128, 0, 64));
		queue.setFont(new Font("Constantia", Font.BOLD, 12));
		queue.setBounds(344, 99, 75, 23);
		contentPane.add(queue);
		
		JButton cqueue = new JButton("CIRCULAR QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SINGLY LINKEDLIST QUEUE WINDOW OPENING CODE HERE
				CircularQueue cq = new CircularQueue();
				cq.setVisible(true);
				new CircularQueue().setVisible(true);
			}
		});
		cqueue.setFont(new Font("Constantia", Font.BOLD, 12));
		cqueue.setForeground(new Color(255, 128, 64));
		cqueue.setBounds(51, 143, 143, 23);
		contentPane.add(cqueue);
		
		JButton singlylist = new JButton("SINGLY LINKEDLIST");
		singlylist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SinglyLinkedList sl = new SinglyLinkedList();
				sl.setVisible(true);
				new SinglyLinkedList().setVisible(true);
			}
		});
		singlylist.setFont(new Font("Constantia", Font.BOLD, 12));
		singlylist.setForeground(new Color(64, 0, 0));
		singlylist.setBounds(268, 143, 151, 23);
		contentPane.add(singlylist);
		
		JButton ddl = new JButton("DOUBLY LINKEDLIST");
		ddl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DOUBLY LINKEDLIST WINDOW OPENING CODE HERE
				DoublyLinkedList dll = new DoublyLinkedList();
				dll.setVisible(true);
				new DoublyLinkedList().setVisible(true);
			}
		});
		ddl.setFont(new Font("Constantia", Font.BOLD, 12));
		ddl.setForeground(new Color(64, 0, 128));
		ddl.setBounds(167, 185, 159, 23);
		contentPane.add(ddl);
	}
}
