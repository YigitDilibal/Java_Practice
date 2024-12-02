package Sorular;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RG39_PozitifveNegatifSayininToplami {

    public static void main(String[] args) {
        /*39-----
    Bir dizi içerisindeki pozitif tam sayı sayısını ve
    negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.

    Örnek:
    countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
    [10, -65]
    // Toplam 10 pozitif sayı var.
    // Tüm negatif sayıların toplamı -65'tir.

    Notlar :
    Boş bir dizi verilirse, boş bir dizi döndürür: []
    0 pozitif değil.
    */

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int arr2[] = new int[0];
        int arr3[] = {1,5,4,2,3,5,55,6,2,1};
        int arr4[] = {-1,-5,-4,-2,-3,-5,-55,-6,-2,-1};

        System.out.println(Arrays.toString(countPositivesSumNegative(arr)));
        System.out.println(Arrays.toString(countPositivesSumNegative(arr2)));
        System.out.println(Arrays.toString(countPositivesSumNegative(arr3)));
        System.out.println(Arrays.toString(countPositivesSumNegative(arr4)));


    }

    public static int[] countPositivesSumNegative (int[] arr){

        int pCount=0;
        int nSum=0;

        for (int each: arr ){

            if (each<0){
                nSum+=each;
            }

            if (each>0){
                pCount++;
            }
        }



        if (pCount==0 && nSum==0){
            int[] ar = new int[0];
            return ar;
        }else {
            int[] ar = {pCount,nSum};
            return ar;
        }



    }

}
