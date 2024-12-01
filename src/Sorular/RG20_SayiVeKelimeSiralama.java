package Sorular;

import java.util.Arrays;

public class RG20_SayiVeKelimeSiralama {

    public static void main(String[] args) {

        /*20----
    Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
    not: Test datadaki değerleri kullanınız.


    Test Data:
    [1232, 1134,2345,1022]
    [Java, Python, PHP, C#, C Programming, C++]

    Beklenen Çıktı:
    [1022,1134,1232,2345]
    [C Programming, C#, C++, Java, PHP, Python]
    */

        int[] sayiArr = {1232, 1134,2345,1022};
        String[] metinArr = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};

        Arrays.sort(sayiArr);
        Arrays.sort(metinArr);

        System.out.println(Arrays.toString(sayiArr));
        System.out.println(Arrays.toString(metinArr));




    }
}
