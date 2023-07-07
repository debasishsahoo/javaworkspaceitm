package problams;

/**
 * The Account class models a bank account with a balance.
 */
public class Account {
	// The private instance variables
	private int number;
	private double balance;

	// The constructors (overloaded)
	/**
	 * Constructs an Account instance with the given number and initial balance of 0
	 */
	public Account(int number) {
		this.number = number;
		this.balance = 0.0; // "this." is optional
	}

	/** Constructs an Account instance with the given number and initial balance */
	public Account(int number, double balance) {
		this.number = number;
		this.balance = balance;
	}

	// The public getters/setters for the private instance variables.
	// No setter for number because it is not designed to be changed.
	// No setter for balance as it is changed via credit() and debit()
	/** Returns the number */
	public int getNumber() {
		return this.number; // "this." is optional
	}

	/** Returns the balance */
	public double getBalance() {
		return this.balance; // "this." is optional
	}

	/** Returns a string description of this instance */
	public String toString() {
		// Use built-in function System.format() to form a formatted String
		return String.format("Account[number=%d,balance=$%.2f]", number, balance);
	}

	/** Add the given amount to the balance */
	public void credit(double amount) {
		balance += amount;
	}

	/** Subtract the given amount from balance, if balance >= amount */
	public void debit(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("amount exceeded");
		}
	}

	/** Transfer the given amount to Account another, if balance >= amount */
	public void transferTo(double amount, Account another) {
		if (balance >= amount) {
			this.balance -= amount;
			another.balance += amount;
		} else {
			System.out.println("amount exceeded");
		}
	}
}
