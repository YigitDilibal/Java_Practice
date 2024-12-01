package day02;

import java.util.Scanner;

public class P05_ArtikYilSorusu {

    public static void main(String[] args) {

    /*
      Kural 1: 4 ila bölünemeyen yıllar artık yıl değildir
      Kural 2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır
      Kural 3: 4 ve 100 ile bölünebilen ama sadece 400'ün katı olan yıllar  artık yıldır
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kontrol etmek istediginiz yil'i giriniz..");
        int yil = scanner.nextInt();

        System.out.println("if else cozumu");

        if (yil%100==0 & yil%400==0){
            System.out.println("Girdiginiz " + yil + " yili bir Artik yildir.");
        } else if (yil%100!=0 & yil%4==0) {
            System.out.println("Girdiginiz " + yil + " yili bir Artik yildir.");
        }else{
            System.out.println("Girdiginiz " + yil + " yili bir Artik yil degildir.");
        }

        System.out.println("Ternary cozumu");

        System.out.println((yil%100==0 & yil%400==0) || (yil%100!=0 & yil%4==0)
                ? "Girdiginiz " + yil + " yili bir Artik yildir."
                : "Girdiginiz " + yil + " yili bir Artik yil degildir.");






    }
}
