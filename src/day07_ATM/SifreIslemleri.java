package day07_ATM;

public class SifreIslemleri {

    public static void sifreDegistirme() {
        GirisIslemleri.scan.nextLine();

        System.out.println("lutfen guncel sifrenizi giriniz.");
        String guncelSifre = GirisIslemleri.scan.nextLine();

        if (guncelSifre.equals(GirisIslemleri.sifre)){
            System.out.println("lutfen yeni sifrenizi giriniz");
            String yeniSifre = GirisIslemleri.scan.nextLine();

            if (yeniSifre.length()!=4 || !yeniSifre.matches("\\d{4}")){
                System.out.println("Sifre 4 karakterden ve sadece sayilardan olusmalidir.");
                MenuIslemleri.menu();
            }


            System.out.println("lutfen yeni sifrenizi tekrar giriniz");
            String yeniSifreTekrar = GirisIslemleri.scan.nextLine();

            if (yeniSifreTekrar.equals(yeniSifre)){
                GirisIslemleri.sifre=yeniSifre;
                System.out.println("sifrenizi basariyla degistirdiniz.");
                GirisIslemleri.giris();
            }else {
                System.out.println("Girdiginiz 2 sifre birbirinden farkli");
                MenuIslemleri.menu();
            }
        }else{
            System.out.println("guncel sifrenizi yanlis girdiniz");
            MenuIslemleri.menu();
        }

    }


}
