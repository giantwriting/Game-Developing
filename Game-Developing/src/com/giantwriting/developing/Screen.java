package com.giantwriting.developing;

import javax.swing.*;

public class Screen extends JPanel implements Runnable{

		
	

	Thread thread;

	
	
	public Screen(JFrame frame){
		thread = new Thread();
		thread.start();
	}
	
	@Override
	public void run() {
	
		int TICKS_PER_SECONDS = 60;
		int FRAMES_PER_SECONDS = 60;
		
		while(true) {
			
		}
		
	}

	
	
	
}