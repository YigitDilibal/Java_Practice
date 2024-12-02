package Sorular;

import java.util.Arrays;

public class RG48_2FarkliArrayiBirlestirme {

    public static void main(String[] args) {

        /*48-----
    İki farklı Array'i birleştiren bir program yazınız.

    Örnekler:

    birlestir([1, 3, 5], [2, 6, 8])
    Çıktı : [1, 3, 5, 2, 6, 8]

    birlestir([7, 8], [10, 9, 1, 1, 2])
    Çıktı : [7, 8, 10, 9, 1, 1, 2]

    birlestir([4, 5, 1], [3, 3, 3, 3, 3])
    Çıktı : [4, 5, 1, 3, 3, 3, 3, 3]
    */

        int[] test1 = {1,3,5}; int[] test2 = {2,6,8};

        int[] test3 = {7,8}; int[] test4 = {10,9,1,1,2};

        int[] test5 = {4,5,1}; int[] test6 = {3,3,3,3,3};

        System.out.println(Arrays.toString(birlestir(test1,test2)));
        System.out.println(Arrays.toString(birlestir(test3,test4)));
        System.out.println(Arrays.toString(birlestir(test5,test6)));





    }

    public static int[] birlestir(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {

            result[i]=arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {

            result[i+arr1.length]=arr2[i];
        }


        return result;

    }

}
