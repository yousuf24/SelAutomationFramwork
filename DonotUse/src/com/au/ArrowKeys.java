package com.au;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class ArrowKeys {
	public ArrowKeys() {
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setFocusable(true);
		
		JPanel panel=new JPanel();
		JLabel up=new JLabel();
		JLabel down=new JLabel();
		JLabel right=new JLabel();
		JLabel left=new JLabel();
			
		panel.add(up);panel.add(down);panel.add(left);panel.add(right);
		up.setText("Up: 0");
		down.setText("Down: 0");
		left.setText("Left: 0");
		right.setText("Right: 0");
		frame.add(panel);
		frame.addKeyListener(new KeyListener() {
			int upC=0,downC=0,leftC=0,rightC=0;
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				int keyC=e.getKeyCode();
				switch(keyC) {
				case KeyEvent.VK_UP:
					up.setText("Up: "+ Integer.toString(upC++));break;
				
				case KeyEvent.VK_DOWN:
				down.setText("Down: "+ Integer.toString(downC++));break;
			
				case KeyEvent.VK_RIGHT:
					right.setText("Right: "+ Integer.toString(rightC++));break;
		
				case KeyEvent.VK_LEFT:
					left.setText("Left: "+ Integer.toString(leftC++));break;
		}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			};
		
		});
		
	}

	public static void main(String[] args) {
		new ArrowKeys();

	}

}
