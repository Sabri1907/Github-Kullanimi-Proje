package javaOnHazirlik;

public class Q17 {

    public static void main(String[] args) {
        byte sayi1=10;
        short sayi2=100;
        int sayi3=1000;
        float sayi4=10000f;
        double sayi5=1000000.60;

        /*
        sayi5=sayi4;
        System.out.println(sayi5); //10000.0
        */

        /*
        sayi4=sayi3;
        System.out.println(sayi4); //1000.0
        */


        /*
        sayi3=sayi2;
        System.out.println(sayi2); //100
        */

        sayi2=sayi1;
        System.out.println(sayi1);//10


    }
}
