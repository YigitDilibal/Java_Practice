package day03;

public class P05_forLoop {

    public static void main(String[] args) {

        // 1-180 arasindaki 4 ile bolunebilen sayilarin toplamini yazdirin

        int toplam = 0;

        for (int i = 1; i <= 180 ; i++) {

            if (i%4==0){
                toplam+=i;

            }
        }

        System.out.println("1-180 arasindaki 4 ile bolunebilen sayilarin toplami: "+toplam);





    }
}
