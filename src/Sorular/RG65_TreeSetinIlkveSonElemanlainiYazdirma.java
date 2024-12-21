package Sorular;

import java.util.Arrays;
import java.util.TreeSet;

public class RG65_TreeSetinIlkveSonElemanlainiYazdirma {

      /*65-----
    Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

    TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe

    Beklenen Çıktı:
    Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
    ilk elemen: kirmizi
    son eleman: yesil
    */

    public static void main(String[] args) {


        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList("Sari","Mavi","Yesil","Kirmizi","Turuncu","Pembe"));

        System.out.println("Orjinal Tree: " + treeSet);

        System.out.println("Ilk eleman: " + treeSet.getFirst());
        System.out.println("Son eleman : " + treeSet.getLast());


    }

}
