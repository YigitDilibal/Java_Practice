package Sorular;

public class RG28_ArraydeTekCiftSayiKacAdet {

    public static void main(String[] args) {

/*28----
    Array içerisindeki tek ve çift sayıların
    kaçar tane olduğunu bulan Java Kodu yazınız.

    Array: [1,2,3,4,5,6,7,8,9]

    Beklenen Çıktı:

    Tek Sayilar: 5
    Cift Sayilar: 4
    */

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int tek=0;
        int cift=0;

        for (int each: arr){
            if (each%2==0){
                cift++;
            }else {
                tek++;
            }
        }

        System.out.println("Tek sayilar: "+tek+ "\nCift sayilar: " + cift);

    }
}
