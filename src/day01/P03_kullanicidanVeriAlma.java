package day01;

import java.util.Scanner;

public class P03_kullanicidanVeriAlma {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Adiniz : ");
        String isim= scan.nextLine(); //scan.nextline : tum satiri alir, next ise sadece ilk bosluga kadar alir.
        System.out.println("Soyadiniz: ");
        String soyad= scan.nextLine();

        System.out.println("Adi : "+ isim+"\nSoyadi: "+ soyad);

    }
}
