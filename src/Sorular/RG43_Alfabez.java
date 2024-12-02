package Sorular;

public class RG43_Alfabez {

    public static void main(String[] args) {

        String str="nopqrst";
        boolean kontrol=true;
        for (int i = 0; i <str.length()-1 ; i++) {

            if (str.charAt(i)+1!=str.charAt(i+1)) {
                System.out.print(Character.toString(str.charAt(i)+1)+" ");
                kontrol=false;
                break;
            }

        }
        if (kontrol == true) {

            System.out.println(" Sıralı Harfler");
        }
    }
}

