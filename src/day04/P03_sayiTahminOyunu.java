package day04;

import java.util.Random;
import java.util.Scanner;

public class P03_sayiTahminOyunu {
    public static void main(String[] args) {

        /*

        Kullanicidan 1 ile 25 arasinda tahmin yapip belirlenen sayiyi bulup bulmadigini kontrol eden
        bulursa tebrikler bildiniz desin. Tahmin hakki 5 olmak uzere bilemediginde
        uzgunum bilemedniz ve n tahmin hakkiniz kaldi desin.

         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int hedefSayi = random.nextInt(1,25);
        System.out.println("1 ile 25 arasinda bir sayi tuttum, tahmin et. 5 hakkin var.");
        System.out.println("Tahminini gir.");
        int tahmin = scanner.nextInt();
        int tahminSayisi=1;

        if (tahminSayisi<5 && tahmin!=hedefSayi){
            while (tahminSayisi<5 && tahmin!=hedefSayi){

                System.out.println("Malesef bilemediniz, " + (5-tahminSayisi) + " Hakkiniz kaldi. ");
                if (tahmin<hedefSayi){
                    System.out.println(" Tuttugum sayi daha yuksek.");
                } else if (tahmin>hedefSayi) {
                    System.out.println(" Tuttugum sayi daha dusuk.");
                }
                tahmin = scanner.nextInt();
                tahminSayisi++;
            }
        }

        if (tahmin==hedefSayi){
            System.out.println("Tebrikler " + tahminSayisi + ". tahmininizde bildiniz. sayi " + hedefSayi+" idi.");
        }else {
            System.out.println("Malesef bilemediniz, sayi "+ hedefSayi+" idi.");
        }




    }

}
