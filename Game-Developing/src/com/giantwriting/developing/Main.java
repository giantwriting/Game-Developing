package com.giantwriting.developing;

import javax.swing.JFrame;


public class Main {

	public static void main(String args[]){
		
		
		// Swingutilitys.invokeLater();
		new Main();
		
		
	}
	
	
	public Main(){
		
		JFrame frame = new JFrame("Game Deving");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Icon
		
		//Cutom Cursor
		
		frame.add(new Screen(frame));
		
	
		
		frame.setVisible(true);
		
	
		
		
		
	}
	
	
	
}



