package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prev extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prev frame = new Prev();
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
	public Prev() {
		Image img = new  ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		this.setIconImage(img);
		setTitle("AdasFit");
		
		String days= null;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Geri D\u00F6n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainMenu menu= new MainMenu();
				menu.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		int j=0;
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 45, 428, 466);
		textArea.setText("Kalori:"+Main.arrDay[j].cal+" Yağ:"+Main.arrDay[j].fat+" Karbonhidrat:"+Main.arrDay[j].carb+" Protein:"+Main.arrDay[j].protein+"\n");
		days="Kalori:"+Main.arrDay[j].cal+" Yağ:"+Main.arrDay[j].fat+" Karbonhidrat:"+Main.arrDay[j].carb+" Protein:"+Main.arrDay[j].protein+"\n";
		contentPane.add(textArea);
		
	}

}
