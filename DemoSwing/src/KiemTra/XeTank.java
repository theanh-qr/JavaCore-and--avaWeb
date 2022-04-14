package KiemTra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.awt.*;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class XeTank {
	private JFrame f;
	private JLabel xeTang, bom;
	private JButton up, down, left ,right;
	public static int xT = 10,yT = 10,wT = 80 ,hT = 85;
	public static int xB = 150,yB = 200,wB = 85,hB = 85;
	
	public XeTank() {
		f = new JFrame("Game Xe Tăng");
		//Hình xe tăng
	
		xeTang = new JLabel("Game Xe Tăng");
		xeTang.setIcon(new ImageIcon("C:\\\\Users\\\\THE ANH\\\\eclipse-workspace\\\\DemoSwing\\\\src\\\\KiemTra\\\\Images\\\\xe_tank.png"));
		xeTang.setBounds(xT, yT, wT, hT);
		xeTang.getAccessibleContext();
		f.add(xeTang);
		//Hình trái bom
		bom = new JLabel("");
		bom.setIcon(new ImageIcon("C:\\\\Users\\\\THE ANH\\\\eclipse-workspace\\\\DemoSwing\\\\src\\\\KiemTra\\\\Images\\\\bom.png"));
		bom.setBounds(xB, yB, wB, hB);
		f.add(bom);
		
		//Nút tiến
		up = new JButton("Up");
		up.setBounds(865, 10, 75, 20);
		up.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int  getXT = xeTang.getX();
				int getYT = xeTang.getY();
				int getXB = bom.getX();
				int getYB = bom.getY();
				xeTang.setBounds(getXT, getYT-5, wT, hT);
				f.add(xeTang);
				//(getXT+wT == getXB && getYT <= getYB+hB) || (getXT + wT == getXB + wB && getYT == getYB + hB)
				if(getXT == getXB && getYT == getYB) {
					Component rootPane = null;
					JOptionPane.showMessageDialog(rootPane, "Bạn đã thua");
				}
			}
		});
		up.setMnemonic(KeyEvent.VK_UP);
		up.setToolTipText("Bấm nút này để cho xe tăng tiến lên");
		f.add(up);
		
		//Nút xuống
		up = new JButton("Down");
		up.setBounds(865, 50, 75, 20);
		up.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int  getXT = xeTang.getX();
				int getYT = xeTang.getY();
				int getXB = bom.getX();
				int getYB = bom.getY();
				xeTang.setBounds(getXT, getYT+5, wT, hT);
				f.add(xeTang);
				if(getXT == getXB || getYT == getYB) {
					Component rootPane = null;
					JOptionPane.showMessageDialog(rootPane, "Bạn đã thua");
				}
				
			}
		});
		up.setMnemonic(KeyEvent.VK_DOWN);
		up.setToolTipText("Bấm nút này để cho xe tăng lùi xuống");
		f.add(up);
		
		//Nút sang phải
		up = new JButton("Right");
		up.setBounds(900, 30, 75, 20);
		up.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int  getXT = xeTang.getX();
				int getYT = xeTang.getY();
				int getXB = bom.getX();
				int getYB = bom.getY();
				xeTang.setBounds(getXT+5, getYT, wT, hT);
				f.add(xeTang);
				if(getXT == getXB || getYT == getYB) {
					Component rootPane = null;
					JOptionPane.showMessageDialog(rootPane, "Bạn đã thua");
				}
			}
		});
		up.setMnemonic(KeyEvent.VK_RIGHT);
		up.setToolTipText("Bấm nút này để cho xe tăng sang phải");
		f.add(up);
		
		//Nút sang trái
		up = new JButton("Left");
		up.setBounds(825, 30, 75, 20);
		up.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int  getXT = xeTang.getX();
				int getYT = xeTang.getY();
				int getXB = bom.getX();
				int getYB = bom.getY();
				xeTang.setBounds(getXT-5, getYT, wT, hT);
				f.add(xeTang);
				if(getXT == getXB || getYT == getYB) {
					Component rootPane = null;
					JOptionPane.showMessageDialog(rootPane, "Bạn đã thua");
				}
			}
		});
		up.setMnemonic(KeyEvent.VK_LEFT);
		up.setToolTipText("Bấm nút này để cho xe tăng sang trái");
		f.add(up);
		
		//Screen
		f.setSize(1000, 500);
		f.setLocationRelativeTo(null);
		f.getContentPane().setBackground(Color.black);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new XeTank();
	}

}
