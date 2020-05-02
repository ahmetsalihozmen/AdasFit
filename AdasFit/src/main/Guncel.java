package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Guncel extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField height;
	private JTextField weight;
	private JTextField age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guncel frame = new Guncel();
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
	public Guncel() {
		Image img = new  ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		this.setIconImage(img);
		setTitle("AdasFit");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Ad Soyad");
		label.setBounds(10, 58, 68, 17);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Boy(cm)");
		label_1.setBounds(10, 97, 68, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Kilo");
		label_2.setBounds(10, 137, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Ya\u015F");
		label_3.setBounds(10, 175, 46, 14);
		contentPane.add(label_3);
		
		JRadioButton aim1 = new JRadioButton("Kilo Vermek");
		aim1.setBounds(88, 222, 109, 14);
		contentPane.add(aim1);
		
		JRadioButton aim2 = new JRadioButton("Kilomu Korumak");
		aim2.setBounds(88, 246, 122, 17);
		contentPane.add(aim2);
		
		JRadioButton aim3 = new JRadioButton("Kilo Almak");
		aim3.setBounds(88, 266, 109, 23);
		contentPane.add(aim3);
		
		JRadioButton act1 = new JRadioButton("Hareketsiz");
		act1.setBounds(88, 302, 109, 17);
		contentPane.add(act1);
		
		JRadioButton act2 = new JRadioButton("Biraz Aktif");
		act2.setBounds(88, 321, 109, 17);
		contentPane.add(act2);
		
		JRadioButton act3 = new JRadioButton("Hareketsiz is, Haftada 3-4 g\u00FCn antrenman");
		act3.setBounds(88, 341, 270, 17);
		contentPane.add(act3);
		
		JRadioButton act4 = new JRadioButton("Ortalama is, Haftada 5-7 g\u00FCn antrenman");
		act4.setBounds(88, 361, 270, 17);
		contentPane.add(act4);
		
		JRadioButton act5 = new JRadioButton("Yogun is, Profesyonel Seviyede Antrenman");
		act5.setBounds(88, 381, 279, 17);
		contentPane.add(act5);
		
		JRadioButton sex1 = new JRadioButton("Erkek\r\n");
		sex1.setBounds(326, 222, 109, 19);
		contentPane.add(sex1);
		
		JRadioButton sex2 = new JRadioButton("Kad\u0131n");
		sex2.setBounds(326, 243, 109, 23);
		contentPane.add(sex2);
		
		JLabel label_4 = new JLabel("Cinsiyet\r\n");
		label_4.setBounds(274, 222, 46, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Hedef");
		label_5.setBounds(13, 222, 46, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Aktiflik Derecesi");
		label_6.setBounds(5, 328, 97, 14);
		contentPane.add(label_6);
		
		name = new JTextField();
		name.setBounds(124, 56, 115, 19);
		contentPane.add(name);
		name.setColumns(10);
		
		height = new JTextField();
		height.setColumns(10);
		height.setBounds(124, 94, 115, 19);
		contentPane.add(height);
		
		weight = new JTextField();
		weight.setColumns(10);
		weight.setBounds(124, 134, 115, 19);
		contentPane.add(weight);
		
		age = new JTextField();
		age.setBounds(124, 172, 115, 20);
		contentPane.add(age);
		age.setColumns(10);
		
		JButton btnNewButton = new JButton("Geri D\u00F6n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainMenu men = new MainMenu();
				men.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		ButtonGroup bgaim = new ButtonGroup();
		ButtonGroup bgsex = new ButtonGroup();
		ButtonGroup bgact = new ButtonGroup();
		bgaim.add(aim1);
		bgaim.add(aim2);
		bgaim.add(aim3);
		bgact.add(act5);
		bgact.add(act4);
		bgact.add(act3);
		bgact.add(act2);
		bgact.add(act1);
		bgsex.add(sex1);
		bgsex.add(sex2);
		
		JButton btnNewButton_1 = new JButton("Onayla");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.p.age=Integer.parseInt(age.getText());
				Main.p.height=Integer.parseInt(height.getText());
				Main.p.weight=Integer.parseInt(weight.getText());
				Main.p.fullName=name.getText();
				if(aim1.isSelected()) {
					Main.p.aim="1";
				}
				else if(aim2.isSelected()) {
					Main.p.aim="2";
				}
				else if(aim3.isSelected()) {
					Main.p.aim="3";
				}
				if(sex1.isSelected()) {
					Main.p.sex="m";
				}
				else {
					Main.p.sex="f";
				}
				if(act1.isSelected()) {
					Main.p.activity="1";
				}
				else if(act2.isSelected()) {
					Main.p.activity="2";
				}
				else if(act3.isSelected()) {
					Main.p.activity="3";
				}
				else if(act4.isSelected()) {
					Main.p.activity="4";
				}
				else {
					Main.p.activity="5";
				}
				setVisible(false);
				MainMenu menu= new MainMenu();
				menu.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(163, 433, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
