package Extra_day02;

import java.util.Scanner;

public class S01_Substring {

    public static void main(String[] args) {

        /*
            Kullanicidan tek seferde alacaginiz 2 kelimelik ad soyasi 2 ayri kelimeye ayiriniz.
            adinin ilk harfi buyuk digerleri kucuk
            soyadinin tamami buyuk harfle olacak sekildi ad ayri soyad ayri sekilde alt alta yazdirin.
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen adinizi ve soyadinizi giriniz.");
        String adSoyad = scanner.nextLine();

        String[] arr = adSoyad.split(" ");

        System.out.println(arr[0].substring(0,1).toUpperCase()+arr[0].substring(1).toLowerCase());
        System.out.println(arr[1].toUpperCase());



    }
}
