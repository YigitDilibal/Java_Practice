package day04;

import java.util.Scanner;

public class P06_whileLoop {

    public static void main(String[] args) {

// Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
//         tamkare ise true  değilse false yazdırınız.

//         Not: sqrt gibi fonksiyonları  kullanmayın.

// Example 1:
// Input: 16
// Output: true
// Not: bu sayı tamkare çünkü 4*4 = 16


        Scanner scanner = new Scanner(System.in);
        System.out.println("Tam kare olup olmadigini kontrol etmek istediginiz pozitif bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        boolean tamKareMi=false;
        int i = 1;

        while (i*i<=sayi){
            if (i*i==sayi){
                tamKareMi=true;
                break;
            }
            i++;
        }

        if (tamKareMi){
            System.out.println("Girdiginiz " + sayi + ", " + i + " sayisinin tam karesine esittir.");
        }else {
            System.out.println("Girdiginiz " + sayi + " sayisi tamkare bir sayi degildir.");

        }





    }

}
