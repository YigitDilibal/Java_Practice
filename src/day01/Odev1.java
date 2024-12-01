package day01;

import javax.swing.*;

public class Odev1 {

    /*
   ÖDEV SORUSU: Aşağıdaki gibi bir ATM Karşılama Ekranı Hazırlayıp yazdırınız
   ********** WISE BANK  **********
       WISE ATM'YE HOŞGELDİNİZ
       1 – Bakiye Sorgulama
       2 – Para Yatırma
       3 – Para Çekme
       4 – Bilgi Güncelleme
       5 – Kart İade
   ********** WISE BANK  **********
    */

    public static void main(String[] args) {

        System.out.println(
        "********** WISE BANK  **********"
        +"\n\tWISE ATM'YE HOŞGELDİNİZ"
        +"\n\t1 – Bakiye Sorgulama"
        +"\n\t2 – Para Yatırma"
        +"\n\t3 – Para Çekme"
        +"\n\t4 – Bilgi Güncelleme"
        +"\n\t5 – Kart İade"
        +"\n********** WISE BANK  **********"
        );

        // ve

        JOptionPane.showMessageDialog(null,
         "********** WISE BANK  **********"
                +"\n\tWISE ATM'YE HOŞGELDİNİZ"
                +"\n\t1 – Bakiye Sorgulama"
                +"\n\t2 – Para Yatırma"
                +"\n\t3 – Para Çekme"
                +"\n\t4 – Bilgi Güncelleme"
                +"\n\t5 – Kart İade"
                +"\n********** WISE BANK  **********"
        );


    }
}
