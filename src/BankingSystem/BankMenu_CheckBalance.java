package BankingSystem;

import java.util.Scanner;

public class BankMenu_CheckBalance {
    static Scanner scanner = new Scanner(System.in);
    private static boolean isSystem_Run = true;

    public static void BankMenu_CheckBalanceDo(Userinfo userinfo) {
        while (isSystem_Run) {
            System.out.println("Welcome to Check Balance System.");

            System.out.println("Your Balance is : " + userinfo.getBalance() + " Japan Yen.");
            System.out.println("Your Balance is : " + userinfo.getBANK_NUMBER() + " <- that is your Bank number.");
            System.out.println("Your Credit is : " + userinfo.getCredit() + " Japan Yen.");

            System.out.println("DO you want out? 1.YES 2.NO");
            int selectMenuNum = scanner.nextInt();

            if (selectMenuNum == 1) {
                System.out.println("Check Balance System is Out");
                break;
            }
            if (selectMenuNum == 2) {
                isSystem_Run = true;
            }
        }
    }
}
