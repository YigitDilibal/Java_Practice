package day03;

import java.util.Scanner;

public class P07_forLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("kelime gir");
        String kelime = scanner.next();
        int length =  kelime.length();
        String terstenKelime= "";

        for (int i = length-1; i >= 0; i--) {

            terstenKelime+=kelime.charAt(i);


        }

        System.out.println(terstenKelime);



    }
}
