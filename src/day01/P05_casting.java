package day01;

import java.util.Scanner;

public class P05_casting {

    public static void main(String[] args) {


        // Kullanıcıdan iki adet ondalıklı sayı alıp bu ondalıklı sayıları birbirne bölüp sonucu tamsayı olarak yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 1. Ondalikli sayiyi giriniz..");
        double sayi1=scanner.nextDouble();
        System.out.println("Lutfen 2. Ondalikli sayiyi giriniz..");
        double sayi2= scanner.nextDouble();

        int sonuc = (int) (sayi1/sayi2);

        System.out.println("Sonuc: " + sonuc);

        // Kullanıcıdan iki adet tam sayı alıp bu sayıları birbirne bölüp sonucu ondalikli olarak yazdırın

        System.out.println("Lutfen 1. Tam sayiyi giriniz..");
        int sayi3=scanner.nextInt();
        System.out.println("Lutfen 2. Tam sayiyi giriniz..");
        int sayi4= scanner.nextInt();

        double sonuc2 = ((double)sayi3/sayi4);
        System.out.println(sonuc2);



    }
}
