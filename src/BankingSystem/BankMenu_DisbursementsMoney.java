package BankingSystem;

import java.util.Scanner;

public class BankMenu_DisbursementsMoney {
    static Scanner sc = new Scanner(System.in);
    private static boolean isSystem_Run = true;
    public static void BankMenu_DisbursementsMoneyDo(Userinfo userinfo){
        while (isSystem_Run) {
            System.out.println("Welcome to Out Money System.");
            System.out.println("DO you want out of Money? : 1.YES 2.NO");
            int SelectMenuNum = sc.nextInt();
            if (SelectMenuNum == 1) {
                System.out.println("How many Money do you want out? : ");
                int Out_Money = sc.nextInt();
                System.out.println("Do you want out -->> : " + Out_Money + " ? ");
                System.out.println(" 1.YES 2.NO ");
                int MenuSelect = sc.nextInt();
                if (MenuSelect == 1) {
                    userinfo.setBalance(userinfo.getBalance() - Out_Money);
                    System.out.println("Your Money is left : " + userinfo.getBalance());
                }
            }
            if (SelectMenuNum == 2) {
                isSystem_Run = false;
                break;
            }
        }
    }
}
