package day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S04_SicaklikGostergesi_100Bitis {

    public static void main(String[] args) {
        // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
        // 100 girildiğinde veri girişi sonlandırılsın.
        // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

        Scanner scan=new Scanner(System.in);

        ArrayList<Double> gununSicakliklari=new ArrayList<>();

        int sonlandirmaSayisi=100;

        System.out.println("Sicaklik degerlerini giriniz, veri girişini sonlandırmak icin 100 giriniz");
        System.out.println("---------------------");

        while (true) {
            System.out.println("Bir sicaklik degeri giriniz");
            String input = scan.nextLine();

            if (input.matches("-?\\d+(\\.\\d+)?")){
                double girilenSicaklik=Double.parseDouble(input);
                if (girilenSicaklik==sonlandirmaSayisi){
                    System.out.println("Veri girisi sonlandirildi");
                    break;
                }
                gununSicakliklari.add(girilenSicaklik);

            }else {
                System.out.println("Gecersiz veri girisi!! Lütfen sayisal bir deger giriniz");
            }
        }

        if (!gununSicakliklari.isEmpty()) {
            Collections.sort(gununSicakliklari);
            System.out.println("Listenin deger sayisi: " + gununSicakliklari.size());
            System.out.println("Günün en dusuk sicaklik degeri: " + gununSicakliklari.get(0));
            System.out.println("Günün en yuksek sicaklik degeri: " + gununSicakliklari.get(gununSicakliklari.size()-1));
        }else {
            System.out.println("Liste bos");
        }
    }


}
