package Extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S01_Substring {

    public static void main(String[] args) {

// Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
// adinin ilk harfi buyuk digerleri kucuk,
// soyadinin tamami büyük harfle yazacak sekilde ad ayrı soyad ayrı sekilde alt alta ekrana yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi giriniz");
        String adSoyad = scanner.nextLine();

        String[] arr = adSoyad.split(" ");

        System.out.println(
                arr[0].substring(0,1).toUpperCase()+arr[0].substring(1).toLowerCase()+ "\n" +
                arr[1].toUpperCase()
        );




    }
}
