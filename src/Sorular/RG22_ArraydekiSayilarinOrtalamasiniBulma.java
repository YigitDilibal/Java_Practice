package Sorular;

public class RG22_ArraydekiSayilarinOrtalamasiniBulma {

    public static void main(String[] args) {
        /*22----
    Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

    Array =  [20, 30, 25, 35, -16, 60, -100 ]

    Beklenen Çıktı:
    Array Sayılarının ortalaması: 7.0
    */

        int[] arr = {20, 30, 25, 35, -16, 60, -100};

        int toplam=0;
        for (int each: arr){

            toplam+=each;
        }

        System.out.println("Array Sayılarının ortalaması: " + (toplam/arr.length));




    }

}
