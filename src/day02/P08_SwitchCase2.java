package day02;

import java.util.Scanner;

public class P08_SwitchCase2 {

    public static void main(String[] args) {


        // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ay numarasini giriniz (1-12)");
        int ay = scanner.nextInt();


       switch (ay){

           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               System.out.println("Girdiginiz ay 31 gun surmektedir.");
               break;
           case 4:
           case 6:
           case 9:
           case 11:
               System.out.println("Girdiginiz ay 30 gun surmektedir.");
               break;
           case 2:
               System.out.println("Girdiginiz ay 28 veya 29 gun surmektedir.");
               break;

           default:
               System.out.println("Lutfen gecerli bir ay numarasi giriniz (1-12)");
       }


       // kisaltmak icin

       switch (ay){

           case 1,3,5,7,8,10,12:
               System.out.println("Girdiginiz ay 31 gun surmektedir.");
               break;
           case 4,6,9,11:
               System.out.println("Girdiginiz ay 30 gun surmektedir.");
               break;
           case 2:
               System.out.println("Girdiginiz ay 28 veya 29 gun surmektedir.");
               break;

           default:
               System.out.println("Lutfen gecerli bir ay numarasi giriniz (1-12)");


       }


    }
}
