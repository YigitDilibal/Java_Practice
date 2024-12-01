package Sorular;

import java.util.Scanner;

public class RG11_StrSonKarakterSilme {

     /*11----
    Kullanıcıdan alınan Stringin son karakteirini silip ekrana yazan Java kodunu yazınız.

    Test Data:
    good

    Beklenen Çıktı:
    goo
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metni giriniz.");
        String metin = scanner.nextLine();

        System.out.println(metin.substring(0,metin.length()-1));



    }


}
