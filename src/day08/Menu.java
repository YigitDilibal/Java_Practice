package day08;

import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    static void menu(){
        System.out.println("Alanini ve cevresini hesaplamak istediginiz seklin numarasini giriniz: \n" +
                "1. Cember\n" +
                "2. Dikdortgen\n" +
                "3. Kare\n" +
                "4. Cikis\n" +
                "Seciminiz: ");
        char secim = scanner.next().charAt(0);
        switch (secim){
            case 1:

            case 2:

            case 3:

            case 4:

            default:
                System.out.println("Gecersiz giris");
        }
    }




}
