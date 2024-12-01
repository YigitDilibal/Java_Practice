package day05;

import java.util.ArrayList;
import java.util.List;

public class P02_array {

    public static void main(String[] args) {

/*
Verilen bir int dizisi icin elemanlarin karelerini bulup yazdırın
Example:{2,6,4,5,8,9}
output:{4,36,16,25,64,81}

 */

        int[] arr = {2,6,4,5,8,9};

        List<Integer> kareleri = new ArrayList<>();

        for (int each:arr){
            kareleri.add(each*each);
        }

        System.out.println(kareleri);




    }
}
