package Sorular;

import java.util.Scanner;

public class RG15_StrIstenilenKarakteriYazdirma {

    public static void main(String[] args) {

         /*15----
    Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

    Test Data:
    Java is fun


    Beklenen Çıktı
    0. pozisyondaki karakter : J

    5. pozisyondaki karakter : i
    */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Metni giriniz.");
        String metin = scanner.nextLine();
        System.out.println("Kacinci indexteki karakter");
        int index = scanner.nextInt();


        System.out.println(metin.charAt(index));





    }
}
