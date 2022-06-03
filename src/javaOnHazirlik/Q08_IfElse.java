package javaOnHazirlik;

import java.util.Scanner;

public class Q08_IfElse {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen \"Y\" veya \"N\" giriniz:  ");
        char cevap=scan.nextLine().charAt(0);

        if (cevap== 'y' || cevap == 'Y'){

            System.out.println("Cevabiniz: Yes");
        } else if(cevap== 'n' || cevap == 'N') {
            System.out.println("Cevabiniz: No ");

        } else
            System.out.println("Hatali veri girdiniz, lutfen yeniden deneyiniz");

    }
}
