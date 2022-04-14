package javacorn;

public class AccountClass {
	private int id = 0;
	private double balance = 0.0;
	private static double annualInterestRate = 0.0;
	private java.util.Date dateCreated;

	public AccountClass() {
		dateCreated = new java.util.Date();
	}

	public AccountClass(int id, double balace) {
		this();
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return this.id;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public String getDateCreated() {
		return this.dateCreated.toString();
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
}
