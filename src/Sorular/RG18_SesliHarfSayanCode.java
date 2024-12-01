package Sorular;

import java.util.Scanner;

public class RG18_SesliHarfSayanCode {

    public static void main(String[] args) {

/*18----
    Girilen Stringdeki tüm sesli harfleri saymak için bir Java Methodu yazınız.

    Test Data:
    java is fun

    Beklenen Çıktı:

    Stringdeki sesli harf sayısı: 4
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metni giriniz.");
        String metin = scanner.nextLine();
        metin = metin.toLowerCase();
        int sayac = 0;

        for (int i = 0; i < metin.length(); i++) {

            if (metin.charAt(i) ==  'a' || metin.charAt(i) ==  'e' || metin.charAt(i) ==  'i' || metin.charAt(i) ==  'o' || metin.charAt(i) ==  'u'){
                sayac++;
            }
        }

        System.out.println("Stringdeki sesli harf sayısı: " + sayac);


    }
}
