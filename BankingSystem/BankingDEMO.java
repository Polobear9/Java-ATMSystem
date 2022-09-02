package BankingSystem.BankingSystem;

import java.util.Random;
import java.util.Scanner;


public class BankingDEMO {
    static Userinfo Lee = new Userinfo("Fukuoka", "LeeHyeonseong");
    static Userinfo Kim = new Userinfo("Fukuoka", "KimHyeonseong");

    static int MenuNum = 0;
    static int SelectMenuNum = 0;
    Random ran = new Random();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {


        while (MenuNum != 5) {
            SelectMenuNum = 0;
            System.out.println("First We made a your Banknumber  " + "Your Banknumber is " + Lee.getBANK_NUMBER());
            System.out.println("Welcome to " + " System. Pleace Enter the Number. (1~5)");
            System.out.println("----1 : " + "Check Balace.");
            System.out.println("----2 : " + "Sending Money.");
            System.out.println("----3 : " + "Out Money.");
            System.out.println("----4 : " + "Creadit.");
            System.out.println("----5 : " + "Exit Menu.");

            System.out.println("Enter the Number Here : ");
            MenuNum = sc.nextInt();

            if (MenuNum == 1) {
                BankMenu_CheckBalance.BankMenu_CheckBalanceDo(Lee);
                }

            }

            if (MenuNum == 2) {

            }

            if (MenuNum == 3) {

                while (SelectMenuNum != 2) {
                    System.out.println("Welcome to Out Money System.");

                    System.out.println("DO you want out of Money? : 1.YES 2.NO");
                    SelectMenuNum = sc.nextInt();

                    if (SelectMenuNum == 1) {
                        System.out.println("How many Money do you want out? : ");
                        int Out_Money = sc.nextInt();

                        System.out.println("Do you want out -->> : " + Out_Money + " ? ");

                        System.out.println(" 1.YES 2.NO ");
                        int MenuSelect = sc.nextInt();

                        if (MenuSelect == 1) {
                            int NowCash = Lee.Balance - Out_Money;
                            System.out.println("Your Money is left : " + NowCash);


                        }
                    }
                    if (SelectMenuNum == 2) {
                        break;
                    }

                }

            }

            if (MenuNum == 4) {

                while (SelectMenuNum != 2) {
                    int AddMoney = Lee.GetBalance();
                    System.out.println("Welcome to Creadit System.");

                    System.out.println("Pleace input the Number : ");
                    int creaditplus = sc.nextInt();

                    AddMoney += creaditplus;

                    System.out.println("DO you want out? 1.YES 2.NO");
                    SelectMenuNum = sc.nextInt();

                    if (SelectMenuNum == 1) {
                        break;
                    }
                    if (SelectMenuNum == 2) {
                        SelectMenuNum = 0;
                    }

                }
            }

            if (MenuNum == 5) {

                System.out.println("Thanks for Use. Have a Nice day! ");
                break;
            }
        }
    }
}
