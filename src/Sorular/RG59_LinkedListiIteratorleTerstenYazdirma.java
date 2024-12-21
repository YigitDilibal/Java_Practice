package Sorular;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class RG59_LinkedListiIteratorleTerstenYazdirma {

    public static void main(String[] args) {


        /*59-----
    Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.

    LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor

    Beklenen Çıktı:
    Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
    LinkedList Tersi:
    mor
    beyaz
    kirmizi
    yesil
    mavi
    sari
    */

        LinkedList list = new LinkedList<>(Arrays.asList("Sari","Mavi","Yesil","Kirmizi","Beyaz","Mor"));
        ListIterator iterator = list.listIterator();

        System.out.println("Orjinal Linked List: " + list);

        while (iterator.hasNext()){
            iterator.next();
        }

        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");
        }



    }


}
