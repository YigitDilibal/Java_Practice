package Sorular;

import java.util.Arrays;
import java.util.PriorityQueue;

public class RG68_PriorityQueueElemanlariniYazdirma {

    /*68-----
    Bir Priority Queue  oluşruralım, elemanlarını ekleyim
    priority queue yazdıralım.

    priority queue elemanları: sari,yesil,mavi,kirmizi

    Beklenen Çıktı:
    Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]
    */


    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.add("Sari");
        queue.add("Yesil");
        queue.add("Mavi");
        queue.add("Kirmizi");

        System.out.println("Priority Queue elemanlari: " + queue);


    }
}
