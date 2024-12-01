package Sorular;

import java.util.Scanner;

public class RG06_SesliSessizHarfBulma {

    public static void main(String[] args) {


        /*6----
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

    */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz..");
        String metin = scanner.next();

        metin = metin.toLowerCase();
        char harf = metin.charAt(0);


        if (metin.length()>1 || !(Character.isLetter(harf))){
            System.out.println("Yanlis giris yaptiniz..");
        }else if (harf ==  'a' || harf ==  'e' || harf ==  'i' || harf ==  'o' || harf ==  'u'){
            System.out.println(harf + " harfi sesli harftir.");
        }else {
            System.out.println(harf + " harfi sessiz harftir.");
        }





    }

}
