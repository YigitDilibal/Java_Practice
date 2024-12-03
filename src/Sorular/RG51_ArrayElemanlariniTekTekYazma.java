package Sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RG51_ArrayElemanlariniTekTekYazma {

    public static void main(String[] args) {

/*51-----
    Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.

    Array elemanları:  siyah,sari,mavi,turuncu

    Beklenen Çıktı:
    siyah
    sari
    mavi
    turuncu
    */

        List<String> list = new ArrayList<>(Arrays.asList("siyah","sari","mavi","turuncu"));


        for (String each: list){
            System.out.println(each);
        }



    }

}
