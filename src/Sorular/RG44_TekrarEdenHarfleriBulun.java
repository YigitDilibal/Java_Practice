package Sorular;

import java.util.ArrayList;
import java.util.List;

public class RG44_TekrarEdenHarfleriBulun {

    public static void main(String[] args) {
         /*44----
    String içindeki birden fazla geçen karakter sayısını bulan program yazınız.
     Mesela "Merhaba" kelimesinde sadece a harfi tekrar ettiği için
     bu String için sonuç 1 olacak.
     Eğer herhangi tekrar eden bir harf yoksa 0 sayısını döndersin program.

    Örnekler:
    duplicates("Hello World!")
    Çıktı : 2
    duplicates("foobar")
    Çıktı : 1
    duplicates("helicopter")
    Çıktı : 1
    */

        System.out.println(duplicates("Hello World!"));
        System.out.println(duplicates("foobar"));
        System.out.println(duplicates("helicopter"));
        System.out.println(duplicates("boom doom toom foom aa bb cc dd"));


    }

    public static int duplicates(String metin){

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < metin.length(); i++) {

            if (Character.isLetter(metin.charAt(i))){
            if (metin.indexOf(metin.charAt(i))!=metin.lastIndexOf(metin.charAt(i))){
            if (!list.contains(metin.charAt(i))){
                    list.add(metin.charAt(i));
                }
              }
           }
        }

        return list.size();

    }

}
