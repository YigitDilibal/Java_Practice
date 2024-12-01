package Sorular;

import java.util.Arrays;

public class RG34_Array4HarfliKelimeReturn {

    public static void main(String[] args) {


        /*34-----
    String array dizisindeli 4 harfli kelimeleri return eden methodu yazınız.


    Test Data:
    isFourLetters(["Tomato", "Potato", "Pair"])

     ["Pair"]
    */

        String[] metin = {"Ahmet","Veli","Onur","Emmi","Sadik","Melis","Hamdi","Ayse","John","Seda"};

        System.out.println(Arrays.toString(metin));
        System.out.println(Arrays.toString(getFourLetters(metin)));



    }

    public static String[] getFourLetters(String[] arr){

        int sayac = 0;
        int i2=0;

        for (String each:arr){
            if (each.length()==4){
                sayac++;
            }
        }

        String[] fourLetter = new String[sayac];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length()==4){
                fourLetter[i2]="\""+arr[i]+"\"";
                i2++;
            }
        }

        return fourLetter;
    }
}
