package Sorular;

import java.util.Arrays;
import java.util.Scanner;

public class RG29_CumleyiTerstenDuzYazdırma {

     /*29----
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"
    */

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Metni giriniz.");
        String metin = scanner.nextLine();
        String tersMetin = "";

        String[] arr = metin.split(" ");

        for (int i = arr.length-1; i >= 0 ; i--) {

            tersMetin+= arr[i]+" ";

        }

        System.out.println("Metin: " + metin);
        System.out.println("Ters metin: " + tersMetin);




    }



}
