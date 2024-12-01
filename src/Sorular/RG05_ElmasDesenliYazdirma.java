package Sorular;

import java.util.Scanner;

public class RG05_ElmasDesenliYazdirma {

    public static void main(String[] args) {

         /*5-----
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yarim elmas uzunlugunu giriniz.");
        int yarimelmas = scanner.nextInt();

        for (int i = 1; i <= yarimelmas ; i++) {

            for (int j = i; j < yarimelmas ; j++) {

                System.out.print(" ");

            }

            for (int j = 1; j <= (2*i-1) ; j++) {

                System.out.print("*");

            }

            System.out.println();

        }


        for (int i = yarimelmas-1; i >=1 ; i--) {

            for (int j = yarimelmas; j > i ; j--) {

                System.out.print(" ");

            }

            for (int j = 1; j <= (2*i-1) ; j++) {

                System.out.print("*");

            }
            System.out.println();

        }



    }

}
