package Sorular;

public class RG04_SekilliYazdirma {

    public static void main(String[] args) {

        /*4----
    1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.

     Beklenen çıktı:

    1
    12
    123
    1234
    12345
    123456
    1234567
    12345678
    123456789
    12345678910
    */

        String sayi = "";

        for (int i = 1; i <=10 ; i++) {

            sayi+=i;
            System.out.println(sayi);

        }




    }
}
