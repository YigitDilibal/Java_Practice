package day07_ATM;

public class ParaIslemleri {

    public static void paraGonderme() {
        GirisIslemleri.scan.nextLine();

        System.out.println("Lutfen para gondermek istediginiz IBAN'i yaziniz");
        String iban = GirisIslemleri.scan.nextLine();

        if (iban.length()==10){
            if (iban.substring(0,2).equals("TR")){

                System.out.println("Gondermek istediginiz miktari giriniz.");
                double gonderilecekMiktar = GirisIslemleri.scan.nextDouble();

                if (gonderilecekMiktar>GirisIslemleri.bakiye){
                    System.out.println("bakiye yetersiz");
                    MenuIslemleri.menu();
                }else if (gonderilecekMiktar<10){
                    System.out.println("en az 10 TL gonderilebilir");
                    MenuIslemleri.menu();
                }else {
                    System.out.println(gonderilecekMiktar + " tutari basariyla gonderildi\n " +
                            "Eski bakiye: " + GirisIslemleri.bakiye );
                    GirisIslemleri.bakiye-=gonderilecekMiktar;
                    System.out.println("Yeni bakiye: " + GirisIslemleri.bakiye);
                    MenuIslemleri.menu();
                }


            }else {
                System.out.println("IBAN 'TR' ile baslamali");
                MenuIslemleri.menu();
            }

        }else {
            System.out.println("IBAN 10 karakterden olusmali");
            MenuIslemleri.menu();
        }


    }

    public static void paraCekme() {

        GirisIslemleri.scan.nextLine();

        System.out.println("Lutfen cekmek istediginiz miktari giriniz");
        double cekilecekMiktar = GirisIslemleri.scan.nextDouble();

        if (cekilecekMiktar>GirisIslemleri.bakiye){
            System.out.println("bakiye yetersiz");
            MenuIslemleri.menu();
        }else if (cekilecekMiktar<10){
            System.out.println("en az 10 TL para cekebilirsiniz");
            MenuIslemleri.menu();
        }else {
            System.out.println(cekilecekMiktar + " tutari basariyla cekildi\n " +
                    "Eski bakiye: " + GirisIslemleri.bakiye );
            GirisIslemleri.bakiye-=cekilecekMiktar;
            System.out.println("Yeni bakiye: " + GirisIslemleri.bakiye);
            MenuIslemleri.menu();
        }

    }

    public static void paraYatirma() {
        System.out.println("Yatirmak istediginiz miktari giriniz.");
        double yatirilanMiktar = GirisIslemleri.scan.nextDouble();

        if (yatirilanMiktar<10){
            System.out.println("en az 10 TL yatirabilirsiniz.");
            MenuIslemleri.menu();
        }else {
            GirisIslemleri.bakiye+=yatirilanMiktar;
            System.out.println("yatirilan miktar: " +  yatirilanMiktar + "\n Yeni toplam bakiye: " + GirisIslemleri.bakiye);
            MenuIslemleri.menu();

        }

    }



}
