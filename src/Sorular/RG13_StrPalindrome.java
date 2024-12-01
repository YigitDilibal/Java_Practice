package Sorular;

import java.util.Scanner;

public class RG13_StrPalindrome {

    public static void main(String[] args) {

        /*13----
    Bir palindrom, madam veya racecar veya 10801 sayısı gibi
    ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

    Test Data:
    madam

    Beklenen Çıktı:
    True
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metni giriniz.");
        String metin = scanner.nextLine();

        StringBuilder ters = new StringBuilder(metin);
        ters.reverse();

        System.out.println(metin.contentEquals(ters));


    }

}
