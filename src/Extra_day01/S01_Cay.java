package Extra_day01;

import java.util.Scanner;

public class S01_Cay {

/*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)
    */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gunde kac bardak cay iciyorsunuz?");
        int bardak = scanner.nextInt();

        System.out.println("Caya kac seker atiyorsunuz?");
        int seker = scanner.nextInt();



        if (seker<=0 || bardak<=0){
            System.out.println("Seker kullanmiyorsun aferin");
        } else {

            double yillikSeker = (double) (bardak * seker * 365) /1000;
            System.out.println("Yilda " + yillikSeker + " kg seker tuketiyorsunuz");

            double kirkyillik = (double) (bardak * seker * 365 * 40) / 1000;
            System.out.println("40 Yilda " + kirkyillik + " kg seker tuketiyorsunuz");



        }

    }


}
