package Sorular;

public class RG25_ArraydeKacinciElemanOldugunuBulma {

    public static void main(String[] args) {

/*25----
    Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

    Array: [12,15,43,23,56,76,78,90,77,43]

    Aranan değer:56

    Beklenen Çıktı:
    56 sayısı arrayin 4. elemanı
    */

        int[] arr = {12,15,43,23,56,76,78,90,77,43};
        int aranan = 43;
        int kacinci = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]==aranan){
                kacinci=i;
            }
        }

        System.out.println(aranan + " sayisi arrayin " + kacinci+". elemani");



    }
}
