package Sorular;

public class RG43_AlfabedeArdardaGelmeyenHarfiBulma {

    public static void main(String[] args) {

        /*43----
    Girilen kelimedeki alfabeye göre ard arda gelmeyen harfleri bulunuz. (İngilizce alfabeye göre).
    Eğer herhangi atlanan bir harf yoksa "Sıralı Harfler" yazdıralım.


    Örnekler

    kayipHarfler("abdefg")
    Çıktı : c

    kayipHarfler("mnopqs")
    Çıktı : r

    kayipHarfler("abcdefgh")
    Çıktı : Sıralı Harfler

    ilk örnekte :  /// b harfinden sonra c gelmemiş
    ikinci örnekte : /// p harfinden sonra r gelmemiş
    */

        System.out.println(kayipHarfler("abdefg")); // c
        System.out.println(kayipHarfler("mnopqs")); // r
        System.out.println(kayipHarfler("abcdefg")); // Sirali Harfler
        System.out.println(kayipHarfler("qrsuv")); // t
        System.out.println(kayipHarfler("hjklmn")); // i
        System.out.println(kayipHarfler("wxz")); // y
        System.out.println(kayipHarfler("nopqrst")); // Sirali Harfler



    }

    public static String kayipHarfler(String s1){

        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        String[] metin = s1.split("");

        int index=0;
        String kayipHarf="";

        for (int i = 0; i < alphabet.length; i++) {

            if (metin[0].equals(alphabet[i])){
                index=i;
            }
        }

        for (int i = 0; i < metin.length; i++) {

            if (!metin[i].equals(alphabet[index])){
                kayipHarf = alphabet[index];
                break;
            }else {
                kayipHarf="Sirali Harfler";
            }
            index++;
        }

        return kayipHarf;

        }







}
