package Extra_day02;

import java.util.Scanner;

public class S02_Substring {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen adinizi ve soyadinizi giriniz.");
        String adSoyad = scanner.nextLine().replaceAll("\\s+"," ").trim();

        String arr[] = adSoyad.split(" ");

        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1).toLowerCase());
        }

        System.out.println(arr[arr.length-1].toUpperCase());





    }


}
