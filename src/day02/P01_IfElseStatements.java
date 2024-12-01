package day02;

import java.util.Scanner;

public class P01_IfElseStatements {

    public static void main(String[] args) {


        /*
         * BASİT HESAP MAKİNESİ
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t***HESAP MAKINESI***");

        System.out.println("islem yapacaginiz ilk sayiyi giriniz");
        double sayi1 = scanner.nextDouble();

        System.out.println("Lutfen islem turunu giriniz.. (*, /, +, -)");
        char islem = scanner.next().charAt(0);

        System.out.println("islem yapacaginiz ikinci sayiyi giriniz");
        double sayi2 = scanner.nextDouble();

        // bagimsiz if


        if (islem=='+'){
            double sonuc = sayi1+sayi2;
            System.out.println("Sonuc: "+ sonuc);
        }

        if (islem=='-'){
            double sonuc = sayi1-sayi2;
            System.out.println("Sonuc: "+ sonuc);
        }

        if (islem=='/'){
            double sonuc = sayi1/sayi2;
            System.out.println("Sonuc: "+ sonuc);
        }

        if (islem=='*'){
            double sonuc = sayi1*sayi2;
            System.out.println("Sonuc: "+ sonuc);
        }

        if (!(islem=='*' || islem=='/' || islem=='+' || islem=='-')){
            System.out.println("Lutfen gecerli bir islem turu giriniz..");
        }



    }
}
