package Sorular;

import java.time.LocalDate;
import java.util.Scanner;

public class RG19_ArtikYil {

    public static void main(String[] args) {

        /*19----
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol etmek için bir Java Methodu yazınız.

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kontrol etmek istediginiz yili giriniz.");
        int yil = scanner.nextInt();

        LocalDate tarih = LocalDate.of(yil,1,1);
        System.out.println(tarih.isLeapYear());





    }


}

