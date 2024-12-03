package Sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RG55_ArrayListiindexeGoreYazdirma {

    /*55-----
    Bir ArrayList oluşturum ve önce ArrayListi yazdıralım
    sonra index numarasına göre tek tek yazdıralım.

    ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu

    Beklenen Çıktı:

    Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
    siyah
    mavi
    kirmizi
    yesil
    mor
    turuncu
    */

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("siyah","mavi","kirmizi","yesil","mor","turuncu"));

        System.out.println("Orjinal array list: "+list);

        for (String e:list){
            System.out.println(e);
        }




    }

}
