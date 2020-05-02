package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

public class Program extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Program frame = new Program();
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
	public Program() {
		Image img = new  ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		this.setIconImage(img);
		setTitle("AdasFit");
		String program;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		program=Main.ProgramFind(Main.p);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		JTextArea textArea = new JTextArea();
		textArea.setText(program);
		//textArea.setBounds(10, 28, 478, 550);
		contentPane.add(textArea,BorderLayout.CENTER);
		
		JScrollPane jp = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		contentPane.add(jp);
		
		JButton btnNewButton = new JButton("Geri D\u00F6n\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainMenu menu= new MainMenu();
				menu.setVisible(true);
			}
		});
		contentPane.add(btnNewButton);
	}
}
