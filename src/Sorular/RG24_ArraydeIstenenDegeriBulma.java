package Sorular;

import java.util.Arrays;
import java.util.Scanner;

public class RG24_ArraydeIstenenDegeriBulma {

    public static void main(String[] args) {

        /*24----
    Yazılan değerin array içerisinde arayan Java Kodu yazınız.

    Array: [1551,1223,1443,1267,1789,1023,2020]


    Aranan Değer:2020
    Beklenen Çıktı:True

    Aranan Değer:2010
    Beklenen Çıktı :False
    */
        int[] arr = {1551,1223,1443,1267,1789,1023,2020};
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.println("aranan sayiyi giriniz");
        int aranan = scanner.nextInt();

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==aranan){
                sayac++;
            }
        }

        System.out.println(sayac<1?"False":"True");

        int binary = Arrays.binarySearch(arr, aranan);

        System.out.println(binary<0?"False":"True");



    }
}
