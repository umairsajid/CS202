package examplesLab7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ColorChoice {
	
	public ColorChoice(){}

	JFrame colorMenu;
	JButton color1;
	JButton color2;
	JButton color3;
	JButton color4;
	JLabel statementLayer;
	Color lavender = new Color(150, 123, 182);
	Color turquoise = new Color(64, 224, 208);
	Color coral = new Color(255, 127, 80);
	boolean p1ColorIsT;
	boolean p1ColorIsG;
	boolean p1ColorIsL;
	boolean p1ColorIsC;
	boolean p2ColorIsT;
	boolean p2ColorIsG;
	boolean p2ColorIsL;
	boolean p2ColorIsC;
	
	
	void createColorMenu(){
		colorMenu = new JFrame("Connect Four");
		statementLayer = new JLabel("P1 choose a color!");
		statementLayer.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 11));
		statementLayer.setBorder(BorderFactory.createEmptyBorder(2, 5, 4, 5));
		
		color1 = new JButton("Turquoise");
		color1.setBackground(turquoise);
		color2 = new JButton("Green");
		color2.setBackground(Color.green);
		color3 = new JButton("Lavender");
		color3.setBackground(lavender);
		color4 = new JButton("Coral");
		color4.setBackground(coral);
		
		colorMenu.add(color1);
		colorMenu.add(color2);
		colorMenu.add(color3);
		colorMenu.add(color4);
		
		colorMenu.setLayout(new GridLayout(3, 2));
		colorMenu.setSize(320, 140);
		colorMenu.setBackground(Color.black);
		colorMenu.setVisible(true);
		colorMenu.setLocationRelativeTo(null);
		colorMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		colorMenu.add(statementLayer, BorderLayout.PAGE_END);
		statementLayer.setForeground(Color.black);
	}
	
	void p1p2ChooseColor(){
		if(p1ColorIsT == false && p1ColorIsG == false && p1ColorIsL == false && p1ColorIsC == false){
			System.out.println("No color has been chosen\n" + "T:" + getP1ColorIsT() + " G:" + getP1ColorIsG() + " L:" + getP1ColorIsL() + " C:" + getP1ColorIsC());
			color1.addActionListener(new p1Color1());
			color2.addActionListener(new p1Color2());
			color3.addActionListener(new p1Color3());
			color4.addActionListener(new p1Color4());
		}
		
	}
	
	private class p1Color1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) { 
			setP1ColorIsT(true);
			setP1ColorIsG(false);
			setP1ColorIsL(false);
			setP1ColorIsC(false);
			
			nextStatement();
		}
	}
	private class p1Color2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) { 
			setP1ColorIsT(false);
			setP1ColorIsG(true);
			setP1ColorIsL(false);
			setP1ColorIsC(false);
			
			nextStatement();
		}
	}
	private class p1Color3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) { 
			setP1ColorIsT(false);
			setP1ColorIsG(false);
			setP1ColorIsL(true);
			setP1ColorIsC(false);
			
			nextStatement();
		}
	}
	private class p1Color4 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) { 
			setP1ColorIsT(false);
			setP1ColorIsG(false);
			setP1ColorIsL(false);
			setP1ColorIsC(true);
			
			nextStatement();
		}
	}
	
	private void nextStatement(){
		if(p1ColorIsT == true && p1ColorIsG == false && p1ColorIsL == false && p1ColorIsC == false){
			statementLayer.setText("P2 choose a color!");
			color2.addActionListener(new p2Color2());
			color3.addActionListener(new p2Color3());
			color4.addActionListener(new p2Color4());
			System.out.println("Player 1 Choose Turquoise\n" + "T:" + getP1ColorIsT() + " G:" + getP1ColorIsG() + " L:" + getP1ColorIsL() + " C:" + getP1ColorIsC());
		}
		else if(p1ColorIsT == false && p1ColorIsG == true && p1ColorIsL == false && p1ColorIsC == false){
			statementLayer.setText("P2 choose a color!");
			color1.addActionListener(new p2Color1());
			//color3.addActionListener(new p2Color3());
			//color4.addActionListener(new p2Color4());
			System.out.println("Player 1 Choose Green\n" + "T:" + getP1ColorIsT() + " G:" + getP1ColorIsG() + " L:" + getP1ColorIsL() + " C:" + getP1ColorIsC());
		}
		else if(p1ColorIsT == false && p1ColorIsG == false && p1ColorIsL == true && p1ColorIsC == false){
			statementLayer.setText("P2 choose a color!");
			color1.addActionListener(new p2Color1());
			//color2.addActionListener(new p2Color2());
			//color4.addActionListener(new p2Color4());
			System.out.println("Player 1 Choose Lavender\n" + "T:" + getP1ColorIsT() + " G:" + getP1ColorIsG() + " L:" + getP1ColorIsL() + " C:" + getP1ColorIsC());
		}
		else if(p1ColorIsT == false && p1ColorIsG == false && p1ColorIsL == false && p1ColorIsC == true){
			statementLayer.setText("P2 choose a color!");
			color1.addActionListener(new p2Color1());
			//color2.addActionListener(new p2Color2());
			//color3.addActionListener(new p2Color3());
			System.out.println("Player 1 Choose Coral\n" + "T:" + getP1ColorIsT() + " G:" + getP1ColorIsG() + " L:" + getP1ColorIsL() + " C:" + getP1ColorIsC());
		}
		else{
			
		}
	}
	
	private class p2Color1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			setP2ColorIsT(true);
			setP2ColorIsT(false);
			setP2ColorIsT(false);
			setP2ColorIsT(false);
			
			readyToPlay();

			//if(getP2ColorIsT() == true){
			//	System.out.println("Player 2 Choose Turquoise/n" + getP2ColorIsT());
			//}
//			System.out.println("1 T:" + getP1ColorIsT() + " G:" + getP1ColorIsG() + " L:" + getP1ColorIsL() + " C:" + getP1ColorIsC());
//			System.out.println("2 T:" + getP2ColorIsT() + " G:" + getP2ColorIsG() + " L:" + getP2ColorIsL() + " C:" + getP2ColorIsC());
//			TwoPlayer begin = new TwoPlayer();
//			begin.createAndShowBoard();
		}
	}
	private class p2Color2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			
		}
	}
	private class p2Color3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
		
		}
	}
	private class p2Color4 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			
		}
	}
	
	void readyToPlay(){
		if(getP2ColorIsT() == true && getP1ColorIsG() == true){
			System.out.println("Player 1 Chose Green\nPlayer 2 Chose Turquoise");
		}
	}
	
	public boolean getP1ColorIsT() {
		return p1ColorIsT;
	}

	public void setP1ColorIsT(boolean p1ColorIsT) {
		this.p1ColorIsT = p1ColorIsT;
	}

	public boolean getP1ColorIsG() {
		return p1ColorIsG;
	}

	public void setP1ColorIsG(boolean p1ColorIsG) {
		this.p1ColorIsG = p1ColorIsG;
	}

	public boolean getP1ColorIsL() {
		return p1ColorIsL;
	}

	public void setP1ColorIsL(boolean p1ColorIsL) {
		this.p1ColorIsL = p1ColorIsL;
	}

	public boolean getP1ColorIsC() {
		return p1ColorIsC;
	}

	public void setP1ColorIsC(boolean p1ColorIsC) {
		this.p1ColorIsC = p1ColorIsC;
	}
	//adegdsfgdsfhdfsghshsergserg


	void p1CompChooseColor(){
		statementLayer.setText("P2 choose a color!");
	}

	public boolean getP2ColorIsT() {
		return p2ColorIsT;
	}

	public void setP2ColorIsT(boolean p2ColorIsT) {
		this.p2ColorIsT = p2ColorIsT;
	}

	public boolean getP2ColorIsG() {
		return p2ColorIsG;
	}

	public void setP2ColorIsG(boolean p2ColorIsG) {
		this.p2ColorIsG = p2ColorIsG;
	}

	public boolean getP2ColorIsL() {
		return p2ColorIsL;
	}

	public void setP2ColorIsL(boolean p2ColorIsL) {
		this.p2ColorIsL = p2ColorIsL;
	}

	public boolean getP2ColorIsC() {
		return p2ColorIsC;
	}

	public void setP2ColorIsC(boolean p2ColorIsC) {
		this.p2ColorIsC = p2ColorIsC;
	}
	
//	public static void main(String[] args) {
//		ColorChoice cMenu = new ColorChoice();
//		cMenu.createColorMenu();
//		
//	}
}
