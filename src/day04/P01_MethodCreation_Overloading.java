package day04;

public class P01_MethodCreation_Overloading {
    public static void main(String[] args) {

        ortalamayiBul(12,35,65,128); // 60
        ortalamayiBul(12,25); // 18
        ortalamayiBul(12.2,25.4,65.5,76.22);

    }

    public static void ortalamayiBul(int a, int b, int c, int d){

        int ort = (a+b+c+d)/4;
        System.out.println("4 sayinin ortalamasi: "+ort);
    }

    public static void ortalamayiBul(int a, int b){

        int ort = (a+b)/2;
        System.out.println("2 sayinin ortalamasi: " + ort);
    }

    public static void ortalamayiBul(double a, double b, double c, double d){

        double ort = (a+b+c+d)/4;
        System.out.println("4 sayinin ortalamasi: "+ort);
    }

}
