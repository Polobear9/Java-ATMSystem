package BankingSystem;


import java.util.Random;
import java.util.Scanner;



public class Userinfo {
	
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	
	private int CustomNumber;
	public String Bankname;
	public String Name;
	private int Banknum = ran.nextInt(1000000000);
	private int Balance;
	
	public Userinfo (int CustomNumber, String Bankname, String Name) {
		
		this.Bankname = Bankname + " Bank";
		this.Name = Name;
		this.CustomNumber = CustomNumber;
		
		
	}
	
	
	public int GetBanknum() {
		return this.Banknum;
	}
	
	public int GetBalance() {
		return this.Balance;
	}
	
	
	
	
	
	
	
}
