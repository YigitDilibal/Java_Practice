package Sorular;

public class RG40_SayininIngilizceYazilisi {

     /*40----
    Girilen sayının ingilizce yazılışını return eden bir method yazınız.

    Örnek

    numToEng(0)
    zero

    numToEng(18)
    eighteen

    numToEng(126)
    one hundred twenty six

    numToEng(909)
    nine hundred nine
    */

    public static void main(String[] args) {

        System.out.println(numToEng(0)); // zero
        System.out.println(numToEng(3)); // three
        System.out.println(numToEng(9)); // nine
        System.out.println(numToEng(10)); // Ten
        System.out.println(numToEng(12)); // Twelve
        System.out.println(numToEng(15)); // Fifteen
        System.out.println(numToEng(20)); // Twenty
        System.out.println(numToEng(45)); // Forty five
        System.out.println(numToEng(90)); // Ninety
        System.out.println(numToEng(100)); // one hundred
        System.out.println(numToEng(250)); // two hundred Fifty
        System.out.println(numToEng(256)); // two hundred Fifty six
        System.out.println(numToEng(485)); // four hundred Eighty five
        System.out.println(numToEng(999)); // nine hundred Ninety nine
        System.out.println(numToEng(1500)); // enter a 3 digit positive number
        System.out.println(numToEng(805)); // eight hundred five
        System.out.println(numToEng(700)); // seven hundred
        System.out.println();

        System.out.println(numToEng(112)); // one hundred Twelve
        System.out.println(numToEng(111)); // one hundred Eleven
        System.out.println(numToEng(719)); // seven hundred Nineteen



    }

    public static String numToEng(int sayi){

        int onlarbas2=sayi%100;
        int birlerBas = sayi % 10;
        int a = sayi / 10;
        int onlarBas = a % 10;
        int yuzlerBas = sayi / 100;

        String Eng = "";

        String[] birler={"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "Ten", "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                "Seventeen", "Eighteen", "Nineteen"};

        String[] onlar= {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if (sayi<0 || sayi>999){
            return "enter a 3 digit positive number";
        } else if (sayi<20) {
            return birler[sayi];
        }else if (sayi<100){
            if (birler[birlerBas].equals("zero")){
                Eng = Eng = onlar[onlarBas];
                return Eng;
            }
            Eng = onlar[onlarBas]+" "+birler[birlerBas];
            return Eng;
        } else{

            if (birler[birlerBas].equals("zero")){
                Eng = birler[yuzlerBas]+" hundred " + onlar[onlarBas];
                return Eng;
            } else if (onlarbas2<20) {
                Eng= birler[yuzlerBas] + " hundred " + birler[onlarbas2];
                return Eng;
                
            } else {
                Eng= birler[yuzlerBas] + " hundred " + onlar[onlarBas] + " " + birler[birlerBas];
                return Eng;

            }

        }


    }

}
