package Sorular;

public class RG42_KelimelerinilkHarfiniBuyukYapma {

    public static void main(String[] args) {

        /*42----
    İki farklı kelimeyi birleştirip, ilk harfini büyük kalan harfleri
    küçük yapan bir method yazınız.

    Örnekler
    getKelime("kal", "em") ? "Kalem"
    getWord("gözl", "emlemek") ? "Gözlemlemek"
    getWord("zor", "luk") ? "Zorluk"
    */

        System.out.println(getWord("gözl", "emlemek"));
        System.out.println(getWord("zor", "luk"));
        System.out.println(getWord("kal", "em"));


    }

    public static String getWord(String s1, String s2){


        return s1.substring(0,1).toUpperCase()+s1.substring(1).toLowerCase()+s2.toLowerCase();
    }


}
