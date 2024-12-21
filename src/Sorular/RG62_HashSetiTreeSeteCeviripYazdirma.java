package Sorular;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RG62_HashSetiTreeSeteCeviripYazdirma {

    public static void main(String[] args) {

        /*62-----
    Bir HashSet oluşturalım ve
    HashSet elemanlarını TreeSet e dönüştürelim.
    Tree Set elemanlarını tektek yazdıralım.

    HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi

    Beklenen Çıktı:
    Tree Set Elemanlari:
    kirmizi
    mavi
    sari
    turuncu
    yesil
    */

        Set<String> hashSet = new HashSet<>(Arrays.asList("Sari","Mavi","Yesil","Turuncu","Kirmizi"));

        System.out.println("HashSet elemanlari: " + hashSet);

        Set<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("Tree Set Elemanlari: ");
        for (String each : treeSet){
            System.out.println(each);
        }



    }

}
