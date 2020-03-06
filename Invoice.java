package crm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JCheckBox;

public class Invoice extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField textField_1;
	private JLabel label_4;
	private JLabel label_5;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JLabel lblAddress;
	private JLabel lblAddress_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblCustomerAddress;
	private JLabel lblShippingAddress;
	private JLabel lblAddress_2;
	private JTextField textField_8;
	private JTable table;
	private JLabel lblAddress_3;
	private JTextField textField_9;
	private JLabel lblPincode;
	private JTextField textField_10;
	private JLabel label_6;
	private JTextField textField_11;
	private JLabel lblState;
	private JTextField textField_12;
	private JLabel label_7;
	private JTextField textField_13;
	private JButton btnPrint;
	private JLabel lblCreateInvoice;
	private JButton btnCustomerRelationshipManagment;
	private JTable table_1;
	private JLabel lblSubtotal;
	private JTextField textField_14;
	private JLabel lblGst;
	private JTextField textField_15;
	private JLabel lblTotal;
	private JTextField textField_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Invoice frame = new Invoice();
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
	public Invoice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1064, 788);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setBounds(184, 128, 250, 30);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(184, 174, 250, 30);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(184, 221, 250, 30);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_6.setColumns(10);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(184, 262, 250, 30);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_7.setColumns(10);
		contentPane.add(textField_7);
		
		label = new JLabel("Mobile No");
		label.setBounds(10, 228, 129, 18);
		label.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(label);
		
		label_1 = new JLabel("Email-ID");
		label_1.setBounds(10, 279, 129, 18);
		label_1.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(label_1);
		
		label_2 = new JLabel("Customer Name");
		label_2.setBounds(10, 180, 129, 14);
		label_2.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(label_2);
		
		label_3 = new JLabel("Sales Order No");
		label_3.setBounds(10, 135, 129, 18);
		label_3.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(823, 145, 105, 30);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		label_4 = new JLabel("Invoice No");
		label_4.setBounds(709, 149, 122, 25);
		label_4.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(label_4);
		
		label_5 = new JLabel("Invoice Date");
		label_5.setBounds(709, 112, 122, 25);
		label_5.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(label_5);
		
		btnNewButton = new JButton("HOME");
		btnNewButton.setBounds(0, 57, 122, 25);
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("CAMPAIGNS");
		btnNewButton_1.setBounds(120, 57, 122, 25);
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("LEADS");
		btnNewButton_2.setBounds(237, 57, 122, 25);
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("QUOTES");
		btnNewButton_3.setBounds(358, 57, 122, 25);
		btnNewButton_3.setFont(new Font("Constantia", Font.BOLD, 13));
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("SALES ORDER");
		btnNewButton_4.setBounds(477, 57, 122, 25);
		btnNewButton_4.setFont(new Font("Constantia", Font.BOLD, 13));
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("INVOICE");
		btnNewButton_5.setBounds(592, 57, 122, 25);
		btnNewButton_5.setFont(new Font("Constantia", Font.BOLD, 13));
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("PRODUCT");
		btnNewButton_6.setBounds(709, 57, 122, 25);
		btnNewButton_6.setFont(new Font("Constantia", Font.BOLD, 13));
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("LOGOUT");
		btnNewButton_7.setBounds(906, 0, 122, 25);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(btnNewButton_7);
		
		lblAddress = new JLabel("Address 1");
		lblAddress.setBounds(23, 538, 250, 18);
		lblAddress.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblAddress);
		
		lblAddress_1 = new JLabel("Address 2");
		lblAddress_1.setBounds(23, 579, 129, 18);
		lblAddress_1.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblAddress_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(136, 531, 250, 30);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(136, 572, 250, 30);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		lblCustomerAddress = new JLabel("Customer Address");
		lblCustomerAddress.setBounds(136, 490, 250, 30);
		lblCustomerAddress.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblCustomerAddress);
		
		lblShippingAddress = new JLabel("Shipping Address");
		lblShippingAddress.setBounds(727, 498, 189, 14);
		lblShippingAddress.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblShippingAddress);
		
		lblAddress_2 = new JLabel("Address 1");
		lblAddress_2.setBounds(612, 531, 250, 18);
		lblAddress_2.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblAddress_2);
		
		textField_8 = new JTextField();
		textField_8.setBounds(727, 524, 250, 30);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		table = new JTable();
		table.setBounds(214, 395, 28, -26);
		contentPane.add(table);
		
		lblAddress_3 = new JLabel("Address 2");
		lblAddress_3.setBounds(612, 572, 250, 18);
		lblAddress_3.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblAddress_3);
		
		textField_9 = new JTextField();
		textField_9.setBounds(727, 565, 250, 30);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_9.setBackground(new Color(255, 255, 255));
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		lblPincode = new JLabel("Pincode");
		lblPincode.setBounds(23, 621, 99, 14);
		lblPincode.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblPincode);
		
		textField_10 = new JTextField();
		textField_10.setBounds(136, 613, 250, 30);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		label_6 = new JLabel("Pincode");
		label_6.setBounds(612, 619, 250, 18);
		label_6.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(label_6);
		
		textField_11 = new JTextField();
		textField_11.setBounds(727, 605, 250, 30);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_11.setColumns(10);
		textField_11.setBackground(Color.WHITE);
		contentPane.add(textField_11);
		
		lblState = new JLabel("State");
		lblState.setBounds(24, 657, 46, 14);
		lblState.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblState);
		
		textField_12 = new JTextField();
		textField_12.setBounds(136, 649, 250, 30);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		label_7 = new JLabel("State");
		label_7.setBounds(612, 655, 250, 18);
		label_7.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(label_7);
		
		textField_13 = new JTextField();
		textField_13.setBounds(727, 641, 250, 30);
		textField_13.setColumns(10);
		contentPane.add(textField_13);
		
		btnPrint = new JButton("Print");
		btnPrint.setBounds(439, 700, 122, 25);
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnPrint);
		
		lblCreateInvoice = new JLabel("Create Invoice");
		lblCreateInvoice.setBounds(10, 96, 112, 14);
		lblCreateInvoice.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblCreateInvoice);
		
		btnCustomerRelationshipManagment = new JButton("CUSTOMER RELATIONSHIP MANAGMENT");
		btnCustomerRelationshipManagment.setBounds(244, -1, 446, 47);
		btnCustomerRelationshipManagment.setFont(new Font("Constantia", Font.BOLD, 20));
		btnCustomerRelationshipManagment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnCustomerRelationshipManagment);
		
		table_1 = new JTable(3,6);
		table_1.setBounds(96, 337, 618, 47);
		contentPane.add(table_1);
		
		lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setBounds(553, 398, 99, 18);
		lblSubtotal.setFont(new Font("Constantia", Font.PLAIN, 15));
		contentPane.add(lblSubtotal);
		
		textField_14 = new JTextField();
		textField_14.setBounds(628, 395, 86, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		lblGst = new JLabel("GST");
		lblGst.setBounds(553, 429, 99, 18);
		lblGst.setFont(new Font("Constantia", Font.PLAIN, 15));
		contentPane.add(lblGst);
		
		textField_15 = new JTextField();
		textField_15.setBounds(628, 426, 86, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		lblTotal = new JLabel("Total");
		lblTotal.setBounds(553, 460, 99, 18);
		lblTotal.setFont(new Font("Constantia", Font.PLAIN, 15));
		contentPane.add(lblTotal);
		
		textField_16 = new JTextField();
		textField_16.setBounds(628, 457, 86, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(823, 102, 105, 30);
		contentPane.add(dateChooser);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(454, 128, 77, 30);
		contentPane.add(btnSearch);
		
		JButton button = new JButton(">");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String add1=textField_4.getText();
			String add2=textField_5.getText();
			String pin=textField_10.getText();
			String state=textField_12.getText();
			
			textField_8.setText(add1);
			textField_9.setText(add2);
			textField_11 .setText(pin);
			textField_13.setText(state);
			
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(465, 565, 66, 35);
		contentPane.add(button);
		
	}
}
