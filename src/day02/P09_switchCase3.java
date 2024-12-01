package day02;

import java.util.Scanner;

public class P09_switchCase3 {

    public static void main(String[] args) {

        /*
       Bir şirketin çalışanları farklı bölümlerde çalışıyor ve
       her bölümün farklı bir maaş artış oranı var.
       Kullanıcıdan çalışanın bölüm numarasını ve mevcut maaşını isteyin.
       Bölüm numarasına göre çalışanın yeni maaşını hesaplayın ve ekrana yazdırın.

               Bölüm Numara ve Maaş Artış Oranları:

               1- IT (Bilgi Teknolojileri): %20 maaş artışı
               2- HR (İnsan Kaynakları): %15 maaş artışı
               3- Sales (Satış): %25 maaş artışı
               4- Marketing (Pazarlama): %10 maaş artışı
               5- Finance (Finans): %18 maaş artışı
               6- Operations (Operasyonlar): %12 maaş artışı
               Eğer kullanıcı geçerli bir bölüm numarası girmezse, ekrana "Geçersiz bölüm numarası" yazdırın.

 */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen calistiginiz deparmani yaziniz.");
        String departman = scanner.next().toLowerCase();
        System.out.println("Lutfen mevcut maasinizi yaziniz..");
        int maas = scanner.nextInt();


        switch (departman){
            case "it":
                System.out.println("Yeni maas: "+ maas*1.20);
                break;
            case "hr":
                System.out.println("Yeni maas: "+ maas*1.15);
                break;
            case "sales":
                System.out.println("Yeni maas: "+ maas*1.25);
                break;
            case "marketing":
                System.out.println("Yeni maas: "+ maas*1.10);
                break;
            case "finance":
                System.out.println("Yeni maas: "+ maas*1.18);
                break;
            case "operations":
                System.out.println("Yeni maas: "+ maas*1.12);
                break;
        }


    }
}
