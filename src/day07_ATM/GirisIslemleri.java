package day07_ATM;

import java.util.Scanner;

public class GirisIslemleri {

    static Scanner scan =new Scanner(System.in);
    static String kartNo="123456";
    static String sifre="1234";
    static double bakiye = 10000;


    public static void giris(){
        System.out.println("****************Yigit BANK*******************");
        System.out.println(" Güvenliginiz icin sifrenizi kimseyle paylasmayiniz");

        System.out.println("Kart numarasini giriniz");
        String KkartNo= scan.nextLine();

        System.out.println(" Sifrenizi giriniz");
        String KSifre= scan.nextLine();

        if (KkartNo.replaceAll("\\s+","").equals(kartNo) && KSifre.equals(sifre)){
            MenuIslemleri.menu();
        }else {
            System.out.println("hatali giris yaptiniz, yeniden deneyiniz");
            giris();
        }

    }


}
