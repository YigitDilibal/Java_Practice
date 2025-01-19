package day06;

import java.math.BigDecimal;
import java.util.Scanner;

public class S06_ATM {


    static Scanner scan =new Scanner(System.in);
    static String kartNo="123456";
    static String sifre="1234";
    static double bakiye = 10000;

    public static void main(String[] args) {
        /*
             ATM EKRANI VE ISLEMLER
        -Kullanicidan giriş için kart numarasi ve şifresini isteyin,
           eger herhangi birini yanlis girerse tekrar girmesini isteyin.
        -Kart numarasini boşluk ile girerse, eger numara doğruysa kabul edin.
        -Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri (Menu listesi) ekrana yazdirin.
        -Menu listesinde;
               Bakiye sorgulama, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis
               islemleri olacaktır.
        -Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez ve gönderilemez.
        -Para gönderme işleminde istenen iban TR ile baslamali ve toplam 10 karakter olmali,
            eger iban bu kriterlere uygun değilse menü ekranina geri donmelidir.
       - Sifre değiştirme işlemini yapmadan önce mevcut şifreyi teyit etmelidir.
         */

        giris();

    }

    public static void giris(){
        System.out.println("****************Yigit BANK*******************");
        System.out.println(" Güvenliginiz icin sifrenizi kimseyle paylasmayiniz");

        System.out.println("Kart numarasini giriniz");
        String KkartNo= scan.nextLine();

        System.out.println(" Sifrenizi giriniz");
        String KSifre= scan.nextLine();

        if (KkartNo.replaceAll("\\s+","").equals(kartNo) && KSifre.equals(sifre)){
            menu();
        }else {
            System.out.println("hatali giris yaptiniz, yeniden deneyiniz");
            giris();
        }

    }

    private static void menu() {
        System.out.println("\nYapmak istediginiz islemin numarasini giriniz: \n" +
                "1.BAKIYE SORGULAMA\n" +
                "2.PARA YATIRMA\n" +
                "3.PARA CEKME\n" +
                "4.PARA GÖNDERME\n" +
                "5.SIFRE DEGISTIRME\n" +
                "6.CIKIS\n" +
                "Seciminiz:");

        int secim = scan.nextInt();

        switch (secim){

            case 1:
                bakiyeSorgulama();
                break;
            case 2:
                paraYatirma();
                break;
            case 3:
                paraCekme();
                break;
            case 4:
                paraGonderme();
                break;
            case 5:
                sifreDegistirme();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("olmayan bi islem sectiniz, tekrar deneyiniz");
                menu();

        }


    }

    private static void cikis() {
        System.out.println("sistemden cikiliyor");
        System.exit(0);
    }

    private static void sifreDegistirme() {
        scan.nextLine();

        System.out.println("lutfen guncel sifrenizi giriniz.");
        String guncelSifre = scan.nextLine();

        if (guncelSifre.equals(sifre)){
            System.out.println("lutfen yeni sifrenizi giriniz");
            String yeniSifre = scan.nextLine();

            if (yeniSifre.length()!=4 || !yeniSifre.matches("\\d{4}")){
                System.out.println("Sifre 4 karakterden ve sadece sayilardan olusmalidir.");
                menu();
            }


            System.out.println("lutfen yeni sifrenizi tekrar giriniz");
            String yeniSifreTekrar = scan.nextLine();

            if (yeniSifreTekrar.equals(yeniSifre)){
                sifre=yeniSifre;
                System.out.println("sifrenizi basariyla degistirdiniz.");
                giris();
            }else {
                System.out.println("Girdiginiz 2 sifre birbirinden farkli");
                menu();
            }
        }else{
            System.out.println("guncel sifrenizi yanlis girdiniz");
            menu();
        }

    }

    private static void paraGonderme() {
        scan.nextLine();

        System.out.println("Lutfen para gondermek istediginiz IBAN'i yaziniz");
        String iban = scan.nextLine();

        if (iban.length()==10){
            if (iban.substring(0,2).equals("TR")){

                System.out.println("Gondermek istediginiz miktari giriniz.");
                double gonderilecekMiktar = scan.nextDouble();

                if (gonderilecekMiktar>bakiye){
                    System.out.println("bakiye yetersiz");
                    menu();
                }else if (gonderilecekMiktar<10){
                    System.out.println("en az 10 TL gonderilebilir");
                    menu();
                }else {
                    System.out.println(gonderilecekMiktar + " tutari basariyla gonderildi\n " +
                            "Eski bakiye: " + bakiye );
                    bakiye-=gonderilecekMiktar;
                    System.out.println("Yeni bakiye: " + bakiye);
                    menu();
                }


            }else {
                System.out.println("IBAN 'TR' ile baslamali");
                menu();
            }

        }else {
            System.out.println("IBAN 10 karakterden olusmali");
            menu();
        }


    }

    private static void paraCekme() {

        scan.nextLine();

        System.out.println("Lutfen cekmek istediginiz miktari giriniz");
        double cekilecekMiktar = scan.nextDouble();

        if (cekilecekMiktar>bakiye){
            System.out.println("bakiye yetersiz");
            menu();
        }else if (cekilecekMiktar<10){
            System.out.println("en az 10 TL para cekebilirsiniz");
            menu();
        }else {
            System.out.println(cekilecekMiktar + " tutari basariyla cekildi\n " +
                    "Eski bakiye: " + bakiye );
            bakiye-=cekilecekMiktar;
            System.out.println("Yeni bakiye: " + bakiye);
            menu();
        }

    }

    private static void paraYatirma() {
        System.out.println("Yatirmak istediginiz miktari giriniz.");
        double yatirilanMiktar = scan.nextDouble();

        if (yatirilanMiktar<10){
            System.out.println("en az 10 TL yatirabilirsiniz.");
            menu();
        }else {
            bakiye+=yatirilanMiktar;
            System.out.println("yatirilan miktar: " +  yatirilanMiktar + "\n Yeni toplam bakiye: " + bakiye);
            menu();

        }

    }

    private static void bakiyeSorgulama() {
        System.out.println("Guncel bakiyeniz: " + bakiye);
        menu();
    }

}