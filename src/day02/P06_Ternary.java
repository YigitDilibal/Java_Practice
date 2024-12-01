package day02;

import java.util.Scanner;

public class P06_Ternary {

    public static void main(String[] args) {

// Kullanicidan bir character girmesini isteyiniz
// Character harf ise kucuk harf olup olmadigini kontrol ediniz
// Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
// Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
// Harf degilse ekrana "Harf degil" yazdiriniz
//97:a  122:z ascii değeri

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz..");

        char karakter = scanner.next().charAt(0);

        System.out.println(Character.isLetter(karakter)

                        ?
                        Character.isUpperCase(karakter)
                        ?
                        "Girilen karakter buyuk harf"
                        :
                        "Girilen karakter kucuk harf"
                        :
                        "Girilen karakter bir harf degil"
                );






    }
}
