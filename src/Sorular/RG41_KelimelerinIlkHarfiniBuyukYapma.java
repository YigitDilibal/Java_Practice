package Sorular;

public class RG41_KelimelerinIlkHarfiniBuyukYapma {

    public static void main(String[] args) {

        /*41-----
    Girilen metindeki tüm kelimelerin ilk harflerini büyük yapınız.(diğer harflere dokunmayın, büyükse büyük, küçükse küçük kalsın).

    Örnek
    makeTitle("Bu bir başlıktır")
    Bu Bir Başlıktır

    makeTitle("tüm ilk harfler büyük olacak")
    Tüm İlk Harfler Büyük Olacak
    */
        System.out.println(makeTitle("Bu bir başlıktır"));
        System.out.println(makeTitle("tüm ilk harfler büyük olacak"));


    }

     public static String makeTitle(String metin){

        String[] arr = metin.split(" ");
         metin="";
        for (String each:arr){
            each=each.substring(0,1).toUpperCase()+each.substring(1);
            metin+=each+" ";
        }


        return metin;



     }

}
