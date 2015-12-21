package projet_bulles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import projet_bulles.Jeu.STATE;

public class ChoisirNiveau extends JFrame implements KeyListener {

	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int width = (int) screenSize.getWidth();
	int height = (int) screenSize.getHeight();
	private JButton NiveauStatique1;
	private JButton NiveauStatique2;
	private JButton NiveauStatique3;
	private JButton NiveauMobile1;
	private JButton NiveauMobile2;
	private JButton NiveauMobile3;
	private JButton MenuPrincipal;
	
	
	public ChoisirNiveau () {
	
	super("Jeu De Bulles");
	setSize(width,height);
	
	/* Redimensionner les images pour travailler sur tous les Ã©crans */
	// if(width == 1920 && height == 1080) {
	this.setContentPane(new ImagePanel(new ImageIcon("wallpaper.jpg").getImage())); // Ã  reprendre
	 //}
	 this.setVisible(true);
		this.setLayout(null); // permet le position correcte des boutons
		
		 Font police = new Font("Verdana", Font.BOLD, 20);
		 
		this.NiveauStatique1 = new JButton("Niveau Statique1");
		this.NiveauStatique1.setBackground(Color.WHITE);
		this.NiveauStatique1.setFont(police);
		this.NiveauStatique1.setBounds(width /2 -550, 100, 300, 75);
		this.getContentPane().add(this.NiveauStatique1);
		
		
		this.NiveauStatique2 = new JButton("Niveau Statique2");
		this.NiveauStatique2.setBackground(Color.WHITE);
		this.NiveauStatique2.setFont(police);
		this.NiveauStatique2.setBounds(width /2 -200, 100, 300, 75);
		this.getContentPane().add(this.NiveauStatique2);
		
		this.NiveauStatique3 = new JButton("Niveau Statique3");
		this.NiveauStatique3.setBackground(Color.WHITE);
		this.NiveauStatique3.setFont(police);
		this.NiveauStatique3.setBounds(width /2 +150, 100, 300, 75);
		this.getContentPane().add(this.NiveauStatique3);

		
	
		this.NiveauMobile1 = new JButton("Niveau mobile1");
		this.NiveauMobile1.setBackground(Color.WHITE);
		this.NiveauMobile1.setFont(police);
		this.NiveauMobile1.setBounds(width /2 -550, 400, 300, 75);
		this.getContentPane().add(this.NiveauMobile1);
		
		this.NiveauMobile2 = new JButton("Niveau mobile2");
		this.NiveauMobile2.setBackground(Color.WHITE);
		this.NiveauMobile2.setFont(police);
		this.NiveauMobile2.setBounds(width /2 -200, 400, 300, 75);
		this.getContentPane().add(this.NiveauMobile2);
		
		this.NiveauMobile3 = new JButton("Niveau mobile3");
		this.NiveauMobile3.setBackground(Color.WHITE);
		this.NiveauMobile3.setFont(police);
		this.NiveauMobile3.setBounds(width /2 +150, 400, 300, 75);
		this.getContentPane().add(this.NiveauMobile3);
		
		this.MenuPrincipal = new JButton("Menu Principal");
		this.MenuPrincipal.setBackground(Color.WHITE);
		this.MenuPrincipal.setFont(police);
		this.MenuPrincipal.setBounds(100, 900, 300, 75);
	this.getContentPane().add(this.MenuPrincipal, BorderLayout.CENTER);
	
	
	this.MenuPrincipal.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			dispose();
			Jeu.State = STATE.MENU;
			try {
				Jeu.controller();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
	});
	
	this.NiveauStatique1.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			dispose();
			Jeu.State = STATE.GAME;
			PlateauBulle N1= new PlateauBulle(5,1,0);

			
			
		}
	});
	
this.NiveauStatique2.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			dispose();
			Jeu.State = STATE.GAME;
			PlateauBulle N1= new PlateauBulle(7,2,0);

			
			
		}
	});

this.NiveauStatique3.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		
		dispose();
		Jeu.State = STATE.GAME;
		PlateauBulle N1= new PlateauBulle(9,3,0);

		
		
	}
});
	
	
	
	this.NiveauMobile1.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			dispose();
			Jeu.State = STATE.GAME;
			PlateauBulle N1= new PlateauBulle(5,1,1);

			
			
		}
	});
	
	this.NiveauMobile2.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			dispose();
			Jeu.State = STATE.GAME;
			PlateauBulle N1= new PlateauBulle(7,1,2);

			
			
		}
	});
	
	
	this.NiveauMobile3.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			dispose();
			Jeu.State = STATE.GAME;
			PlateauBulle N1= new PlateauBulle(9,1,3);

			
			
		}
	});
	this.setVisible(true);

}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String [ ] args)
	{
		ChoisirNiveau ch1 = new ChoisirNiveau();
	}

}
