package Sorular;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RG61_HashSetleTreeSetiListeleyipYazdirma {

    /*61-----
    HashSet ile list oluşturalım ve  TreeSet ile sıralayalım
    ve listeyi yazdıralım.


    HashSet List: sari,mavi,kirmizi,yesil,mor

    Beklenen Çıktı:
    TreeSet elements:
    kirmizi
    mavi
    mor
    sari
    yesil
    */

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>(Arrays.asList("Sari","Mavi","Kirmizi","Yesil","Mor"));

        System.out.println("HashSet List: " + hashSet);

        Set<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("TreeSet elements: " + treeSet);

    }





}
