package BankingSystem.BankingSystem;

import java.util.Scanner;

public class BankMenu_CheckBalance {
    static Scanner scanner = new Scanner(System.in);
    private static boolean isSystem_Run = true;

    public static void BankMenu_CheckBalanceDo(Userinfo userinfo) {
        while (isSystem_Run) {
            System.out.println("Welcome to Check Balace System.");

            System.out.println("Your Blance is : " + userinfo.getBalance() + " Japan Yen.");
            System.out.println("Your Blance is : " + userinfo.getBANK_NUMBER() + " <- that is your Banknumber.");

            System.out.println("DO you want out? 1.YES 2.NO");
            int selectMenuNum = scanner.nextInt();

            if (selectMenuNum == 1) {
                isSystem_Run = false;
                break;
            }
            if (selectMenuNum == 2) {
                isSystem_Run = true;
            }
        }

    }
}
