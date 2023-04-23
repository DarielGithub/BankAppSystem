package avila;

public class BankTransaction {
	private int balance;
	private int accountNumber;
    private String accountType;
	
	
	public BankTransaction(int balance, int accountNumber, String accountType){
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void Deposit(float amount) {
		balance += amount;
		System.out.println("Deposited ₱" + amount + " successful.");
	}
	
	public void Withdraw(float amount) {
		if(amount > balance){
			System.out.println("Insufficient funds. Your Balance is ₱" + balance);	
		}else {
			balance -= amount;
			System.out.println("Withdrawal of ₱" + amount + " successful.");
		}
	}
	
	public void displayBalance() {
		System.out.println("Current Balance: " + balance);
	}
	
}
