package day01;

import javax.swing.*;

public class P04_kullanicidanVeriAlma {

    public static void main(String[] args) {

        /*

        Kullanicidan asagidaki bilgileri alarak bu formatta yazdirin.
        Adi: Murat
        Soyadi: Yigit
        Meslegi: Instructor
        yasi: 44
        Kayit basariyla tamamlandi.

         */

        String isim= JOptionPane.showInputDialog("Isminizi giriniz: ");
        String soyisim= JOptionPane.showInputDialog("Soyisminizi giriniz: ");
        String meslek= JOptionPane.showInputDialog("Mesleginizi giriniz: ");
        String yas= JOptionPane.showInputDialog("Yasinizi giriniz: ");
        JOptionPane.showMessageDialog(null, "Adi: "+isim+"\nSoyisim: "+soyisim+"\nMeslegi: "+ meslek + "\nYasi: "+ yas + "\n\nKayit basariyla tamamlandi." );




    }
}
