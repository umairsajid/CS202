package examplesLab7;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TwoPlayer {
	
	JFrame gameFrame;
	JButton b1; boolean b1OffStatus = true;
	JButton b2; boolean b2OffStatus = true;
	JButton b3; boolean b3OffStatus = true;
	JButton b4; boolean b4OffStatus = true;
	JButton b5; boolean b5OffStatus = true;
	JButton b6; boolean b6OffStatus = true;
	JButton b7; boolean b7OffStatus = true;
	JButton b8; boolean b8OffStatus = true;
	JButton b9; boolean b9OffStatus = true; 
	JButton b10; boolean b10OffStatus = true; 
	JButton b11; boolean b11OffStatus = true;
	JButton b12; boolean b12OffStatus = true;
	JButton b13; boolean b13OffStatus = true;
	JButton b14; boolean b14OffStatus = true;
	JButton b15; boolean b15OffStatus = true;
	JButton b16; boolean b16OffStatus = true;
	JButton b17; boolean b17OffStatus = true;
	JButton b18; boolean b18OffStatus = true;
	JButton b19; boolean b19OffStatus = true;
	JButton b20; boolean b20OffStatus = true;
	JButton b21; boolean b21OffStatus = true;
	JButton b22; boolean b22OffStatus = true;
	JButton b23; boolean b23OffStatus = true;
	JButton b24; boolean b24OffStatus = true;
	JButton b25; boolean b25OffStatus = true;
	JButton b26; boolean b26OffStatus = true;
	JButton b27; boolean b27OffStatus = true;
	JButton b28; boolean b28OffStatus = true;
	JButton b29; boolean b29OffStatus = true;
	JButton b30; boolean b30OffStatus = true;
	JButton b31; boolean b31OffStatus = true;
	JButton b32; boolean b32OffStatus = true;
	JButton b33; boolean b33OffStatus = true;
	JButton b34; boolean b34OffStatus = true;
	JButton b35; boolean b35OffStatus = true;
	JButton b36; boolean b36OffStatus = true;
	JButton b37; boolean b37OffStatus = true;
	JButton b38; boolean b38OffStatus = true;
	JButton b39; boolean b39OffStatus = true;
	JButton b40; boolean b40OffStatus = true;
	JButton b41; boolean b41OffStatus = true;
	JButton b42; boolean b42OffStatus = true;
	
	void createAndShowBoard(){
		b1 = new RoundButton("");
	    b1.setBackground(Color.lightGray);
	    b2 = new RoundButton("");
	    b2.setBackground(Color.lightGray);
	    b3 = new RoundButton("");
	    b3.setBackground(Color.lightGray);
	    b4 = new RoundButton("");
	    b4.setBackground(Color.lightGray);
	    b5 = new RoundButton("");
	    b5.setBackground(Color.lightGray);
	    b6 = new RoundButton("");
	    b6.setBackground(Color.lightGray);
	    b7 = new RoundButton("");
	    b7.setBackground(Color.lightGray);
	    b8 = new RoundButton("");
	    b8.setBackground(Color.lightGray);
	    b9 = new RoundButton("");
	    b9.setBackground(Color.lightGray);
	    b10 = new RoundButton("");
	    b10.setBackground(Color.lightGray);
	    b11 = new RoundButton("");
	    b11.setBackground(Color.lightGray);
	    b12 = new RoundButton("");
	    b12.setBackground(Color.lightGray);
	    b13 = new RoundButton("");
	    b13.setBackground(Color.lightGray);
	    b14 = new RoundButton("");
	    b14.setBackground(Color.lightGray);
	    b15 = new RoundButton("");
	    b15.setBackground(Color.lightGray);
	    b16 = new RoundButton("");
	    b16.setBackground(Color.lightGray);
	    b17 = new RoundButton("");
	    b17.setBackground(Color.lightGray);
	    b18 = new RoundButton("");
	    b18.setBackground(Color.lightGray);
	    b19 = new RoundButton("");
	    b19.setBackground(Color.lightGray);
	    b20 = new RoundButton("");
	    b20.setBackground(Color.lightGray);
	    b21 = new RoundButton("");
	    b21.setBackground(Color.lightGray);
	    b22 = new RoundButton("");
	    b22.setBackground(Color.lightGray);
	    b23 = new RoundButton("");
	    b23.setBackground(Color.lightGray);
	    b24 = new RoundButton("");
	    b24.setBackground(Color.lightGray);
	    b25 = new RoundButton("");
	    b25.setBackground(Color.lightGray);
	    b26 = new RoundButton("");
	    b26.setBackground(Color.lightGray);
	    b27 = new RoundButton("");
	    b27.setBackground(Color.lightGray);
	    b28 = new RoundButton("");
	    b28.setBackground(Color.lightGray);
	    b29 = new RoundButton("");
	    b29.setBackground(Color.lightGray);
	    b30 = new RoundButton("");
	    b30.setBackground(Color.lightGray);
	    b31 = new RoundButton("");
	    b31.setBackground(Color.lightGray);
	    b32 = new RoundButton("");
	    b32.setBackground(Color.lightGray);
	    b33 = new RoundButton("");
	    b33.setBackground(Color.lightGray);
	    b34 = new RoundButton("");
	    b34.setBackground(Color.lightGray);
	    b35 = new RoundButton("");
	    b35.setBackground(Color.lightGray);
	    b36 = new RoundButton("");
	    b36.setBackground(Color.lightGray);
	    b37 = new RoundButton("");
	    b37.setBackground(Color.lightGray);
	    b38 = new RoundButton("");
	    b38.setBackground(Color.lightGray);
	    b39 = new RoundButton("");
	    b39.setBackground(Color.lightGray);
	    b40 = new RoundButton("");
	    b40.setBackground(Color.lightGray);
	    b41 = new RoundButton("");
	    b41.setBackground(Color.lightGray);
	    b42 = new RoundButton("");
	    b42.setBackground(Color.lightGray);
	    
	    gameFrame = new JFrame("Connect Four");
 
	    gameFrame.getContentPane().setBackground(Color.BLACK);
	    gameFrame.getContentPane().add(b1);
	    gameFrame.getContentPane().add(b2);
	    gameFrame.getContentPane().add(b3);
	    gameFrame.getContentPane().add(b4);
	    gameFrame.getContentPane().add(b5);
	    gameFrame.getContentPane().add(b6);
	    gameFrame.getContentPane().add(b7);
	    gameFrame.getContentPane().add(b8);
	    gameFrame.getContentPane().add(b9);
	    gameFrame.getContentPane().add(b10);
	    gameFrame.getContentPane().add(b11);
	    gameFrame.getContentPane().add(b12);
	    gameFrame.getContentPane().add(b13);
	    gameFrame.getContentPane().add(b14);
	    gameFrame.getContentPane().add(b15);
	    gameFrame.getContentPane().add(b16);
	    gameFrame.getContentPane().add(b17);
	    gameFrame.getContentPane().add(b18);
	    gameFrame.getContentPane().add(b19);
	    gameFrame.getContentPane().add(b20);
	    gameFrame.getContentPane().add(b21);
	    gameFrame.getContentPane().add(b22);
	    gameFrame.getContentPane().add(b23);
	    gameFrame.getContentPane().add(b24);
	    gameFrame.getContentPane().add(b25);
	    gameFrame.getContentPane().add(b26);
	    gameFrame.getContentPane().add(b27);
	    gameFrame.getContentPane().add(b28);
	    gameFrame.getContentPane().add(b29);
	    gameFrame.getContentPane().add(b30);
	    gameFrame.getContentPane().add(b31);
	    gameFrame.getContentPane().add(b32);
	    gameFrame.getContentPane().add(b33);
	    gameFrame.getContentPane().add(b34);
	    gameFrame.getContentPane().add(b35);
	    gameFrame.getContentPane().add(b36);
	    gameFrame.getContentPane().add(b37);
	    gameFrame.getContentPane().add(b38);
	    gameFrame.getContentPane().add(b39);
	    gameFrame.getContentPane().add(b40);
	    gameFrame.getContentPane().add(b41);
	    gameFrame.getContentPane().add(b42);
		
		gameFrame.getContentPane().setLayout(new GridLayout(6, 7));
		gameFrame.setSize(500, 500);
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true);
	}
	
	void playGame(){
		//column 1
		b1.addActionListener(new column1a());
		b8.addActionListener(new column1a());
		b15.addActionListener(new column1a());
		b22.addActionListener(new column1a());
		b29.addActionListener(new column1a());
		b36.addActionListener(new column1a());
		b1.addActionListener(new column1b());
		b8.addActionListener(new column1b());
		b15.addActionListener(new column1b());
		b22.addActionListener(new column1b());
		b29.addActionListener(new column1b());
		b36.addActionListener(new column1b());
		b1.addActionListener(new column1c());
		b8.addActionListener(new column1c());
		b15.addActionListener(new column1c());
		b22.addActionListener(new column1c());
		b29.addActionListener(new column1c());
		b36.addActionListener(new column1c());
		b1.addActionListener(new column1d());
		b8.addActionListener(new column1d());
		b15.addActionListener(new column1d());
		b22.addActionListener(new column1d());
		b29.addActionListener(new column1d());
		b36.addActionListener(new column1d());
		b1.addActionListener(new column1e());
		b8.addActionListener(new column1e());
		b15.addActionListener(new column1e());
		b22.addActionListener(new column1e());
		b29.addActionListener(new column1e());
		b36.addActionListener(new column1e());
		b1.addActionListener(new column1f());
		b8.addActionListener(new column1f());
		b15.addActionListener(new column1f());
		b22.addActionListener(new column1f());
		b29.addActionListener(new column1f());
		b36.addActionListener(new column1f());
		
		//column 2
		b2.addActionListener(new column2a());
		b9.addActionListener(new column2a());
		b16.addActionListener(new column2a());
		b23.addActionListener(new column2a());
		b30.addActionListener(new column2a());
		b37.addActionListener(new column2a());
		b2.addActionListener(new column2b());
		b9.addActionListener(new column2b());
		b16.addActionListener(new column2b());
		b23.addActionListener(new column2b());
		b30.addActionListener(new column2b());
		b37.addActionListener(new column2b());
		b2.addActionListener(new column2c());
		b9.addActionListener(new column2c());
		b16.addActionListener(new column2c());
		b23.addActionListener(new column2c());
		b30.addActionListener(new column2c());
		b37.addActionListener(new column2c());
		b2.addActionListener(new column2d());
		b9.addActionListener(new column2d());
		b16.addActionListener(new column2d());
		b23.addActionListener(new column2d());
		b30.addActionListener(new column2d());
		b37.addActionListener(new column2d());
		b2.addActionListener(new column2e());
		b9.addActionListener(new column2e());
		b16.addActionListener(new column2e());
		b23.addActionListener(new column2e());
		b30.addActionListener(new column2e());
		b37.addActionListener(new column2e());
		b2.addActionListener(new column2f());
		b9.addActionListener(new column2f());
		b16.addActionListener(new column2f());
		b23.addActionListener(new column2f());
		b30.addActionListener(new column2f());
		b37.addActionListener(new column2f());
		
		//column 3
		b3.addActionListener(new column3a());
		b10.addActionListener(new column3a());
		b17.addActionListener(new column3a());
		b24.addActionListener(new column3a());
		b31.addActionListener(new column3a());
		b38.addActionListener(new column3a());
		b3.addActionListener(new column3b());
		b10.addActionListener(new column3b());
		b17.addActionListener(new column3b());
		b24.addActionListener(new column3b());
		b31.addActionListener(new column3b());
		b38.addActionListener(new column3b());
		b3.addActionListener(new column3c());
		b10.addActionListener(new column3c());
		b17.addActionListener(new column3c());
		b24.addActionListener(new column3c());
		b31.addActionListener(new column3c());
		b38.addActionListener(new column3c());
		b3.addActionListener(new column3d());
		b10.addActionListener(new column3d());
		b17.addActionListener(new column3d());
		b24.addActionListener(new column3d());
		b31.addActionListener(new column3d());
		b38.addActionListener(new column3d());
		b3.addActionListener(new column3e());
		b10.addActionListener(new column3e());
		b17.addActionListener(new column3e());
		b24.addActionListener(new column3e());
		b31.addActionListener(new column3e());
		b38.addActionListener(new column3e());
		b3.addActionListener(new column3f());
		b10.addActionListener(new column3f());
		b17.addActionListener(new column3f());
		b24.addActionListener(new column3f());
		b31.addActionListener(new column3f());
		b38.addActionListener(new column3f());
		
		//column 4
		b4.addActionListener(new column4a());
		b11.addActionListener(new column4a());
		b18.addActionListener(new column4a());
		b25.addActionListener(new column4a());
		b32.addActionListener(new column4a());
		b39.addActionListener(new column4a());
		b4.addActionListener(new column4b());
		b11.addActionListener(new column4b());
		b18.addActionListener(new column4b());
		b25.addActionListener(new column4b());
		b32.addActionListener(new column4b());
		b39.addActionListener(new column4b());
		b4.addActionListener(new column4c());
		b11.addActionListener(new column4c());
		b18.addActionListener(new column4c());
		b25.addActionListener(new column4c());
		b32.addActionListener(new column4c());
		b39.addActionListener(new column4c());
		b4.addActionListener(new column4d());
		b11.addActionListener(new column4d());
		b18.addActionListener(new column4d());
		b25.addActionListener(new column4d());
		b32.addActionListener(new column4d());
		b39.addActionListener(new column4d());
		b4.addActionListener(new column4e());
		b11.addActionListener(new column4e());
		b18.addActionListener(new column4e());
		b25.addActionListener(new column4e());
		b32.addActionListener(new column4e());
		b39.addActionListener(new column4e());
		b4.addActionListener(new column4f());
		b11.addActionListener(new column4f());
		b18.addActionListener(new column4f());
		b25.addActionListener(new column4f());
		b32.addActionListener(new column4f());
		b39.addActionListener(new column4f());
		
		//column 5
		b5.addActionListener(new column5a());
		b12.addActionListener(new column5a());
		b19.addActionListener(new column5a());
		b26.addActionListener(new column5a());
		b33.addActionListener(new column5a());
		b40.addActionListener(new column5a());
		b5.addActionListener(new column5b());
		b12.addActionListener(new column5b());
		b19.addActionListener(new column5b());
		b26.addActionListener(new column5b());
		b33.addActionListener(new column5b());
		b40.addActionListener(new column5b());
		b5.addActionListener(new column5c());
		b12.addActionListener(new column5c());
		b19.addActionListener(new column5c());
		b26.addActionListener(new column5c());
		b33.addActionListener(new column5c());
		b40.addActionListener(new column5c());
		b5.addActionListener(new column5d());
		b12.addActionListener(new column5d());
		b19.addActionListener(new column5d());
		b26.addActionListener(new column5d());
		b33.addActionListener(new column5d());
		b40.addActionListener(new column5d());
		b5.addActionListener(new column5e());
		b12.addActionListener(new column5e());
		b19.addActionListener(new column5e());
		b26.addActionListener(new column5e());
		b33.addActionListener(new column5e());
		b40.addActionListener(new column5e());
		b5.addActionListener(new column5f());
		b12.addActionListener(new column5f());
		b19.addActionListener(new column5f());
		b26.addActionListener(new column5f());
		b33.addActionListener(new column5f());
		b40.addActionListener(new column5f());
		
		//column 6
		b6.addActionListener(new column6a());
		b13.addActionListener(new column6a());
		b20.addActionListener(new column6a());
		b27.addActionListener(new column6a());
		b34.addActionListener(new column6a());
		b41.addActionListener(new column6a());
		b6.addActionListener(new column6b());
		b13.addActionListener(new column6b());
		b20.addActionListener(new column6b());
		b27.addActionListener(new column6b());
		b34.addActionListener(new column6b());
		b41.addActionListener(new column6b());
		b6.addActionListener(new column6c());
		b13.addActionListener(new column6c());
		b20.addActionListener(new column6c());
		b27.addActionListener(new column6c());
		b34.addActionListener(new column6c());
		b41.addActionListener(new column6c());
		b6.addActionListener(new column6d());
		b13.addActionListener(new column6d());
		b20.addActionListener(new column6d());
		b27.addActionListener(new column6d());
		b34.addActionListener(new column6d());
		b41.addActionListener(new column6d());
		b6.addActionListener(new column6e());
		b13.addActionListener(new column6e());
		b20.addActionListener(new column6e());
		b27.addActionListener(new column6e());
		b34.addActionListener(new column6e());
		b41.addActionListener(new column6e());
		b6.addActionListener(new column6f());
		b13.addActionListener(new column6f());
		b20.addActionListener(new column6f());
		b27.addActionListener(new column6f());
		b34.addActionListener(new column6f());
		b41.addActionListener(new column6f());
		
		//column 7
		b7.addActionListener(new column7a());
		b14.addActionListener(new column7a());
		b21.addActionListener(new column7a());
		b28.addActionListener(new column7a());
		b35.addActionListener(new column7a());
		b42.addActionListener(new column7a());
		b7.addActionListener(new column7b());
		b14.addActionListener(new column7b());
		b21.addActionListener(new column7b());
		b28.addActionListener(new column7b());
		b35.addActionListener(new column7b());
		b42.addActionListener(new column7b());
		b7.addActionListener(new column7c());
		b14.addActionListener(new column7c());
		b21.addActionListener(new column7c());
		b28.addActionListener(new column7c());
		b35.addActionListener(new column7c());
		b42.addActionListener(new column7c());
		b7.addActionListener(new column7d());
		b14.addActionListener(new column7d());
		b21.addActionListener(new column7d());
		b28.addActionListener(new column7d());
		b35.addActionListener(new column7d());
		b42.addActionListener(new column7d());
		b7.addActionListener(new column7e());
		b14.addActionListener(new column7e());
		b21.addActionListener(new column7e());
		b28.addActionListener(new column7e());
		b35.addActionListener(new column7e());
		b42.addActionListener(new column7e());
		b7.addActionListener(new column7f());
		b14.addActionListener(new column7f());
		b21.addActionListener(new column7f());
		b28.addActionListener(new column7f());
		b35.addActionListener(new column7f());
		b42.addActionListener(new column7f());
	}	
	
	private class column1a implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			if(b36OffStatus == true){
				b36.setBackground(Color.green);
				b36OffStatus = false;
			}
		}
	}	
	private class column1b implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b36OffStatus == false){
				b29.setBackground(Color.green);
				b29OffStatus = false;
			}
		}
	}	
	private class column1c implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b36OffStatus == false && b29OffStatus == false){
				b22.setBackground(Color.green);
				b22OffStatus = false;
			}
		}
	}
	private class column1d implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b36OffStatus == false && b29OffStatus == false && b22OffStatus == false){
				b15.setBackground(Color.green);
				b15OffStatus = false;
			}
		}
	}
	private class column1e implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b36OffStatus == false && b29OffStatus == false && b22OffStatus == false && b15OffStatus == false){
				b8.setBackground(Color.green);
				b8OffStatus = false;
			}
		}
	}
	private class column1f implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b36OffStatus == false && b29OffStatus == false && b22OffStatus == false && b15OffStatus == false && b8OffStatus == false){
				b1.setBackground(Color.green);
				b1OffStatus = false;
			}
		}
	}
	
	private class column2a implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			if(b37OffStatus == true){
				b37.setBackground(Color.green);
				b37OffStatus = false;
			}
		}
	}	
	private class column2b implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b37OffStatus == false){
				b30.setBackground(Color.green);
				b30OffStatus = false;
			}
		}
	}	
	private class column2c implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b37OffStatus == false && b30OffStatus == false){
				b23.setBackground(Color.green);
				b23OffStatus = false;
			}
		}
	}
	private class column2d implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b37OffStatus == false && b30OffStatus == false && b23OffStatus == false){
				b16.setBackground(Color.green);
				b16OffStatus = false;
			}
		}
	}
	private class column2e implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b37OffStatus == false && b30OffStatus == false && b23OffStatus == false && b16OffStatus == false){
				b9.setBackground(Color.green);
				b9OffStatus = false;
			}
		}
	}
	private class column2f implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b37OffStatus == false && b30OffStatus == false && b23OffStatus == false && b16OffStatus == false && b9OffStatus == false){
				b2.setBackground(Color.green);
				b2OffStatus = false;
			}
		}
	}

	private class column3a implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			if(b38OffStatus == true){
				b38.setBackground(Color.green);
				b38OffStatus = false;
			}
		}
	}	
	private class column3b implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b38OffStatus == false){
				b31.setBackground(Color.green);
				b31OffStatus = false;
			}
		}
	}	
	private class column3c implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b38OffStatus == false && b31OffStatus == false){
				b24.setBackground(Color.green);
				b24OffStatus = false;
			}
		}
	}
	private class column3d implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b38OffStatus == false && b31OffStatus == false && b24OffStatus == false){
				b17.setBackground(Color.green);
				b17OffStatus = false;
			}
		}
	}
	private class column3e implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b38OffStatus == false && b31OffStatus == false && b24OffStatus == false && b17OffStatus == false){
				b10.setBackground(Color.green);
				b10OffStatus = false;
			}
		}
	}
	private class column3f implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b38OffStatus == false && b31OffStatus == false && b24OffStatus == false && b17OffStatus == false && b10OffStatus == false){
				b3.setBackground(Color.green);
				b3OffStatus = false;
			}
		}
	}
	
	private class column4a implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			if(b39OffStatus == true){
				b39.setBackground(Color.green);
				b39OffStatus = false;
			}
		}
	}	
	private class column4b implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b39OffStatus == false){
				b32.setBackground(Color.green);
				b32OffStatus = false;
			}
		}
	}	
	private class column4c implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b39OffStatus == false && b32OffStatus == false){
				b25.setBackground(Color.green);
				b25OffStatus = false;
			}
		}
	}
	private class column4d implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b39OffStatus == false && b32OffStatus == false && b25OffStatus == false){
				b18.setBackground(Color.green);
				b18OffStatus = false;
			}
		}
	}
	private class column4e implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b39OffStatus == false && b32OffStatus == false && b25OffStatus == false && b18OffStatus == false){
				b11.setBackground(Color.green);
				b11OffStatus = false;
			}
		}
	}
	private class column4f implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b39OffStatus == false && b32OffStatus == false && b25OffStatus == false && b18OffStatus == false && b11OffStatus == false){
				b4.setBackground(Color.green);
				b4OffStatus = false;
			}
		}
	}
	
	private class column5a implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			if(b40OffStatus == true){
				b40.setBackground(Color.green);
				b40OffStatus = false;
			}
		}
	}	
	private class column5b implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b40OffStatus == false){
				b33.setBackground(Color.green);
				b33OffStatus = false;
			}
		}
	}	
	private class column5c implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b40OffStatus == false && b33OffStatus == false){
				b26.setBackground(Color.green);
				b26OffStatus = false;
			}
		}
	}
	private class column5d implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b40OffStatus == false && b33OffStatus == false && b26OffStatus == false){
				b19.setBackground(Color.green);
				b19OffStatus = false;
			}
		}
	}
	private class column5e implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b40OffStatus == false && b33OffStatus == false && b26OffStatus == false && b19OffStatus == false){
				b12.setBackground(Color.green);
				b12OffStatus = false;
			}
		}
	}
	private class column5f implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b40OffStatus == false && b33OffStatus == false && b26OffStatus == false && b19OffStatus == false && b12OffStatus == false){
				b5.setBackground(Color.green);
				b5OffStatus = false;
			}
		}
	}
	
	private class column6a implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			if(b41OffStatus == true){
				b41.setBackground(Color.green);
				b41OffStatus = false;
			}
		}
	}	
	private class column6b implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b41OffStatus == false){
				b34.setBackground(Color.green);
				b34OffStatus = false;
			}
		}
	}	
	private class column6c implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b41OffStatus == false && b34OffStatus == false){
				b27.setBackground(Color.green);
				b27OffStatus = false;
			}
		}
	}
	private class column6d implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b41OffStatus == false && b34OffStatus == false && b27OffStatus == false){
				b20.setBackground(Color.green);
				b20OffStatus = false;
			}
		}
	}
	private class column6e implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b41OffStatus == false && b34OffStatus == false && b27OffStatus == false && b20OffStatus == false){
				b13.setBackground(Color.green);
				b13OffStatus = false;
			}
		}
	}
	private class column6f implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b41OffStatus == false && b34OffStatus == false && b27OffStatus == false && b20OffStatus == false && b13OffStatus == false){
				b6.setBackground(Color.green);
				b6OffStatus = false;
			}
		}
	}
	
	private class column7a implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			if(b42OffStatus == true){
				b42.setBackground(Color.green);
				b42OffStatus = false;
			}
		}
	}	
	private class column7b implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b42OffStatus == false){
				b35.setBackground(Color.green);
				b35OffStatus = false;
			}
		}
	}	
	private class column7c implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b42OffStatus == false && b35OffStatus == false){
				b28.setBackground(Color.green);
				b28OffStatus = false;
			}
		}
	}
	private class column7d implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b42OffStatus == false && b35OffStatus == false && b28OffStatus == false){
				b21.setBackground(Color.green);
				b21OffStatus = false;
			}
		}
	}
	private class column7e implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b42OffStatus == false && b35OffStatus == false && b28OffStatus == false && b21OffStatus == false){
				b14.setBackground(Color.green);
				b14OffStatus = false;
			}
		}
	}
	private class column7f implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(b42OffStatus == false && b35OffStatus == false && b28OffStatus == false && b21OffStatus == false && b14OffStatus == false){
				b7.setBackground(Color.green);
				b7OffStatus = false;
			}
		}
	}

//	public static void main(String[] args) {
//		TwoPlayer connect4 = new TwoPlayer();
//		connect4.createAndShowBoard();
//		connect4.playGame();
//		
//	}

}
