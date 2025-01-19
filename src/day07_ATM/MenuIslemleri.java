package day07_ATM;

public class MenuIslemleri {

    public static void menu() {
        System.out.println("\nYapmak istediginiz islemin numarasini giriniz: \n" +
                "1.BAKIYE SORGULAMA\n" +
                "2.PARA YATIRMA\n" +
                "3.PARA CEKME\n" +
                "4.PARA GÖNDERME\n" +
                "5.SIFRE DEGISTIRME\n" +
                "6.CIKIS\n" +
                "Seciminiz:");

        int secim = GirisIslemleri.scan.nextInt();

        switch (secim){

            case 1:
                BakiyeIslemleri.bakiyeSorgulama();
                break;
            case 2:
                ParaIslemleri.paraYatirma();
                break;
            case 3:
                ParaIslemleri.paraCekme();
                break;
            case 4:
                ParaIslemleri.paraGonderme();
                break;
            case 5:
                SifreIslemleri.sifreDegistirme();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("olmayan bi islem sectiniz, tekrar deneyiniz");
                menu();

        }




    }

    private static void cikis() {
        System.out.println("sistemden cikiliyor");
        System.exit(0);
    }

}
