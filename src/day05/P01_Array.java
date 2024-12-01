package day05;

import java.util.Arrays;

public class P01_Array {

    public static void main(String[] args) {

        /*
         * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
         *
         * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
         */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        String usd = "";
        String usdToplam= "";
        String eur= "";
        String eurToplam= "";

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].startsWith("$")){
                usd = "$";
                usdToplam = arr[i].substring(1,arr[i].length()-1);
            }


            if (arr[i].startsWith("£")){
                eur = "£";
                eurToplam = arr[i].substring(1,arr[i].length()-1);
            }

        }

        System.out.println("Dolar toplami: " + usd+usdToplam);
        System.out.println("Euro toplami: " + eur+eurToplam);


    }
}
