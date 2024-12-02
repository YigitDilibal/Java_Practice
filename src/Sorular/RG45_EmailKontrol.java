package Sorular;

import java.util.Scanner;

public class RG45_EmailKontrol {

      /*45-----
    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden bir program yazınız.

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your e-mail address");
        String mail = scanner.nextLine();

        int sayac = 0;
        boolean sonuc = false;

        if (!mail.contains("@") || mail.startsWith("@")){
            sayac++;
        }

        if (mail.indexOf("@") != mail.lastIndexOf("@")){
            sayac++;
        }

        if (!mail.contains(".") || mail.lastIndexOf(".")<mail.indexOf("@")){
            sayac++;
        }

        System.out.println(sayac == 0);


    }

}
