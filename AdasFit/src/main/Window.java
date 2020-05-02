package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

public class Window {

	private JFrame frmAdasfit;
	private JTextField textage;
	private JTextField textname;
	private JTextField texth;
	private JTextField textw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmAdasfit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Window() {
		initialize();
	}

	
	private void initialize() {
		frmAdasfit = new JFrame();
		frmAdasfit.setTitle("AdasFit");
		frmAdasfit.setBounds(100, 100, 532, 579);
		frmAdasfit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdasfit.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Kabul");
		btnNewButton.setBounds(183, 436, 89, 23);
		frmAdasfit.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Ad Soyad");
		lblNewLabel.setBounds(29, 68, 68, 17);
		frmAdasfit.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Boy(cm)");
		lblNewLabel_1.setBounds(29, 107, 68, 14);
		frmAdasfit.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kilo");
		lblNewLabel_2.setBounds(29, 147, 46, 14);
		frmAdasfit.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ya\u015F");
		lblNewLabel_3.setBounds(29, 185, 46, 14);
		frmAdasfit.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hedef");
		lblNewLabel_4.setBounds(29, 239, 46, 14);
		frmAdasfit.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Aktiflik Derecesi");
		lblNewLabel_5.setBounds(21, 345, 97, 14);
		frmAdasfit.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("AdasFit'e Ho\u015Fgeldiniz l\u00FCtfen a\u015Fa\u011F\u0131daki bilgileri kendinize g\u00F6re eksiksiz \u015Fekilde doldurunuz.");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(0, 0, 512, 56);
		frmAdasfit.getContentPane().add(lblNewLabel_6);
		
		textage = new JTextField();
		textage.setBounds(124, 182, 144, 20);
		frmAdasfit.getContentPane().add(textage);
		textage.setColumns(10);
		
		JRadioButton loss = new JRadioButton("Kilo Vermek");
		loss.setBounds(124, 225, 109, 14);
		frmAdasfit.getContentPane().add(loss);
		
		JRadioButton stab = new JRadioButton("Kilomu Korumak");
		stab.setBounds(124, 249, 122, 17);
		frmAdasfit.getContentPane().add(stab);
		
		JRadioButton gain = new JRadioButton("Kilo Almak");
		gain.setBounds(124, 269, 109, 23);
		frmAdasfit.getContentPane().add(gain);
		
		JRadioButton act1 = new JRadioButton("Hareketsiz");
		act1.setBounds(124, 305, 109, 17);
		frmAdasfit.getContentPane().add(act1);
		
		JRadioButton act2 = new JRadioButton("Biraz Aktif");
		act2.setBounds(124, 324, 109, 17);
		frmAdasfit.getContentPane().add(act2);
		
		JRadioButton act3 = new JRadioButton("Hareketsiz is, Haftada 3-4 g\u00FCn antrenman");
		act3.setBounds(124, 344, 270, 17);
		frmAdasfit.getContentPane().add(act3);
		
		JRadioButton act4 = new JRadioButton("Ortalama is, Haftada 5-7 g\u00FCn antrenman");
		act4.setBounds(124, 364, 270, 17);
		frmAdasfit.getContentPane().add(act4);
		
		JRadioButton act5 = new JRadioButton("Yogun is, Profesyonel Seviyede Antrenman");
		act5.setBounds(124, 384, 279, 17);
		frmAdasfit.getContentPane().add(act5);
		
		textname = new JTextField();
		textname.setColumns(10);
		textname.setBounds(124, 66, 144, 20);
		frmAdasfit.getContentPane().add(textname);
		
		texth = new JTextField();

		texth.setColumns(10);
		texth.setBounds(124, 104, 144, 20);
		frmAdasfit.getContentPane().add(texth);
		
		textw = new JTextField();
		textw.setColumns(10);
		textw.setBounds(124, 141, 144, 20);
		frmAdasfit.getContentPane().add(textw);
		
		JLabel lblNewLabel_7 = new JLabel("Cinsiyet\r\n");
		lblNewLabel_7.setBounds(290, 239, 46, 14);
		frmAdasfit.getContentPane().add(lblNewLabel_7);
		
		JRadioButton male = new JRadioButton("Erkek\r\n");
		male.setBounds(362, 225, 109, 19);
		frmAdasfit.getContentPane().add(male);
		
		JRadioButton female = new JRadioButton("Kad\u0131n");
		female.setBounds(362, 246, 109, 23);
		frmAdasfit.getContentPane().add(female);
		
		ButtonGroup bgaim = new ButtonGroup();
		ButtonGroup bgsex = new ButtonGroup();
		ButtonGroup bgact = new ButtonGroup();
		bgaim.add(loss);
		bgaim.add(stab);
		bgaim.add(gain);
		bgact.add(act5);
		bgact.add(act4);
		bgact.add(act3);
		bgact.add(act2);
		bgact.add(act1);
		bgsex.add(male);
		bgsex.add(female);

		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.p.age=Integer.parseInt(textage.getText());
				Main.p.height=Integer.parseInt(texth.getText());
				Main.p.weight=Integer.parseInt(textw.getText());
				Main.p.fullName=textname.getText();
				if(loss.isSelected()) {
					Main.p.aim="1";
				}
				else if(stab.isSelected()) {
					Main.p.aim="2";
				}
				else if(gain.isSelected()) {
					Main.p.aim="3";
				}
				if(male.isSelected()) {
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
				frmAdasfit.dispose();
				MainMenu menu= new MainMenu();
				menu.setVisible(true);
				Main.p.totalcal=0;
			}
		});
		
		
		
	}
}
