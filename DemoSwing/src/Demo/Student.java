package Demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.*;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Student extends JFrame {

	private JTextField name, age, email, phone;
	private JLabel l1, l2, l3, l4, l5, l6;
	private JComboBox gender;

	public Student() {
		JFrame f = new JFrame("Hello Swing");

		JButton b = new JButton("Gửi");
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			validateForm();	
//				try {
//					File f = new File("file.txt");
//					
//				}catch(Exception E) {
//					System.out.print("Lỗi file!!!");
//				}
				//check();
				
			}
		});
		b.setBounds(100, 150, 150, 30);
		f.add(b);

		l1 = new JLabel("Họ và tên:");
		l1.setHorizontalAlignment(SwingConstants.LEFT);
		l1.setBounds(50, 30, 70, 20);
		f.add(l1);

		l2 = new JLabel("Tuổi:");
		l2.setHorizontalAlignment(SwingConstants.LEFT);
		l2.setBounds(50, 50, 70, 20);
		f.add(l2);

		l3 = new JLabel("Giới tính:");
		l3.setHorizontalAlignment(SwingConstants.LEFT);
		l3.setBounds(50, 70, 70, 20);
		f.add(l3);

		l4 = new JLabel("Email:");
		l4.setHorizontalAlignment(SwingConstants.LEFT);
		l4.setBounds(50, 90, 70, 20);
		f.add(l4);

		l5 = new JLabel("Số điện thoại:");
		l5.setHorizontalAlignment(SwingConstants.LEFT);
		l5.setBounds(50, 110, 85, 20);
		f.add(l5);

		l6 = new JLabel("Chưa kick");
		l6.setHorizontalAlignment(SwingConstants.LEFT);
		l6.setBounds(50, 130, 85, 20);
		f.add(l6);

		name = new JTextField();
		name.setBounds(150, 30, 180, 20);
		name.setText("");
		f.add(name);

		age = new JTextField();
		age.setBounds(150, 50, 180, 20);
		age.setText("");
		f.add(age);

		gender = new JComboBox();
		gender.setModel(new DefaultComboBoxModel(new String[] { "Nam", "N\u1EEF" }));
		gender.setBounds(150, 70, 180, 20);
		f.add(gender);

		email = new JTextField();
		email.setBounds(150, 90, 180, 20);
		email.setText("");
		f.add(email);

		phone = new JTextField();
		phone.setBounds(150, 110, 180, 20);
		phone.setText("");
		f.add(phone);

		f.setSize(400, 400);
		f.setLocationRelativeTo(null);//Cho ứng dụng hiển thị giữa màn hình
		f.setLayout(null);
		f.setVisible(true);//Chạy chương trình
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Tắt chương trình khi ấn nút X đỏ
	}

	public boolean validateForm() {
		StringBuilder sb = new StringBuilder();
		ValidateStudent.isEmpty(name, sb, "Không được để trông");
		ValidateStudent.isEmpty(age, sb, "Không được để trông");
		ValidateStudent.isEmpty(email, sb, "Không được để trông");
		ValidateStudent.isEmpty(phone, sb, "Không được để trông");
		if (sb.length() > 0) {
			JOptionPane.showMessageDialog(this, sb.toString());
		}
		return false;
	}

	private void check() {
		
		if (name.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Không để trống tên");
			name.setBackground(Color.pink);
		} else {
			name.setBackground(Color.white);
		}

		if (age.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Không để trống tuổi");
			age.setBackground(Color.pink);
		} else if(Double.parseDouble(age.getText()) < 0) {
			JOptionPane.showMessageDialog(null, "Tuổi phải lớn hơn 0");
			age.setBackground(Color.pink);
		}else {
			age.setBackground(Color.white);
		}

		if (email.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Không để trống email");
			email.setBackground(Color.pink);
		} else {
			email.setBackground(Color.white);
		}

		if (phone.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Không để trống số điện thoại");
			phone.setBackground(Color.pink);
		} else {
			phone.setBackground(Color.white);
		}
	}


	private void changeTextJLabel() {
		l6.setText("Đã click");
	}

	public static void main(String[] args) {
		new Student();
	}

}
