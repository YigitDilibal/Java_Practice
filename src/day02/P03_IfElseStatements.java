package day02;

import java.util.Scanner;

public class P03_IfElseStatements {

    public static void main(String[] args) {


        /*
 *  Kullanicidan 3 tene pozitif  tam sayi alniz.
 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
      herhangi iki kenar farkı diger kenardan büyük olmali
     a+b>c>a-b
     a+c>b>a-c
     b+c>a>b-c
    a=b=c ise es kenar ucgen

 */
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ucgenin ilk kenarini yaziniz..");
        int a = scanner.nextInt();
        System.out.println("Lutfen ucgenin ikinci kenarini yaziniz..");
        int b = scanner.nextInt();
        System.out.println("Lutfen ucgenin ucuncu kenarini yaziniz..");
        int c = scanner.nextInt();
        
        if (a==b & a==c){
            System.out.println("Eskenar ucgen");
        } else if (a+b>c & c>a-b &  b+c>a & a>b-c & a+c>b & b>a-c) {
            System.out.println("Bu bir ucgen olabilir");
        } else {
            System.out.println("Bu bir ucgen olamaz");
        }


    }
}
