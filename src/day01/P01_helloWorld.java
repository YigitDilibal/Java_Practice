package day01;

public class P01_helloWorld {

    public static void main(String[] args) {


        System.out.println("Hello World");
        System.out.println("Merhaba Dünya");
        String isim = "Murat";
        System.out.println("isim = " + isim);
        // Direkt deger yazdirmak icin kullanilir. Otomatik olarak en son olusturulan variable gelir.

        System.out.println();
        System.out.println();

        // Soru: konsola Hello World  "Hello World" yazdirin.

        System.out.println("Hello World"+"   "+"\"Hello World\"");
        System.out.println("Hello world \t\"Hello World\"");


        System.out.println();
        System.out.println();

        // herhangi bir java karakterini metin olarak algilatmak istersek basina \ konulkmasi gerekir

        /*
        Soru 2: Consola tek bir System.out.println() kullanarak asagidaki ifadeyi yazdirin

       Adi: Murat
       Soyadi: BABAYIGIT
         */

        System.out.println("Adi: Murat\nSoyadi: BABAYIGIT");

        //String icindeki \n ifadesi alt satirdan yazmaya devam etmeyi saglar.

        /*
        \t : bir tab bosluk birakir
        \n : bir alt satirdan devam eder
        \" : " isareti kod degil metin olarak islenir
        :' : ' isareti kod degil metin olarak islenir
         */

        String name = "Ali";
        String surname = "Can";
        System.out.println(name+"   "+surname);
        System.out.println(name+"\t"+surname);
        System.out.println();

        // Clean code kitabi pdf

        // print -println farki

        // System.out.println() ==> yazdirdiktan sonra hemen sonraki kodun islevini bir alt satirdan isletmeye baslar.
        System.out.println("Murat");System.out.println("Yigit");

        // System.out.print alt satira gecmez

        System.out.print("Murat");System.out.print(" Yigit");

        //veya

        System.out.print("Murat");
        System.out.print(" Yigit");

        System.out.println();

        System.err.println("Merhaba Hatalar");


    }
}
