package Sorular;

import java.util.Arrays;
import java.util.LinkedList;

public class RG56_LinkedListteElemanlariTekTekYazdirma {

    public static void main(String[] args) {

        /*56-----
    Bir linkedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.

    LinkedList elemanları: sari,mavi,mor,yesil,beyaz

    Beklenen Çıktı:
    sari
    mavi
    mor
    yesil
    beyaz
    */

        LinkedList<String> list = new LinkedList<>(Arrays.asList("Sari","Mavi","Mor","Yesil","Beyaz"));

        for (String each: list){
            System.out.println(each);
        }




    }
}
