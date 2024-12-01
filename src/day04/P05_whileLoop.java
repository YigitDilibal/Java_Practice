package day04;

import java.util.Scanner;

public class P05_whileLoop {

    public static void main(String[] args) {

        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Girilen 5 sayinin en buyugunu bulan program.");

        int sayac = 1;
        int enBuyuk = 0;

        while (sayac<=5){
            System.out.println("Lutfen " + sayac + ". sayiyi giriniz." );
            int sayi = scanner.nextInt();
            sayac++;

            if (sayi>enBuyuk){
                enBuyuk=sayi;
            }
        }

        System.out.println("Girdiginiz sayilardan en buyugu: " + enBuyuk);





    }
}