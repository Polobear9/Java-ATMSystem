package BankingSystem;

import java.util.Random;

public class Userinfo {

    Random ran = new Random();
    private String name_User;
    private String name_Bank;
    private int BANK_NUMBER;
    private int balance = 1000000;
    private int credit = 0;

    public Userinfo(String name_Bank, String name_User) {
        setName_Bank(name_Bank);
        setName_User(name_User);
        setBANK_NUMBER(ran.nextInt(10000000));
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
        this.name_Bank = name_Bank;
    }

    public int getBANK_NUMBER() {
        return this.BANK_NUMBER;
    }

    public void setBANK_NUMBER(int BANK_NUMBER) {
        this.BANK_NUMBER = BANK_NUMBER;
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
