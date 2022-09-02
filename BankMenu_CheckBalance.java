package BankingSystem;

import java.util.Scanner;

public class BankMenu_CheckBalance {
    Scanner scanner = new Scanner(System.in);
    boolean isSystem_Run = true;

    BankMenu_CheckBalance(Userinfo userinfo) {
        while (isSystem_Run) {
            System.out.println("Welcome to Check Balace System.");

            System.out.println("Your Blance is : " + userinfo.getBalance() + " Japan Yen.");
            System.out.println("Your Blance is : " + userinfo.getBANK_NUMBER() + " <- that is your Banknumber.");

            System.out.println("DO you want out? 1.YES 2.NO");
            int selectMenuNum = scanner.nextInt();

            if (selectMenuNum == 1) {
                isSystem_Run = false;
            }
            if (selectMenuNum == 2) {
                isSystem_Run = true;
            }
        }

    }
}
