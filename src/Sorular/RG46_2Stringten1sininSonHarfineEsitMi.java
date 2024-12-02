package Sorular;

public class RG46_2Stringten1sininSonHarfineEsitMi {

    public static void main(String[] args) {

        /*46----
    Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen bir program yazınız.

    Örnekler:
    kontrolEt("abc", "bc") ➞ true
    kontrolEt("abc", "d") ➞ false
    kontrolEt("samurai", "zi") ➞ false
    kontrolEt("feminine", "nine") ➞ true
    kontrolEt("convention", "tio") ➞ false
    */

        System.out.println(kontrolEt("abc", "bc"));
        System.out.println(kontrolEt("abc", "d"));
        System.out.println(kontrolEt("samurai", "zi"));
        System.out.println(kontrolEt("feminine", "nine"));
        System.out.println(kontrolEt("convention", "tio"));

    }

    public static boolean kontrolEt(String metin, String kontrol){

        return metin.endsWith(kontrol);

    }

}
