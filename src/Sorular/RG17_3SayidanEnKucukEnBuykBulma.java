package Sorular;

public class RG17_3SayidanEnKucukEnBuykBulma {

    public static void main(String[] args) {

         /*17---
    Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */

        System.out.println(enKucuk(12, 24, 34,3,5,8,1452,1,2,4,7,8,5));


    }

    public static int enKucuk(int... a){

        int kucuk = a[0];

        for (int each:a){

            if (each<kucuk){
                kucuk=each;
            }
        }


        return kucuk;

    }

}
