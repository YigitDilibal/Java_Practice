package day03;

public class P10_nestedForLoop {

    public static void main(String[] args) {


// Aşağıdaki şekilde çıktı veren programı print içerisinde
// sadece bir tane # kullanarak yazıdırınız
//            # # # # #
//            # # # # #
//            # # # # #
//            # # # # #
//            # # # # #



        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 ; j++) {

                System.out.print("# ");

                if (j==5){
                    System.out.println("");
                }

            }
        }


    }
}
