package Sorular;

public class RG47_StringdeOrtadakiHarfleriBulma {

    /*47----
    Ortadaki harfi alabileceğimiz bir program yazın.
    Eğer harf sayısı 2 nin katına eşitse,
    ortadaki 2 harfi alın, diğer durumda ortadaki 1 harfi alın.

    Examples

    ortadakiHarf("test")
    Çıktı : es
    ortadakiHarf("testing")
    Çıktı : t
    ortadakiHarf("middle")
    Çıktı : dd
    ortadakiHarf("A")
    Çıktı : A
    */

    public static void main(String[] args) {


        System.out.println(ortadakiHarf("test"));
        System.out.println(ortadakiHarf("testing"));
        System.out.println(ortadakiHarf("middle"));
        System.out.println(ortadakiHarf("A"));
        System.out.println(ortadakiHarf("testi"));


    }

    public static String ortadakiHarf(String metin){

        if (metin.length()%2==0){
            String sonuc = "";
            return sonuc + metin.charAt(metin.length()/2-1) +metin.charAt(metin.length()/2);
        }else {
            String sonuc = "";
            return sonuc + metin.charAt(metin.length()/2);
        }





    }

}
