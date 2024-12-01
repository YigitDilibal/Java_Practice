package day03;

import java.util.Scanner;

public class P11_elmasNestedForLoop {

    /*

     *
    ***
   *****
    ***
     *
    şeklini yazdırınız.


    */


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Desen yukseklígini giriniz..");
        int height = scanner.nextInt();

        int orta = height/2+1; // artisin son bulacagi ve azalmanin baslayacagi orta nokta

        // ust yarim

        for (int i = 1; i <=orta ; i++) {

            for (int j = i; j <orta ; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2*i-1) ; k++) {// 2*i-1 yazmamizin sebebi her bir satirda kac yildiz olacagini belirlememiz.
                System.out.print("*");
            }
            System.out.println("");
        }

        // alt yarim

        for (int i = orta-1 ; i >=1 ; i--) {

            for (int j = orta; j > i  ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1) ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }



    }



}
