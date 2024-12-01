package Sorular;

public class RG31_SaatiSaniyeyeCevirme {

    public static void main(String[] args) {

         /*31----
    Saati saniyeye çeviren java methodunu yazınız.

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */

        System.out.println(howManySeconds(2));


    }

    public static int howManySeconds(int hour){

        return hour*3600;


    }

}
