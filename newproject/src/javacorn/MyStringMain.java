package javacorn;

public class MyStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] temp1 = MyString1.split("WordAttachedlolol", "Attached");
		for (String s : temp1) {
			System.out.println(s);
		}

		String[] temp2 = MyString1.split("Wor#dAt#tac#he#dl#ol#ol", "#");
		for (String s : temp2) {
			System.out.println(s);
		}
	}

}
