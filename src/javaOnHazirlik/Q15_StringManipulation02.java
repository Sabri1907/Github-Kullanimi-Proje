package javaOnHazirlik;

import java.util.Scanner;

public class Q15_StringManipulation02 {
    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("1'inci Kelimeyi Giriniz: ");
        String kelime1=scan.next();
        System.out.println("2'inci kelimeyi giriniz: ");
        String kelime2=scan.next();

        System.out.println("Ilk method ile Birlestirme: "+kelime1+" "+kelime2);
        System.out.println("Concat ile Birlestirme: "+kelime1.concat(" "+kelime2));

        String kelime1Ilksiz=kelime1.substring(1);
        String kelime2Ilksiz=kelime2.substring(1);

        System.out.println("Ilk method ile Birlestirme: "+kelime1Ilksiz+" "+kelime2Ilksiz);
        System.out.println("Concat ile Birlestirme: "+kelime1Ilksiz.concat(" "+kelime2Ilksiz));







    }
}
