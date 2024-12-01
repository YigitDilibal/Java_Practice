package Sorular;

import java.util.Scanner;

public class RG12_StrBuyukHarfeCevirme {

    /*12----
    Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

    Test Data:
    Java is fun

    Beklenen Sonuç:
    JAVA IS FUN
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metni giriniz.");
        String metin = scanner.nextLine();

        System.out.println(metin.toUpperCase());


    }

}
