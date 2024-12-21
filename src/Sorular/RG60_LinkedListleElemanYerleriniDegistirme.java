package Sorular;

import java.util.*;

public class RG60_LinkedListleElemanYerleriniDegistirme {

    public static void main(String[] args) {

        /*60-----
    Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı
    yer değiştiren java kodunu yazınız.

    LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu

    hint:  Collections.swap();

    Beklene Çıktı:
    Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
    Swap sonrası durum: [siyah,kirmizi,beyaz,mavi,yesil,turuncu]
    */

        LinkedList list = new LinkedList<>(Arrays.asList("Mavi","Kirmizi","Beyaz","Siyah","Yesil","Turuncu"));

        System.out.println("Orjinal Linked List: " + list);

        // kolay yol

//        Collections.swap(list,0,3);
//
//        System.out.println("Swap sonrasi durum: " + list);


        ListIterator iterator = list.listIterator();

        int index = 0;
        String index0 = "";
        String index3 = "";

        while (iterator.hasNext()){

            String currentIterator = (String) iterator.next();

            if (index == 0){
                index0 = currentIterator;
            }

            if (index == 3 ){
                index3 = currentIterator;
            }

            index++;
        }

        while (iterator.hasPrevious()){
            iterator.previous();
        }

        index = 0;

        while (iterator.hasNext()){

            iterator.next();

            if (index == 0){
                iterator.set(index3);
            }

            if (index == 3 ){
                iterator.set(index0);
            }

            index++;
        }

        System.out.println("Swap sonrasi durum: " + list);












    }



}
