package Extra_day02;

import java.util.Random;
import java.util.Scanner;

public class S03_TasKagitMakas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Tas, Kagit, Makas oyunu");




        int userWin = 0;
        int pcWin = 0;
        boolean girisDogruMu = false;

        while (!girisDogruMu || (userWin<5 || pcWin<5)) {
            try {
                int rndm = random.nextInt(1,4);
                System.out.println("Taş için 1, Kağıt için 2, Makas için 3'e basınız.");
                int kullaniciSecimi = scanner.nextInt();
                if (kullaniciSecimi >= 1 && kullaniciSecimi <= 3) {
                    girisDogruMu = true; // Geçerli bir giriş yapıldıysa döngüyü sonlandır
                    if (kullaniciSecimi == 1) {
                        System.out.println("Taş seçtiniz");
                        if (rndm==3){
                            userWin++;
                            System.out.println("bilgisayar Makas seçti, Kazandınız." + " " +userWin+"-"+pcWin);
                        } else if (rndm==1) {
                            System.out.println("Bilgisayar da Tas secti, berabere" + " " +userWin+"-"+pcWin);
                        }else {
                            pcWin++;
                            System.out.println("Bilgisayar Kagit secti, Kaybettiniz." + " " +userWin+"-"+pcWin);
                        }

                    } else if (kullaniciSecimi == 2) {
                        System.out.println("Kağıt seçtiniz");
                        if (rndm==3){
                            pcWin++;
                            System.out.println("bilgisayar Makas seçti, Kaybettiniz." + " " +userWin+"-"+pcWin);
                        } else if (rndm==1) {
                            userWin++;
                            System.out.println("Bilgisayar Tas secti, Kazandiniz." + " " +userWin+"-"+pcWin);
                        }else {
                            System.out.println("Bilgisayar da Kagit secti, Berabere." + " " +userWin+"-"+pcWin);
                        }


                    } else {
                        System.out.println("Makas seçtiniz");

                        if (rndm==3){
                            System.out.println("bilgisayar da Makas seçti, Berabere." + " " +userWin+"-"+pcWin);
                        } else if (rndm==1) {
                            pcWin++;
                            System.out.println("Bilgisayar Tas secti, Kaybettiniz" + " " +userWin+"-"+pcWin);
                        }else {
                            userWin++;
                            System.out.println("Bilgisayar Kagit secti, Kazandiniz." + " " +userWin+"-"+pcWin);
                        }
                    }

                    if (userWin==5){
                        System.out.println(userWin+"-"+pcWin+ " Kazandiniz, tebrikler.");
                        break;
                    } else if (pcWin==5) {
                        System.out.println(userWin+"-"+pcWin+ " Kaybettiniz.");
                        break;
                    }


                } else {
                    throw new RuntimeException("Geçersiz giriş. Lütfen 1, 2 veya 3 giriniz.");
                }
            } catch (Exception e) {
                String mesaj = e.getMessage() != null ? e.getMessage() : "Hatalı bir giriş yaptınız. Lütfen tekrar deneyiniz.";
                System.out.println(mesaj);
                scanner.nextLine(); // Hatalı girdiyi temizle
            }
        }



    }



}
