import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.JTabbedPane;

public class GUIInterface {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIInterface window = new GUIInterface();
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
	public GUIInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 633, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.BLACK);
		panel.setBounds(10, 10, 331, 209);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(165, 8, 129, 40);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 58, 129, 40);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAccountno = new JLabel("Account.NO");
		lblAccountno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAccountno.setBounds(26, 8, 119, 40);
		panel.add(lblAccountno);
		
		JLabel lblAmount = new JLabel("AMOUNT");
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAmount.setBounds(26, 58, 106, 40);
		panel.add(lblAmount);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(351, 10, 258, 209);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(351, 229, 258, 163);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblImage = new JLabel("mudit");
		Image img = new ImageIcon(this.getClass().getResource("/images.jpg")).getImage().getScaledInstance(258, 163, Image.SCALE_DEFAULT);
		lblImage.setIcon(new ImageIcon(img));
		lblImage.setBounds(new Rectangle(0, 0, 258, 163));
		
		panel_3.add(lblImage);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(259, 229, 82, 163);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_10 = new JButton("ENTER");
		panel_4.add(btnNewButton_10);
		
		JButton btnCancel = new JButton("CANCEL");
		panel_4.add(btnCancel);
		
		JButton btnClear = new JButton("CLEAR");
		panel_4.add(btnClear);
		
		JButton btnOk = new JButton("OK");
		panel_4.add(btnOk);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(10, 225, 243, 167);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("3");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("4");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_3 = new JButton("7");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_7 = new JButton("8");
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		panel_1.add(btnNewButton_8);
		
		JButton button = new JButton(".");
		panel_1.add(button);
		
		JButton btnNewButton_9 = new JButton("0");
		panel_1.add(btnNewButton_9);
		
		JButton button_1 = new JButton("00");
		panel_1.add(button_1);
	}
}
