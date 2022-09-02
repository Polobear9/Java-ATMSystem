package BankingSystem;

import java.util.Random;
import java.util.Scanner;


public class BankingDEMO {
    static Userinfo Lee = new Userinfo("Fukuoka", "LeeHyeonseong");
    static Userinfo Kim = new Userinfo("Fukuoka", "KimHyeonseong");
    static boolean Running = true;
    static int MenuNum = 0;
    static int SelectMenuNum = 0;
    Random ran = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (Running) {
            SelectMenuNum = 0;
            System.out.println("First We made a your Banknumber  " + "Your Banknumber is " + Lee.getBANK_NUMBER());
            System.out.println("Welcome to " + " System. Please Enter the Number. (1~5)");
            System.out.println("----1 : " + "Check Balance.");
            System.out.println("----2 : " + "Sending Money.");
            System.out.println("----3 : " + "Out Money.");
            System.out.println("----4 : " + "Credit.");
            System.out.println("----5 : " + "Exit Menu.");

            System.out.println("Enter the Number Here : ");
            MenuNum = sc.nextInt();

            switch (MenuNum) {
                case 1:
                    BankMenu_CheckBalance.BankMenu_CheckBalanceDo(Lee);
                    break;
                case 2:
                    BankMenu_SendingMoney.BankMenu_SendingMoneyDo(Lee, Kim);
                    break;
                case 3:
                    BankMenu_DisbursementsMoney.BankMenu_DisbursementsMoneyDo(Lee);
                    break;

                case 4:
                    BankMenu_CreditMoney.BankMenu_CreditMoneyDo(Lee);
                    break;

                case 5:
                    System.out.println("Thanks for Use. Have a Nice day! ");
                    break;
            }
        }
    }
}
