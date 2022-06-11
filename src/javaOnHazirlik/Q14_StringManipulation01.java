package javaOnHazirlik;

import java.util.Scanner;

public class Q14_StringManipulation01 {
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola
    // tam ismini buyuk harfler ile yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       System.out.println("Lutfen isminizi ve soyismizi giriniz: " );
        String isim=scan.nextLine(),
            soyisim=scan.nextLine();

        String AdSoyad= isim.concat(" "+soyisim).toUpperCase();

       System.out.println("Isim ve Soyisminiz: "+AdSoyad);


    }

}
