package BankingSystem;

import java.util.Scanner;

public class BankMenu_CreditMoney {
    static Scanner sc = new Scanner(System.in);
    private static boolean isSystem_Run = true;

    public static void BankMenu_CreditMoneyDo(Userinfo userinfo) {
        while (isSystem_Run) {
            System.out.println("Welcome to Credit System.");
            System.out.println("Please input the Need Money : ");
            int creditplus = sc.nextInt();
            System.out.println("Really do you credit the Money? : 1.YES 2.NO");
            int SelectMenuNum = sc.nextInt();
            if (SelectMenuNum == 1) {
                userinfo.setBalance(userinfo.getBalance() + creditplus);
                userinfo.setCredit(creditplus);
                System.out.println("Credit System is finish safely!");
                System.out.println("Your Balance is " + userinfo.getBalance() + " Your Credit is " + userinfo.getCredit());
            } else {
                continue;
            }
            System.out.println("DO you want out? 1.YES 2.NO");
            SelectMenuNum = sc.nextInt();
            if (SelectMenuNum == 1) {
                isSystem_Run = false;
                break;
            } else {
                System.out.println("Return to Main System");
            }
        }
    }
}
