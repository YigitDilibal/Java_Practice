package Sorular;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RG66_TreeSetElemanSayisiBulma {

    /*66-----
    Bir TreeSet oluşturalım ve Tree Listesini ve
    listedeki eleman sayısını yazdıran java kodunu yazdıralım.

    TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe

    Beklenen Çıktı:

    Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
    Tree eleman sayısı: 5
    */

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet<>(Arrays.asList("Yesil","Sari","Mavi","kirmizi","Pembe"));

        System.out.println("Orjinal TreeSet: " + treeSet);
        System.out.println("Tree eleman sayisi: " + treeSet.size());

        // diger yol

        int index = 0;
        for (Object each: treeSet){
            index++;
        }

        System.out.println(index);



    }



}
