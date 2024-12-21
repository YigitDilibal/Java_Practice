package Sorular;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RG63_TreeSetElemanlariniTekTekYazdirma {

    public static void main(String[] args) {

        /*63-----
    Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.

    TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah

    Beklenen Çıktı:
    beyaz
    kirmizi
    mavi
    sari
    siyah
    yesil
    */


        Set<String> treeSet = new TreeSet<>(Arrays.asList("Yesil","Mavi","Kirmizi","Sari","Beyaz","Siyah"));

        for (String each: treeSet){
            System.out.println(each);
        }






    }


}
