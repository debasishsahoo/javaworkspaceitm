package Inheritance.has_a;

class Bank {
	private String name;

	Bank(String name) {
		this.name = name;
	}

	public String getBankName() {
		return this.name;
	}
}
