package day06;

import java.util.Scanner;

public class S01_SicaklikGostergesi {


        public static void main(String[] args) {
            // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
            // "e" girildiğinde veri girişi sonlandırılsın.
            // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

            Scanner scan=new Scanner(System.in);


            double maxSicaklik=Double.MIN_VALUE;
            double minSicaklik= Double.MAX_VALUE;

            System.out.println(" Sicaklik degerlerini giriniz, veri girişini sonlandırmak icin e'ye basiniz");

            while (true){
                System.out.println("Bir sicaklik degeri giriniz");
                String input=scan.nextLine();
                if (input.equals("e")){
                    System.out.println("Veri girisi sonlandirildi");
                    break;
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
