package Sorular;

import java.util.Scanner;

public class RG49_FazlaMesaiyiHesaplama {

    public static void main(String[] args) {

/*49-----
    Fazla mesaiyi hesaplayan bir program yazınız.
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saatlik calisma ucretinizi giriniz.");
        double saatlik = scanner.nextDouble();
        System.out.println("Saat kacta calismaya basladiniz?");
        double start = scanner.nextDouble();
        System.out.println("Mesainiz saat kacta bitti?");
        double end = scanner.nextDouble();
        System.out.println("Mesai ucreti kacla katlaniyor?");
        double mesaiX = scanner.nextDouble();

        ucretHesapla(saatlik,start,end,mesaiX);




    }

    public static void ucretHesapla(double saatlik, double start, double end, double mesaiX){

        double normalUcret = (17.00 - start) * saatlik;
        double mesaiUcreti = (end - 17.00) * (saatlik*mesaiX);

        System.out.println("Saat 17:00'ye kadar toplam çalışma " + (17.00 - start) + " saat oldugu icin " +
                (17.00 - start) + " x " + saatlik + " = " + normalUcret);

        System.out.println("Saat 17:00 ile " + end + " arasinda toplam calisma " + (end-17.00) + " saat oldugu icin " +
                (end-17.00) + " x " + saatlik + " x " + mesaiX + " = " + mesaiUcreti );
        System.out.println();
        System.out.println("Toplam = " + (normalUcret+mesaiUcreti));

    }

}
