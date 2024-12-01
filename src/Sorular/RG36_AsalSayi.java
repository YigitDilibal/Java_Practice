package Sorular;

public class RG36_AsalSayi {

    /*36-----
    Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.

    Test Data:

    isPrime(31)
    true

    isPrime(18)
    false
    */

    public static void main(String[] args) {

        System.out.println(isPrime(31));
        System.out.println(isPrime(18));




    }

    public static boolean isPrime(int sayi){
        boolean sonuc=false;

        for (int i = 2; i < sayi; i++) {

            if (sayi%i==0){
                sonuc=false;
                break;
            }
            if (i==sayi-1){
                sonuc=true;
            }
        }

        return sonuc;

    }

}
