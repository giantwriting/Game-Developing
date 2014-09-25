package com.giantwriting.developing;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class Screen extends JPanel implements Runnable{
	
	Thread thread;
	Map map;

	
	int fps = 0;
	int ups = 0;
	
	
	public Screen(JFrame frame){
		frame.addKeyListener(new KeyListener() {
		
				@Override
				public void keyTyped(KeyEvent e) {
			
			
				}

				@Override
				public void keyPressed(KeyEvent e) {
					
					
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					
					
				}
	

				
				
	});

		frame.addMouseListener(new MouseListener() {
	

				@Override
				public void mouseClicked(MouseEvent e) {
					
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					
			
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					
					
				}

				@Override
				public void mousePressed(MouseEvent e) {
					
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
			
					
				}
				
				
		});
		
		frame.addMouseMotionListener(new MouseMotionListener () {
			
	

		@Override
		public void mouseDragged(MouseEvent e) {
			
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			
			
		}
				
				
				
		});
		
		
		
		map = new Map();
		
		
		
		// Should Be last thing to be called bry renderre
		thread = new Thread();
		thread.start();
	}

	private void update(){
		
	}
	
	public void paintComponent(Graphics g){
		g.clearRect(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_WIDTH);
		
	}
	
	@Override
	public void run() {
		
		boolean print_fps_to_console = false;
	
		int UPDATES_PER_SECONDS = 50;
		int FRAMES_PER_SECONDS = 100;
		
		
		long GAME_SKIP_TICKS = 1000 / UPDATES_PER_SECONDS;
		long FRAME_SKIP_TICKS = 1000 / FRAMES_PER_SECONDS;
		long MAX_FRAMESKIPS = 5;
		
		
		long next_game_tick = System.currentTimeMillis();
		long next_frame_tick = System.currentTimeMillis();
		long time = System.currentTimeMillis();
		
		int loops;
		
		// Variables to update the UPS & FPS variables
		int frames = 0;
		int updates = 0;
			
		
		while(true) {
			loops = 0;
			while(System.currentTimeMillis() >  next_game_tick && loops < MAX_FRAMESKIPS){
				update();
				
				next_game_tick += GAME_SKIP_TICKS;
				updates++;
				loops++;
				
				
			}
			

			
			if(System.currentTimeMillis() > next_frame_tick ){
				
				next_frame_tick += FRAME_SKIP_TICKS;
				
				repaint();
				frames++;
				
			}
			
			
			if(time+1000 <= System.currentTimeMillis()){
				time+=1000;
				
				
				fps = frames;
				ups = updates;
				updates = 0;
				frames = 0;
				
				
				
				if(print_fps_to_console) {
					
					System.out.println("FPS: " + fps);
					System.out.println("UPS: "+ ups);
				}
				
				
			
		}
		
	}

}
	}