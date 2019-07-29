package BallMoving;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class BallMoving extends JFrame {
	
	private JPanel panel = new JPanel();
	
	//Thong tin ve san
	private int maxCol = 6;
	private int maxRow = 6;
	
	//Them button
	private JButton [][] buttons = new JButton[maxRow][maxCol];
	
	//Them vi tri vien bi
	private int row = 2;
	private int col = 2;
	
	public BallMoving() {
		
		//Thiet lap co ban
		setTitle("Ball Moving");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
		
		//Them Button
		JButton button_1 = new JButton("Up");
		//su kien nut len
		button_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				movieUp();
				
			}
		});
		
		this.add(button_1,BorderLayout.PAGE_START);
		
		JButton button_2 = new JButton("Down");
		//su kien nut xuong
		button_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				moiveDown();
			}
		});
		
		this.add(button_2, BorderLayout.PAGE_END);
		//su kien nut sag trai
		JButton button_3 = new JButton("Left");
		
		button_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				movieLeft();
			}
		});
		
		this.add(button_3, BorderLayout.LINE_START);
		//su kien nut sag phai
		JButton button_4 = new JButton("Right");
		
		button_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				movieRight();
			}
		});
		
		this.add(button_4, BorderLayout.LINE_END);
		
		//Chia san
		
		for (int i = 0; i < maxRow; i++) {
			for (int j = 0; j < maxCol; j++) {
				buttons[i][j] = new JButton();
				panel.add(buttons[i][j]);
			}
		}
		
			buttons[row][col].setText("0");
		
		this.add(panel);
		panel.setLayout(new GridLayout(6, 6));
	}

	//Xu ly su kien
	protected void movieRight() {
		removeBall();
		if(col < maxCol) {
			col++;
		}
		
		addBall();
	}
	
	protected void movieLeft() {
		removeBall();
		if(col > 0) {
			col--;
		}
		addBall();
	}
	
	protected void movieUp() {
		removeBall();
		if(row > 0) {
			row--;
		}
		addBall();
	}
	
	protected void moiveDown() {
		removeBall();
		if(row < maxRow) {
			row++;
		}
		addBall();
	}
	
	
	//Them ball vao o can hien thi,thay doi vi tri ball
	private void addBall() {
		
			buttons[row][col].setText("0");
	}
	
	//Xoa ball khi vi tri khi thay doi
	private void removeBall() {
		buttons[row][col].setText("");
	}
public static void main(String[] args) {
		BallMoving ball = new BallMoving();
		ball.setVisible(true);
	}
}
