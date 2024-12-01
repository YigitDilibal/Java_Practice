package Sorular;

import java.util.ArrayList;
import java.util.Arrays;

public class RG35_Array2ElemanınToplamindanOlusanSayilar {

    public static void main(String[] args) {

        /*35----
    Methoda iki sayı girelim ve  bize bir array dönsün.
     Array elemanları 1.sayının 2. sayı kadar kendisi ile
     toplamından oluşsun.

    Test Data:
    arrayOfMultiples(7, 5)

    sonuç: [7,14,21,28,35]
    */

        System.out.println(Arrays.toString(arrayOfMultiples(15, 25)));


    }

    public static int[] arrayOfMultiples(int a, int b){

        int[] arr = new int[b];

        for (int i = 0; i < b; i++) {
            arr[i]=(i+1)*a;
        }

        return arr;


    }

}
