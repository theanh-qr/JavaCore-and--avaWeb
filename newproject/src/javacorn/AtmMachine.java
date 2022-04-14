package javacorn;

import java.util.Scanner;

public class AtmMachine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// khoi tao mang luu tru accs
		Account accounts[] = new Account[10];
		// khoi tao gia tri cho tung acc
		for (int i = 1; i <= accounts.length; i++) {
			accounts[i - 1] = new Account(i, 100);
		}
		// yeu cau ng dung nhap id
		System.out.print("Enter an id: ");
		int id = input.nextInt();
		if (id < 1 || id > 10) {
			id = promtID(id);
		}
		boolean isStop = false;
		while (!isStop) {
			displayMainMenu();
			System.out.print("Enter a choice: ");
			int choice = input.nextInt();
			if (choice < 1 || choice > 4) {
				choice = promtChoice(choice);
			}
			if (choice == 4) {
				System.out.print("Enter an id: ");
				id = input.nextInt();
				if (id < 1 || id > 10) {
					id = promtID(id);
				}
			}
			activateChoice(id, choice, accounts);
		}
	}

	private static void activateChoice(int id, int choice, Account accounts[]) {
		Scanner input = new Scanner(System.in);
		switch (choice) {
		case 1: {
			System.out.println("The balance is " + accounts[id - 1].getBalance());
			break;
		}
		case 2: {
			System.out.print("Enter amount to withdraw: ");
			accounts[id - 1].withdraw(input.nextDouble());
			break;
		}
		case 3: {
			System.out.print("Enter amount to deposit: ");
			accounts[id - 1].deposit(input.nextDouble());
			break;
		}
		default:
			break;
		}
	}

	private static void displayMainMenu() {
		System.out.printf("%nMain menu%n");
		System.out.println("1. Check balance");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposit");
		System.out.println("4. Exit");
	}

	private static int promtID(int id) {
		Scanner input = new Scanner(System.in);
		while (id < 1 || id > 10) {
			System.out.print("Enter a valid id: ");
			id = input.nextInt();
			System.out.println();
		}
		return id;
	}

	private static int promtChoice(int choice) {
		Scanner input = new Scanner(System.in);
		while (choice < 1 || choice > 4) {
			System.out.print("Enter a valid choice: ");
			choice = input.nextInt();
			System.out.println();
		}
		return choice;
	}
}
