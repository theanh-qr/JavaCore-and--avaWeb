package Demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
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

public class HelloSwing extends JFrame {
	private JTextField t1, t2;
	private JLabel l1, l2, text,img;
	private JButton b, b1,b2,ok;

	public HelloSwing() {
		JFrame f = new JFrame("Hello Swing");
		
//		Icon icon = new ImageIcon(getClass().getResource("logo.png"));

		b = new JButton("Hiện thông báo");
		b.setBounds(600, 30, 150, 20);
		//Sự kiện khi click
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(rootPane, "Bạn vừa click nut thông báo");
			}
		});
		//Sự kiện tạo chữ chữa phím tắt để dùng nút
		b.setMnemonic(KeyEvent.VK_H);//phím tắt là: Alt + H
		//Sự kiện khi đưa chuột qua nút thì hiện 1 dòng thông báo
		b.setToolTipText("Bấm nút này để hiên thông báo");
		f.add(b);

		b1 = new JButton("Thoát");
		b1.setBounds(300, 30, 150, 20);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		b1.setMnemonic(KeyEvent.VK_T);
		b1.setToolTipText("Bấm nút này để thoát");
		f.add(b1);
		
		b2 = new JButton("Hiện câu hỏi");
		b2.setBounds(450, 30, 150, 20);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(rootPane, "Bạn ăn cơm chưa ?");
			}
		});
		b2.setToolTipText("Bấm nút này để hiện câu hỏi");
		b2.setMnemonic(KeyEvent.VK_C);
		f.add(b2);
		
		ok = new JButton("OK");
		ok.setBounds(150, 200, 100, 20);
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText("Hiện");
				text.setBackground(Color.blue);
			}
		});
		ok.setToolTipText("Bấm nút này để hiện lable");
		ok.setMnemonic(KeyEvent.VK_O);
		f.add(ok);

		l1 = new JLabel("Ho va ten");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(50, 30, 70, 20);
		f.add(l1);

		l2 = new JLabel("Dia chi");
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setBounds(50, 50, 70, 20);
		f.add(l2);
		
		text = new JLabel("");
		text.setHorizontalAlignment(SwingConstants.CENTER);
		text.setBounds(100,100,60,20);
		f.add(text);
		
		img = new JLabel("");
		img.setIcon(new ImageIcon("C:\\Users\\THE ANH\\eclipse-workspace\\DemoSwing\\src\\Demo\\logo.png"));
		img.setBounds(100, 150, 436, 101);
		f.add(img);
		
		t1 = new JTextField();
		t1.setBounds(150, 30, 150, 20);
		f.add(t1);

		t2 = new JTextField();
		t2.setBounds(150, 50, 150, 20);
		f.add(t2);

		f.setSize(1000, 500);// xét kích thương cho ứng dụng
		f.setLocationRelativeTo(null);// Cho ứng dụng hiển thị giữa màn hình
		f.setLayout(null);// Xét bố cục cho ứng dụng(nó sẽ quyết định đến các bố cục các thành phân trên ứng dụng
		// f.pack();//Nó sẽ hiển thị vừa đủ cho các thành phần trên ứng dụng
		f.setVisible(true);// Chạy chương trình
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Đóng chương trình

	}

	public static void main(String[] args) {
		new HelloSwing();
	}
}
