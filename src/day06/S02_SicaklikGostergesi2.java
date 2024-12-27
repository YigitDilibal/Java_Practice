package day06;

import java.util.Scanner;

public class S02_SicaklikGostergesi2 {

    public static void main(String[] args) {
        // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
        // "e" girildiğinde veri girişi sonlandırılsın.
        // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

        Scanner scan=new Scanner(System.in);

        double maxSicaklik=Double.MIN_VALUE;
        double minSicaklik= Double.MAX_VALUE;

        System.out.println("Sicaklik degerlerini giriniz, veri girişini sonlandırmak icin e'ye basiniz");
        System.out.println("---------------------");

        while (true){
            System.out.println("Bir sicaklik degeri giriniz");
            String input=scan.nextLine();
            if (input.equals("e")){
                System.out.println("Veri girisi sonlandirildi");
                break;
            } else if (!input.matches("-?\\d+(\\.\\d+)?")) {
                System.out.println("Gecersiz giris. Lütfen sadece e giriniz");
                continue;
                 /*
                -?    negatif degerdeki sayilar icin, negatif de olabilir anlamindadir
                \\d   0-9 arasi rakamlar icin
                +    basamak kazandirmak icin
                \\.\\d+  ondalikli kisim icin
                 */

            }

            double sicaklik=Double.parseDouble(input);
            if (sicaklik>maxSicaklik){
                maxSicaklik=sicaklik;
            }

            if (sicaklik<minSicaklik){
                minSicaklik=sicaklik;
            }
        }
        System.out.println("Gunun en yuksek sicakligi: "+maxSicaklik);
        System.out.println("Gunun en dusuk sicakligi: "+ minSicaklik);







    }

}
