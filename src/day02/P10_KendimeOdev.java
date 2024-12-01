package day02;

import java.util.Scanner;

public class P10_KendimeOdev {

    public static void main(String[] args) {



    //Soru 2- Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

    Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 2 basamakli pozitif bir tam sayi giriniz.");

        int girilenSayi = scanner.nextInt();


        int onlar = girilenSayi/10;
        int birler = girilenSayi%10;

        String yazi = "";

        if (girilenSayi < 0 || girilenSayi > 99) {
            System.out.println("Lütfen geçerli bir iki basamaklı sayı girin.");
        } else{

            switch (onlar){
                case 1:
                    yazi += "on ";
                    break;
                case 2:
                    yazi += "yirmi ";
                    break;
                case 3:
                    yazi += "otuz ";
                    break;
                case 4:
                    yazi += "kirk ";
                    break;
                case 5:
                    yazi += "elli ";
                    break;
                case 6:
                    yazi += "altmis ";
                    break;
                case 7:
                    yazi += "yetmis ";
                    break;
                case 8:
                    yazi += "seksen ";
                    break;
                case 9:
                    yazi += "doksan ";
                    break;

            }

            switch (birler) {
                case 1:
                    yazi += "bir";
                    break;
                case 2:
                    yazi += "iki";
                    break;
                case 3:
                    yazi += "uc";
                    break;
                case 4:
                    yazi += "dort";
                    break;
                case 5:
                    yazi += "bes";
                    break;
                case 6:
                    yazi += "alti";
                    break;
                case 7:
                    yazi += "yedi";
                    break;
                case 8:
                    yazi += "sekiz";
                    break;
                case 9:
                    yazi += "dokuz";
                    break;

            }

            System.out.println(yazi);

        }




    }
}
