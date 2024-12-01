package day03;

import java.util.Scanner;

public class P09_forLoop {

    //        Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
    //        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı,
    //                        kendisine eşitse o sayi mükemmeldir.
    //        ORNEK:
    //        INPUT     : 6
    //        OUTPUT : 1,2,3
    //                      1+2+3 = 6 = 6 (Mükemmel)
    //
    //                      mukemmel sayi kontrolu
    //                      1. kullanicidan sayi alalim
    //                      2. bir toplam degiskeni olusturuyoruz
    //                      3. sayinin bolenleri bul
    //                      4. bolenleri toplamla topla
    //                      5. sayiyla toplamin esitligini kontrol et
    //

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Mukemmel sayi kontrol programi");
        System.out.println("Sayi giriniz");
        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i < sayi ; i++) {

            if (sayi%i==0){
                toplam+=i;
                System.out.print(i+"+");

            }

        }

        System.out.println("");
        if (toplam==sayi){
            System.out.println("Girdiginiz " + sayi + " sayisi bir mukemmel sayidir.");
        }


    }





}
