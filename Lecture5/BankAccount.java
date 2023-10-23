package Lecture5;

public class BankAccount {
	private int balance = 0;
	
	public BankAccount(int initialBalance) {
		this.balance = initialBalance;
	}
	
	public void withdraw(int amount) {
		if(this.balance > amount) {
			this.balance -= amount;
			System.out.println("New Balance $" + this.balance);
		}else
			System.out.println("Sorry, you can't withdraw more than $" + this.balance);
	}

	/**get the current Balance on the account
	 * @return the balance
	 */
	public int getBalance() {
		if(this.balance < 0)
			System.out.println("Oops ... your account is overdrawn ...");
		return this.balance;
	}

	/**Add money to the account
	 * @param balance the balance to set
	 */
	public void setBalance(int amount) {
		this.balance += amount;
	}
	
	
}
