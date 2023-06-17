package com.practice;

//abstraction

public abstract class Bank {

	void welcome() {
		System.out.println("Welcome to online banking");
	}

	abstract void personalLoan(int interest);

	abstract void homeLoan(int interest);
}

class HDFCBank extends Bank {
	void personalLoan(int interest) {
		System.out.println("HDFC Bank Personal loan interest " + interest);
	}

	void homeLoan(int interest) {
		System.out.println("Home loan interets " + interest);
	}
}

class ICICIBank extends Bank {
	void personalLoan(int interest) {
		System.out.println("ICICI bank personal loan " + interest);
	}

	void homeLoan(int interest) {
		System.out.println("ICICI Bank home laonn " + interest);
	}

	public static void main(String[] args) {

		HDFCBank h1 = new HDFCBank();
		h1.welcome();
		h1.personalLoan(12);
		h1.homeLoan(8);

		ICICIBank i1 = new ICICIBank();
		i1.welcome();
		i1.personalLoan(14);
		i1.homeLoan(6);
	}

}