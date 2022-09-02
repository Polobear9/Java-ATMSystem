package BankingSystem;


import java.util.Random;
import java.util.Scanner;


public class BankingDEMO {
    static Userinfo Lee = new Userinfo(1, "Fukuoka", "LeeHyeonseong");
    static Userinfo Kim = new Userinfo(2, "Fukuoka", "KimHyeonseong");

    static int MenuNum = 0;
    static int SelectMenuNum = 0;
    Random ran = new Random();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {


        while (MenuNum != 5) {
            SelectMenuNum = 0;
            System.out.println("First We made a your Banknumber  " + "Your Banknumber is " + Lee.GetBanknum());
            System.out.println("Welcome to " + " System. Pleace Enter the Number. (1~5)");
            System.out.println("----1 : " + "Check Balace.");
            System.out.println("----2 : " + "Sending Money.");
            System.out.println("----3 : " + "Out Money.");
            System.out.println("----4 : " + "Creadit.");
            System.out.println("----5 : " + "Exit Menu.");

            System.out.println("Enter the Number Here : ");
            MenuNum = sc.nextInt();

            if (MenuNum == 1) {

                while (SelectMenuNum != 2) {
                    System.out.println("Welcome to Check Balace System.");

                    System.out.println("Your Blance is : " + Lee.Balance + " Japan Yen.");
                    System.out.println("Your Blance is : " + Lee.GetBanknum() + " <- that is your Banknumber.");

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

            if (MenuNum == 2) {

                while (SelectMenuNum != 2) {
                    System.out.println("Welcome to Sending Money System.");

                    System.out.println("Do you want sending the Money?");
                    System.out.println("1.YES 2.NO");
                    int SendingMenu = sc.nextInt();

                    if (SendingMenu == 1) {

                        System.out.println("Pleace Enter the Your Banknumber..EX)1 or 2 : ");
                        System.out.println("1. " + Lee.GetBanknum() + " " + Lee.Name);
                        System.out.println("2. " + Kim.GetBanknum() + " " + Kim.Name);

                        int MaintBankNumber = sc.nextInt();

                        if (MaintBankNumber == 1) {
                            MaintBankNumber = Lee.GetBalance();
                            System.out.println("This Banknumber is " + Lee.Name + " is Banknumber");

                        }
                        if (MaintBankNumber == 2) {
                            MaintBankNumber = Kim.GetBalance();
                            System.out.println("This Banknumber is " + Kim.Name + " is Banknumber");
                        }

                        System.out.println("How many Money do you wnat sending?");
                        System.out.println("Enter the Number : ");

                        int SendingMoney = sc.nextInt();

                        System.out.println("What Banknumber do you wnat sending?");
                        System.out.println("Pleace Enter the Banknumber..EX)1 or 2 : ");

                        System.out.println("1. " + Lee.GetBanknum() + " " + Lee.Name);
                        System.out.println("2. " + Kim.GetBanknum() + " " + Kim.Name);
                        int SendingBanknumber = sc.nextInt();


                        if (SendingBanknumber == 1) {
                            System.out.println("This Banknumber is " + Lee.Name + " is Banknumber");
                            SendingBanknumber = Lee.Balance;

                        }
                        if (SendingBanknumber == 2) {
                            System.out.println("This Banknumber is " + Kim.Name + " is Banknumber");
                            SendingBanknumber = Kim.Balance;

                        }

                        System.out.println("Really Do you want Send the Money?");
                        System.out.println("You Set the Money : " + SendingMoney);

                        System.out.println("1.YES 2.NO");
                        int FinalCheck = sc.nextInt();

                        if (FinalCheck == 1) {
                            System.out.println("Sending is Finish.");
                            System.out.println(SendingBanknumber - SendingMoney);

                            System.out.println("Pleace Chack the Balance.");

                            System.out.println("Do you want Continue?");
                            System.out.println("1.YES 2.NO");

                            int Last_Number = sc.nextInt();

                            if (Last_Number == 1) {
                                MenuNum = 2;
                            }
                            if (Last_Number == 2) {
                                break;
                            }

                        }
                        if (FinalCheck == 2) {
                            MenuNum = 2;
                        }

                    }

                    if (SendingMenu == 2) {
                        break;
                    }

                }

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
