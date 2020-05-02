package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MainMenu() {
		Image img = new  ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		this.setIconImage(img);
		setTitle("AdasFit");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("G\u00FCnl\u00FCk Kalori");
		lblNewLabel.setBounds(22, 88, 88, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ald\u0131\u011F\u0131n\u0131z Kalori\r\n");
		lblNewLabel_1.setBounds(250, 88, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Yemek Ekleme\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				AddFood addf= new AddFood();
				addf.setVisible(true);
			}
		});
		btnNewButton.setBounds(29, 169, 148, 55);
		contentPane.add(btnNewButton);
		
		JButton btnProgramnerme = new JButton("Program \u00D6nerme\r\n");
		btnProgramnerme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Program prog= new Program();
				prog.setVisible(true);
			}
		});
		btnProgramnerme.setBounds(222, 169, 148, 55);
		contentPane.add(btnProgramnerme);
		
		JButton btnncekiGnler = new JButton("\u00D6nceki G\u00FCn\r\n");
		btnncekiGnler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Prev pre = new Prev();
				pre.setVisible(true);
			}
		});
		btnncekiGnler.setBounds(29, 256, 148, 55);
		contentPane.add(btnncekiGnler);
		
		JButton btnBilgileriGncelle = new JButton("Bilgileri G\u00FCncelle\r\n");
		btnBilgileriGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Guncel gunc= new Guncel();
				gunc.setVisible(true);
			}
		});
		btnBilgileriGncelle.setBounds(222, 256, 148, 55);
		contentPane.add(btnBilgileriGncelle);
		
		JButton btnYemekListesi = new JButton("Yemek Listesi\r\n");
		btnYemekListesi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ListFood sa= new ListFood();
				sa.setVisible(true);
			}
		});
		btnYemekListesi.setBounds(29, 349, 148, 55);
		contentPane.add(btnYemekListesi);
		
		JButton btnSonrakiGn = new JButton("Sonraki G\u00FCn\r\n");
		btnSonrakiGn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.j=0;
				setVisible(false);
				Main.arrDay[Main.i].cal=Main.p.totalcal;
				Main.arrDay[Main.i].fat=Main.p.fat;
				Main.arrDay[Main.i].carb=Main.p.carb;
				Main.arrDay[Main.i].protein=Main.p.protein;
				Main.p.totalcal=0;
				Main.p.fat=0;
				Main.p.carb=0;
				Main.p.protein=0;
				MainMenu men= new MainMenu();
				men.setVisible(true);
				Main.i++;
				
				
			}
		});
		btnSonrakiGn.setBounds(222, 349, 148, 55);
		contentPane.add(btnSonrakiGn);
		
		JLabel lblNewLabel_2 = new JLabel("Ya\u011F\r\n");
		lblNewLabel_2.setBounds(29, 133, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Karbonhidrat\r\n");
		lblNewLabel_3.setBounds(143, 133, 77, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Protein\r\n");
		lblNewLabel_4.setBounds(291, 133, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel dailycal = new JLabel("");
		dailycal.setBounds(104, 88, 46, 14);
		contentPane.add(dailycal);
		
		JLabel caleat = new JLabel("");
		caleat.setBounds(337, 88, 46, 14);
		contentPane.add(caleat);
		
		JLabel fat = new JLabel("New label");
		fat.setBounds(64, 133, 46, 14);
		contentPane.add(fat);
		
		JLabel carb = new JLabel("New label");
		carb.setBounds(222, 133, 46, 14);
		contentPane.add(carb);
		
		JLabel pro = new JLabel("New label");
		pro.setBounds(347, 133, 46, 14);
		contentPane.add(pro);
		
		Main.p.calNeed=Main.CalculateCal(Main.p);
		dailycal.setText(Integer.toString(Main.p.calNeed));
		caleat.setText(Integer.toString(Main.p.totalcal));
		fat.setText(Integer.toString(Main.p.fat));
		carb.setText(Integer.toString(Main.p.carb));
		pro.setText(Integer.toString(Main.p.protein));
		
		JLabel welcome = new JLabel("Ho\u015F Geldin");
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		welcome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		welcome.setBounds(10, 35, 401, 30);
		contentPane.add(welcome);
		welcome.setText("Hoş Geldin "+Main.p.fullName);
		

	
	}
}
