package day06;

import java.util.Scanner;

public class S06_ATM {


    static Scanner scan =new Scanner(System.in);
    static String kartNo="123456";
    static String sifre="1234";

    public static void main(String[] args) {
        /*
             ATM EKRANI VE ISLEMLER
        -Kullanicidan giriş için kart numarasi ve şifresini isteyin,
           eger herhangi birini yanlis girerse tekrar girmesini isteyin.
        -Kart numarasini boşluk ile girerse, eger numara doğruysa kabul edin.
        -Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri (Menu listesi) ekrana yazdirin.
        -Menu listesinde;
               Bakiye sorgulama, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis
               islemleri olacaktır.
        -Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez ve gönderilemez.
        -Para gönderme işleminde istenen iban TR ile baslamali ve toplam 10 karakter olmali,
            eger iban bu kriterlere uygun değilse menü ekranina geri donmelidir.
       - Sifre değiştirme işlemini yapmadan önce mevcut şifreyi teyit etmelidir.
         */

        giris();

    }

    public static void giris(){
        System.out.println("****************T153BANK*******************");
        System.out.println(" Güvenliginiz icin sirfenizi kimseyle paylasmayiniz");

        System.out.println("Kart numarasini giriniz");
        String KkartNo= scan.nextLine();

        System.out.println(" Sifrenizi giriniz");
        String KSifre= scan.nextLine();

        if (KkartNo.equals(kartNo) && KSifre.equals(sifre)){
            menu();
        }else {
            System.out.println("hatali giris yaptiniz, yeniden deneyiniz");
            giris();
        }

    }

    private static void menu() {
        System.out.println("menu methoduna geldiniz");
    }

}