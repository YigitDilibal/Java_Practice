package day02;

import java.util.Scanner;

public class P04_hizCezasi {

    public static void main(String[] args) {

        /* Problem tanimi : Kulanicidan aracacinin hizini aliniz Trafik cezasinin
         * degerini hesaplayin. 45 hiz siniridir.
         * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
         * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
         * Eger Hiziniz 85 -94 arainda ise: Ceza 320 $'dir.
         * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
         * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
         * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tespit edilen hiz degerini giriniz..");
        int hiz = scanner.nextInt();

        System.out.println("Ehliyeti var mi ? (Evet, Hayir)");
        char ehliyet = scanner.next().toLowerCase().charAt(0);

        if (hiz<=55){

            System.out.println("Hiziniz " + hiz + " oldugundan cezaniz bulunmamaktadir.");

        } else if (ehliyet == 'e') {

            if (hiz > 94) {
                System.out.println("Hiziniz " + hiz + " ve ehliyetiniz oldugu icin Cezaniz : 500$");
            } else if (hiz > 85) {
                System.out.println("Hiziniz " + hiz + " ve ehliyetiniz oldugu icin Cezaniz : 320$");
            } else if (hiz > 75) {
                System.out.println("Hiziniz " + hiz + " ve ehliyetiniz oldugu icin Cezaniz : 150$");
            } else if (hiz > 55) {
                System.out.println("Hiziniz " + hiz + " ve ehliyetiniz oldugu icin Cezaniz : 100$");
            }

        } else if (ehliyet == 'h') {

            if (hiz > 94) {
                System.out.println("Hiziniz " + hiz + " ve ehliyetiniz olmadigi icin Cezaniz : 70$");
            } else if (hiz > 85) {
                System.out.println("Hiziniz " + hiz + " ve ehliyetiniz olmadigi icin Cezaniz : 520$");
            } else if (hiz > 75) {
                System.out.println("Hiziniz " + hiz + " ve ehliyetiniz olmadigi icin Cezaniz : 350$");
            } else if (hiz > 55) {
                System.out.println("Hiziniz " + hiz + " ve ehliyetiniz olmadigi icin Cezaniz : 300$");


            } else {
                System.out.println("Lutfen ehliyet var mi sorusuna Evet veya Hayir olarak cevap veriniz..");
            }

        }
    }
    }