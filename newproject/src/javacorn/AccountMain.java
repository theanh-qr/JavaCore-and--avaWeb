package javacorn;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountClass account = new AccountClass(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500.0);
		account.deposit(3000.0);
		System.out.println("Balance: $" + account.getBalance());
		System.out.println("Monthly Interest: " + account.getMonthlyInterest());
		System.out.println("Date Created: " + account.getDateCreated());
	}

}
