package day04;

import java.util.Scanner;

public class P04_whileLoop {

    /*
     * sayinin basamak degerlerinin toplamini while loop ile yazdiran bir method create ediniz.
     */

    public static void main(String[] args) {

        basamakDegeriTopla();





    }

    public static void basamakDegeriTopla(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz..");
        int sayi= scanner.nextInt();
        int toplam = 0;
        while (sayi>0){
            toplam += sayi%10;
            sayi/=10;
        }

        System.out.println("Girdiginiz sayinin basamak degerleri toplami: " + toplam);

    }

}
