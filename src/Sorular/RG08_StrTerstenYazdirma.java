package Sorular;

import java.util.Scanner;

public class RG08_StrTerstenYazdirma {

    public static void main(String[] args) {

         /*8----
     Girilen String değerde tersten yazan Java kodunu yazınız.

    Test Data:
    java
    avaj
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin yaziniz..");
        String metin = scanner.nextLine();

        for (int i = metin.length()-1; i >= 0 ; i--) {
            System.out.print(metin.charAt(i));

        }



    }
}
