package Sorular;

import java.util.Arrays;

public class RG33_ArrayTersCevirme {

    public static void main(String[] args) {

         /*33-----
    Bir arrayi tersine çeviren  method yazınız.

    Test Data:

    reverse [1, 2, 3, 4]
    return  [4, 3, 2, 1]
    */
        int[] arr = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(reverse(arr)));


    }

    public static int[] reverse(int[] arr){

        int[] ters = new int[arr.length];
        int i2= 0;

        for (int i = arr.length-1; i >=0 ; i--) {
            ters[i2]=arr[i];
            i2++;

        }

        return ters;

    }

}
