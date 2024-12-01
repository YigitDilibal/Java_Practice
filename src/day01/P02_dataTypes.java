package day01;

public class P02_dataTypes {

    public static void main(String[] args) {



    //Primitive
    // byte, short, integer, long, float, double, char boolean
    // Non-Primitive
    // Object, String

    String isim = "Wise";
    String mesaj = "";
    String number;

        System.out.println("isim = "+ isim);
        System.out.println(mesaj);
        number= "Numara";
        System.out.println("number = " + number);

        byte a= 13;
        System.out.println("byte MAX deger: "+ Byte.MAX_VALUE);
        System.out.println("byte MAX deger: "+ Byte.MIN_VALUE);


        short b = 1453;
        System.out.println("Short MAX deger: "+ Short.MAX_VALUE);
        System.out.println("Short MAX deger: "+ Short.MIN_VALUE);

        int c = 2345678;
        System.out.println("int MAX deger: "+ Integer.MAX_VALUE);
        System.out.println("int MAX deger: "+ Integer.MIN_VALUE);

        boolean emekliMi;
        emekliMi = true; // true or false

        System.out.println("Murat Babayigit\nEmekli mi: "+emekliMi);

        char murat = 'a';
        char murat2 = 97; // ASCII tablosunda 97'nin karsiligi a harfidir. Onu yazdirir.
        // A: 65 (+32) a:97     B= 66   b=98   D=68   d=100

        System.out.println(murat);
        System.out.println(murat2);









    }
}
