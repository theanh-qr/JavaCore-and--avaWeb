package Demo;

import java.awt.Color;

import javax.swing.JTextField;

public class ValidateStudent {
	public static boolean isEmpty(JTextField txtFeild, StringBuilder str, String msg) {
		String strFeild = txtFeild.getText().trim();
		if(strFeild.equals(" ")) {
			str.append(msg).append("\n");
			txtFeild.setBackground(Color.pink);
			return false;
		}
		txtFeild.setBackground(Color.white);
		return true;
	}
	
	public static boolean isNumber(JTextField txtFeild, StringBuilder str, String msg) {
		if(!isEmpty(txtFeild, str, msg)){
			return false;
		}else {
			try {
				Integer.parseInt(txtFeild.getText());
				txtFeild.setBackground(Color.white);
			}catch(Exception E) {
				System.out.print("Lỗi"+E.toString());
				str.append(msg).append("\n");
				txtFeild.setBackground(Color.red);
				return false;
			}	
		}
		return true;
	}
}
