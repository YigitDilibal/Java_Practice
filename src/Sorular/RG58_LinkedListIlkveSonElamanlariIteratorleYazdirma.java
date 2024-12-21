package Sorular;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class RG58_LinkedListIlkveSonElamanlariIteratorleYazdirma {

    public static void main(String[] args) {

/*58-----
    Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım

    LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz

    Beklenen Çıktı:

    Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
    Listenin ilk elemani: sari
    listenin son elemani: beyaz
    */

        LinkedList list = new LinkedList<>(Arrays.asList("Sari","Mavi","Turuncu","Siyah","Yesil","Beyaz"));

        ListIterator iterator = list.listIterator();

        System.out.println("Orjinal list elemanlari: " + list);

//        System.out.println("Listenin ilk elemani: " +list.getFirst());
//        System.out.println("Listenin son elemani: " +list.getLast());

        int index = 0;

        while (iterator.hasNext()){

            String currentIterator = (String) iterator.next();

            if (index==0){
                System.out.println("Listenin ilk elemani: " + currentIterator);
            }

            if (!iterator.hasNext()){
                System.out.println("Listenin son elemani: " + currentIterator);
            }

            index++;
        }

    }


}
