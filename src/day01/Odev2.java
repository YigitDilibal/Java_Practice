package day01;

import javax.swing.*;
import java.util.Scanner;

public class Odev2 {

    /*ÖDEV2:Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
sisteme kaydedildiğini aşağıdaki formatta yazdırın.
******       KAYIT BAŞARILI      ******
Adınız: Tarık
Soyadınız: Yiğit
Yaşınız:42
Mail Adresiniz:tarik@yigit.com.tr
Şifreniz: A2e365
şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz..");
        String ad = scanner.nextLine();
        System.out.println("Lutfen soyadinizi giriniz..");
        String soyad = scanner.nextLine();
        System.out.println("Lutfen yasinizi giriniz..");
        String yas = scanner.nextLine();
        System.out.println("Lutfen e-posta adresinizi giriniz..");
        String eposta = scanner.nextLine();
        System.out.println("Lutfen sifrenizi giriniz..");
        String sifre = scanner.nextLine();


        System.out.println(
                "********** KAYIT BAŞARILI  **********"
                        +"\n\tAdınız: " + ad.toUpperCase()
                        +"\n\tSoyadınız: " + soyad.toUpperCase()
                        +"\n\tYaşınız: " +yas
                        +"\n\tMail Adresiniz: " + eposta
                        +"\n\tŞifreniz: " + sifre
                        +"\nKaydınız başarıyla tamamlanmıştır."
        );

        // ve

        JOptionPane.showMessageDialog(null,
                "********** KAYIT BAŞARILI  **********"
                        +"\n\tAdınız: " + ad.toUpperCase()
                        +"\n\tSoyadınız: " + soyad.toUpperCase()
                        +"\n\tYaşınız: " +yas
                        +"\n\tMail Adresiniz: " + eposta
                        +"\n\tŞifreniz: " + sifre
                        +"\nKaydınız başarıyla tamamlanmıştır."
        );



    }

}
