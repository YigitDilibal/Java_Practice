package day03;

import java.util.Scanner;

public class P08_forLoop {

    public static void main(String[] args) {

        //  Kullanıcıdan 5 adet sayı isteyiniz
        //  Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        //  bu soruyu continue kullanarak çözünüz.

        Scanner scanner = new Scanner(System.in);

        int toplam = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println(i+". sayiyi giriniz");
            int sayi= scanner.nextInt();
            if (sayi>5 && sayi<10 ){
                continue;
            }else {
                toplam+=sayi;
            }
        }

        System.out.println("Toplam : " + toplam);






    }
}
