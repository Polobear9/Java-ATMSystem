package BankingSystem;

import java.util.Scanner;

/**
 * Sending Money class, it will be added the Bank-account.
 * when make a user instance to Userinfo Array.
 */
public class BankMenu_SendingMoney {
    private static boolean isSystem_Run = true;
    static Scanner sc = new Scanner(System.in);

    public static void BankMenu_SendingMoneyDo(Userinfo giveUser, Userinfo takeUser) {
        while (isSystem_Run) {
            System.out.println("Welcome to Sending Money System.");

            System.out.println("Do you want sending the Money?");
            System.out.println("1.YES 2.NO");
            int SendingMenu = sc.nextInt();

            if (SendingMenu == 1) {
                System.out.println("How many Money do you want sending?");
                System.out.println("Enter the Number : ");

                int setSendingMoney = sc.nextInt();

                System.out.println("Really Do you want Send the Money?");
                System.out.println("You Set the Money : " + setSendingMoney);

                System.out.println("1.YES 2.NO");
                int FinalCheck = sc.nextInt();

                if (FinalCheck == 1) {
                    System.out.println("Sending is Finish.");
                    giveUser.setBalance(giveUser.getBalance() - setSendingMoney);
                    takeUser.setBalance(takeUser.getBalance() + setSendingMoney);

                    System.out.println("Please Check the Balance.");
                    System.out.println(giveUser.getBalance());

                    System.out.println("Do you want Continue?");
                    System.out.println("1.YES 2.NO");

                    int continueNumber = sc.nextInt();

                    if (continueNumber == 1) {
                        isSystem_Run = true;
                    }
                    if (continueNumber == 2) {
                        break;

                    }
                } else {
                    System.out.println("User Cancel the sending Money. Return to Top");
                }
            }
            if (SendingMenu == 2) {
                System.out.println("SendingMoney System is Exit");
                break;
            }

        }
    }
}
