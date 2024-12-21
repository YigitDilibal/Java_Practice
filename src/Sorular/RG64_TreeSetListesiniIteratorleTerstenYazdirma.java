package Sorular;

import java.util.*;

public class RG64_TreeSetListesiniIteratorleTerstenYazdirma {

    public static void main(String[] args) {

        /*64-----
    Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım
    ve ardından  descendingIterator()  fonksiyonunu kullanarak
    ters sıradan yazdıralım.

    TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi

    Beklenen Çıktı:
    Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]

    Tersten Siralanisi:

    yesil
    turuncu
    sari
    mavi
    kirmizi
    */


        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList("Yesil","Sari","Mavi","Turuncu","Kirmizi"));

        System.out.println("Orjinal Tree sonucu: " + treeSet);

        Iterator iterator =  treeSet.descendingIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }






    }

}
