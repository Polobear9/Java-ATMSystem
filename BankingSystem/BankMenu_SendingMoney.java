package BankingSystem.BankingSystem;

import java.util.Scanner;

public class BankMenu_SendingMoney {
    static Scanner sc = new Scanner(System.in);
    private static boolean isSystem_Run = true;

    public static void BankMenu_SendingMoneyDo(Userinfo giveUser, Userinfo takeUser) {
        while (isSystem_Run) {
            System.out.println("Welcome to Sending Money System.");

            System.out.println("Do you want sending the Money?");
            System.out.println("1.YES 2.NO");
            int SendingMenu = sc.nextInt();
            int sendingMoney = 0;

            if (SendingMenu == 1) {
                System.out.println("How many Money do you wnat sending?");
                System.out.println("Enter the Number : ");

                int setSendingMoney = sc.nextInt();
                sendingMoney = setSendingMoney;

                System.out.println("Really Do you want Send the Money?");
                System.out.println("You Set the Money : " + sendingMoney);

                System.out.println("1.YES 2.NO");
                int FinalCheck = sc.nextInt();

                if (FinalCheck == 1) {
                    System.out.println("Sending is Finish.");
                    giveUser.setBalance(giveUser.getBalance() - sendingMoney);
                    takeUser.setBalance(takeUser.getBalance() + sendingMoney);

                    System.out.println("Pleace Chack the Balance.");
                    System.out.println(giveUser.getBalance());

                    System.out.println("Do you want Continue?");
                    System.out.println("1.YES 2.NO");

                    int continueNumber = sc.nextInt();

                    if (continueNumber == 1) {
                        isSystem_Run = true;
                    }
                    if (continueNumber == 2) {
                        isSystem_Run = false;
                        break;

                    }

                    if (FinalCheck == 2) {
                        //need to make a method for set a sending money.
                    }
                }
            }
            if (SendingMenu == 2) {
                System.out.println("SendingMoney System is Exit");
                isSystem_Run = false;
            }

        }
    }
}
