package Sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RG52_ArrayListteAralaraElemanEkleme {

    /*52-----
    Array list oluşturun daha sonra aşağıda belirtilen yerlere
    yeni array elemanlarını ekleyen java kodunu yazınız.

    Array List:  siyah,mavi,kirmizi,beyaz

    en başa: pembe
    mavi-kirmizi arasına yesil  renk eklenecek.

    Beklenen Çıktı:
    [pembe,siyah,mavi,yesil,kirmizi,beyaz]
    */

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("siyah","mavi","kirmizi","beyaz"));

        list.add(0,"pembe");

        list.add(3,"yesil");

        System.out.println(list);


    }

}
