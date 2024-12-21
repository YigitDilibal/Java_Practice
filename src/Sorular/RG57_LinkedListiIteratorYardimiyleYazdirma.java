package Sorular;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class RG57_LinkedListiIteratorYardimiyleYazdirma {

    public static void main(String[] args) {

        /*57-----
    Bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki
    elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.

    LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu

    1. elemandan itibaren yazdıralım.

    Beklenen Çıktı:
    beyaz
    mavi
    yesil
    turuncu
    */

        LinkedList list = new LinkedList(Arrays.asList("Sari","Beyaz","Mavi","Yesil","Turuncu"));

        Iterator iterator = list.iterator();

        iterator.next();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }








    }
}
