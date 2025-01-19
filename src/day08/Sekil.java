package day08;

public class Sekil {

     /*
    Cember, dikdortgen ve kare sekillerinin alan ve cevre hesaplamasini yapan bir uygulama gelistiriniz.
    1-Asagidaki hiyarasiye gore classlar creat ediniz...
        Sekil class(parent) <--Cember class(child)
        Sekil class(parent) <--Dikdortgen class(child)<--Kare class(child)
    2- Classlara uygun olacak sekilde yaricap, uzunluk ve genislik veriable'ler ekleyiniz.
    3- Cember Dikdortgen Karenin alan ve cevre hesaplamalarini yaptirip sonuclari Runner classta yazdiriniz.

 */

    double yaricap;
    double uzunkenar;
    double kisakenar;

    public Sekil(double yaricap) {
        this.yaricap = yaricap;
    }

    public Sekil(double uzunkenar, double kisakenar) {
        this.uzunkenar = uzunkenar;
        this.kisakenar = kisakenar;
    }
}
