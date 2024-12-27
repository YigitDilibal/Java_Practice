package day06;

import java.util.Arrays;

public class S05_Array_Mevsimler {

    public static void main(String[] args) {
//Ilkbahardan baslayarak 4 mevsim array olusturun. Yazdan geriye dogru mevsimleri siralatip yazdirin

        String[] mevsimler=new String[4];
        mevsimler[0]="Ilkbahar";
        mevsimler[1]="Yaz";
        mevsimler[2]="Sonbahar";
        mevsimler[3]="Kis";

        System.out.println("Ilk hali: "+ Arrays.toString(mevsimler));

        String boskova=mevsimler[0];
        mevsimler[0]=mevsimler[1];
        mevsimler[1]=boskova;

        boskova=mevsimler[2];
        mevsimler[2]=mevsimler[3];
        mevsimler[3]=boskova;

        System.out.println("Yeni hali: "+Arrays.toString(mevsimler) );



    }

}
