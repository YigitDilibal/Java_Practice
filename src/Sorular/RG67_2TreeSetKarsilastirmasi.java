package Sorular;

import java.util.Arrays;
import java.util.TreeSet;

public class RG67_2TreeSetKarsilastirmasi {

    public static void main(String[] args) {

        /*67-----
    Ortak elemanları olan 2 farklı TreeSet oluşturalım ve
    elemanlarını tektek karşılaştırıp aynı olanlar için "yes"
    farklı olanlar için "no" yazdıralım.

    1. TreeSet: mavi,yesil,kirmizi,sari
    2. TreeSet: yesil,mavi,pembe,turuncu

    Beklenen Çıktı:
    1. TreeSet: [kirmizi,mavi,sari,yesil]
    2. TreeSet: [mavi,pembe,turuncu,yesil

    Karsilastirma Sonucu:

    no
    yes
    no
    yes
    */

        TreeSet<String> treeSet1 = new TreeSet<>(Arrays.asList("Mavi","Yesil","Kirmizi","Sari"));
        TreeSet<String> treeSet2 = new TreeSet<>(Arrays.asList("Yesil","Mavi","Pembe","Turuncu"));

        for (String each1: treeSet1){

            boolean sonuc = false;

            for (String each2: treeSet2){

                if (each1.equals(each2)){
                    sonuc = true;
                }
            }

            System.out.println(sonuc ? "Yes": "No");

        }






    }
}
