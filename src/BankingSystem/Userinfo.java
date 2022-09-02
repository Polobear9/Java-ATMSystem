package BankingSystem;


import java.util.Random;
import java.util.Scanner;



public class Userinfo {
	
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	
	private String name_User;
	private String name_Bank;
	private final int BANK_NUMBER = ran.nextInt(1000000000);
	private int balance = 1000000;
	private int credit = 0;
	public Userinfo (String name_Bank, String name_User) {
		setName_Bank(name_Bank);
		setName_User(name_User);
	}

	// ---------->> Getter and setter <<----------
	public String getName_User() {
		return name_User;
	}

	public void setName_User(String name_User) {
		this.name_User = name_User;
	}

	public String getName_Bank() {
		return name_Bank;
	}

	public void setName_Bank(String name_Bank) {
		this.name_Bank = this.name_Bank;
	}

	public int getBANK_NUMBER() {
		return this.BANK_NUMBER;
	}
	
	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	// ---------->> Getter and setter <<---------- //


}
