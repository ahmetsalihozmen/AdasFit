package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ekle extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField cal;
	private JTextField fat;
	private JTextField carb;
	private JTextField pro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ekle frame = new Ekle();
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
	public Ekle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		name = new JTextField();
		name.setBounds(140, 45, 86, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		cal = new JTextField();
		cal.setBounds(140, 76, 86, 20);
		contentPane.add(cal);
		cal.setColumns(10);
		
		fat = new JTextField();
		fat.setBounds(140, 107, 86, 20);
		contentPane.add(fat);
		fat.setColumns(10);
		
		carb = new JTextField();
		carb.setBounds(140, 141, 86, 20);
		contentPane.add(carb);
		carb.setColumns(10);
		
		pro = new JTextField();
		pro.setBounds(140, 172, 86, 20);
		contentPane.add(pro);
		pro.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Yemek Ad\u0131");
		lblNewLabel.setBounds(10, 48, 92, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblKalori = new JLabel("Kalori\r\n");
		lblKalori.setBounds(10, 79, 92, 14);
		contentPane.add(lblKalori);
		
		JLabel lblYa = new JLabel("Ya\u011F\r\n");
		lblYa.setBounds(10, 110, 92, 14);
		contentPane.add(lblYa);
		
		JLabel lblKarbonhidrat = new JLabel("Karbonhidrat\r\n");
		lblKarbonhidrat.setBounds(10, 144, 92, 14);
		contentPane.add(lblKarbonhidrat);
		
		JLabel lblProtein = new JLabel("Protein\r\n");
		lblProtein.setBounds(10, 175, 92, 14);
		contentPane.add(lblProtein);
		
		JButton btnNewButton = new JButton("Ekle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.foodlist[Main.j]=name.getText();
				Main.j++;
				Main.p.totalcal+=Integer.parseInt(cal.getText());
				Main.p.carb+=Integer.parseInt(carb.getText());
				Main.p.fat+=Integer.parseInt(fat.getText());
				Main.p.protein+=Integer.parseInt(pro.getText());
				setVisible(false);
			}
		});
		btnNewButton.setBounds(140, 258, 89, 23);
		contentPane.add(btnNewButton);
	}

}
