package Sorular;

public class RG38_EnbuyukEnKucukSayiFarki {

    public static void main(String[] args) {

        /*38----
    Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.

    Örnek -
    farkBul([10, 15, 20, 2, 10, 6])
    18
    */

        int[] arr = {10,15,20,2,10,6};
        int[] arr2 = {10,15,20,10,6,21,64,200};

        System.out.println(farkBul(arr));
        System.out.println(farkBul(arr2));



    }

    public static int farkBul(int[] arr){
        int enBuyuk=arr[0];
        int enKucuk=arr[0];

        for (int each:arr){
            if (each>enBuyuk){
                enBuyuk=each;
            }
        }

        for (int each:arr){
            if (each<enKucuk){
                enKucuk=each;
            }
        }

        return enBuyuk-enKucuk;

    }

}
