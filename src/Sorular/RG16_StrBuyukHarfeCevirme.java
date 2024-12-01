package Sorular;

import java.util.Scanner;

public class RG16_StrBuyukHarfeCevirme {

    public static void main(String[] args) {

        /*16----
    Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.

    Test Data:
    java is fun

    Beklenen Çıktı:
    JAVA IS FUN
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metni giriniz.");
        String metin = scanner.nextLine();

        System.out.println(metin.toUpperCase());
    }
}
