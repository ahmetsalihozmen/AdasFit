package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

public class AddFood extends JFrame {
	public int len=0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddFood frame = new AddFood();
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
	public AddFood() {
		Image img = new  ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		this.setIconImage(img);
		setTitle("AdasFit");
		int i=0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		Food list[] = new Food[50];
		Food added = new Food("0",0,0,0,0);
		
		 list[len++] = new Food("Haşlanmış Yumurta",78,5,6,1);
		 list[len++] = new Food("Hamburger",426,23,22,31);
		 list[len++] = new Food("Tost",256,12,9,27);
		 list[len++] = new Food("Poğaça",178,10,4,16);
		 list[len++] = new Food("Börek",280,12,34,7);
		 list[len++] = new Food("Elma",72,0,0,19);
		 list[len++] = new Food("Cikolata",275,17,4,25);
		 list[len++] = new Food("Zeytin",36,3,1,2);
		 list[len++] = new Food("Pizza Dilim",241,6,40,8);
		 list[len++] = new Food("Pirinç Pilavı",258,7,4,45);
		 list[len++] = new Food("Bulgur Pilavı",208,4,6,36);
		 list[len++] = new Food("Makarna",186,2,7,38);
		 list[len++] = new Food("Salata",18,0,3,2);
		 list[len++] = new Food("Tavuk Göğüsü",195,7,30,0);
		 list[len++] = new Food("Köfte",205,13,15,6);
		 list[len++] = new Food("Sucuk",280,25,13,1);
		 list[len++] = new Food("Portakal",62,0,1,15);
		 list[len++] = new Food("Muz",105,0,1,27);
		 list[len++] = new Food("Karnıyarık",270,22,10,8);
		 list[len++] = new Food("Patates Kızartması",319,17,4,38);
		 list[len++] = new Food("Ciğer",140,5,20,3);
		 list[len++] = new Food("Milkshake",478,14,13,77);
		 list[len++] = new Food("Dondurma",268,14,5,33);
		 list[len++] = new Food("Dilim Ekmek",66,1,2,13);
		 list[len++] = new Food("Kıymalı Pide",488,25,22,41);
		 list[len++] = new Food("Et Döner",252,25,15,2);
		 list[len++] = new Food("Lahmacun",188,5,6,26);
		 list[len++] = new Food("Nugget",250,12,10,24);
		 list[len++] = new Food("Beyti Kebap",878,57,34,55);
		 list[len++] = new Food("Yaş Pasta",238,8,3,38);
		 list[len++] = new Food("Baklava",334,23,5,30);
		 list[len++] = new Food("Güllaç",143,5,4,22);
		 list[len++] = new Food("Ekler",348,25,8,22);
		 list[len++] = new Food("Kutu Kola",148,0,0,37);
		 list[len++] = new Food("Kadayıf",280,13,5,39);
		 list[len++] = new Food("Profiterol",212,9,4,28);
		 list[len++] = new Food("Peynir",100,8,5,1);
		 list[len++] = new Food("Salam",58,5,3,0);
		 list[len++] = new Food("Reçel",55,0,0,14);
		 list[len++] = new Food("Sosis",204,16,12,3);
		 list[len++] = new Food("Balık",142,4,25,0);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		 
		JList foodlist = new JList();
		foodlist.setModel(new AbstractListModel() {
			int i=0;
			String[] values = new String[] {list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name,list[i++].name, };
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		
		foodlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//foodlist.setBounds(0, 67, 381, 341);
		//contentPane.add(foodlist);
		
		JScrollPane scrollPane = new JScrollPane();
	     scrollPane.setViewportView(foodlist);
	     foodlist.setLayoutOrientation(JList.VERTICAL);
	     contentPane.add(scrollPane);
		
		 JButton btnNewButton = new JButton("Ekle");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int select;
					select=foodlist.getSelectedIndex();
					Main.foodlist[Main.j]=list[select].name;
					Main.j++;
					Main.p.totalcal+=list[select].cal;
					Main.p.carb+=list[select].carb;
					Main.p.fat+=list[select].fat;
					Main.p.protein+=list[select].protein;
				}
			});
			contentPane.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Geri Dön");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					MainMenu menu= new MainMenu();
					menu.setVisible(true);
					
				}
			});
			contentPane.add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("Kendin Ekle");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Ekle ek = new Ekle();
					ek.setVisible(true);
				}
			});
			contentPane.add(btnNewButton_2);
		
	}
}
