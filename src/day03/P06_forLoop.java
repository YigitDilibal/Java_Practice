package day03;

import java.util.Scanner;

public class P06_forLoop {

    public static void main(String[] args) {

        /*
         * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
         * döngüden çıkılsın
         *
         * Bugün hava oldukca güzel.-> 2
         *
         *
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        int sayac= 0;

        for (int i = 0; i < metin.length() ; i++) {

            if (metin.toLowerCase().charAt(i) == 'a'){
                sayac++;
            }
            if (metin.toLowerCase().charAt(i)=='c'){
                break;
            }

        }

        System.out.println("Girdiginiz cumlede ilk c harfine kadar " + sayac + " tane a harfi var.");
        System.out.println("");

        for (int i = 0; i <=5 ; i++) {

            if (i==3){
                continue;
            }

            System.out.println(i+ " ");

        }


    }
}
