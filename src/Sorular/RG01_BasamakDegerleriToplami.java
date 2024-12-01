package Sorular;

import java.util.Scanner;

public class RG01_BasamakDegerleriToplami {

    public static void main(String[] args) {


        /*1---
    Sayinin basamak degerlerinin toplamasini yapan Java kodu yaziniz.

    Test Data
    34
    Beklenen Cikti
    7
    */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen basamak degerlerini toplamak istediginiz sayiyi girin.");
        int sayi = scanner.nextInt();
        int toplam = 0 ;

        while (sayi>0){
            toplam += sayi%10;
            sayi/=10;
        }

        System.out.println("Girdiginiz sayinin basamak degerleri toplami: " + toplam);

    }
}
