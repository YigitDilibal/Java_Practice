package Sorular;

public class RG27_ArrayListtekiEnBuyuk2nciElamaniBulma {

    /*27----
    Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

    Array: [1232,2345,5467,678,3454,2312,3451]
    */

    public static void main(String[] args) {

        int[] arr = {1232,2345,5467,678,3454,2312,3451};

        int enBuyuk = arr[0];
        int ikinci = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>enBuyuk){
                enBuyuk=arr[i];
            }
        }

        if (arr[0]==enBuyuk){
            ikinci=arr[1];
        }else {
            ikinci=arr[0];
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>ikinci && arr[i]<enBuyuk){
                ikinci=arr[i];
            }

        }


        System.out.println("En buyuk eleman: " + enBuyuk);
        System.out.println("Ikinci en buyuk eleman: " + ikinci);

    }


}
