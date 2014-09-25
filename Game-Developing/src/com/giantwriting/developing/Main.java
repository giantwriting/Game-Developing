package com.giantwriting.developing;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Main {
	
	public static final String TITLE = "Game Deving";
	public static int SCREEN_WIDTH;
	public static int SCREEN_HEIGHT;
	

	public static void main(String[] args){
        // Makes sure the GUI updates correctly
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
	
	public Main(){
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		SCREEN_WIDTH = toolkit.getScreenSize().width;
		SCREEN_HEIGHT = toolkit.getScreenSize().height;
		
		
		JFrame frame = new JFrame(TITLE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Icon
		
		//Cutom Cursor
		
		frame.add(new Screen(frame));
		
	
		
		frame.setVisible(true);
		
	
		
		
		
	}
	
	
	
}



