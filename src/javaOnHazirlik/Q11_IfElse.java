package javaOnHazirlik;

import java.util.Scanner;

public class Q11_IfElse {

     /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen notunuzu rakamsal olarak giriniz:");
        int not = scan.nextInt();

        String notKarşılığı = "";

        if (not >= 90 && not <= 100) {

            System.out.println("Notunuz : \"A\" - \"Çok İyi\" ");

        } else if (not >= 80 && not<90) {

            System.out.println("Notunuz : \"B\" - \"İyi\" ");

        } else if (not >= 70 && not<80) {

            System.out.println("Notunuz : \"C\" - \"Orta\" ");

        } else if (not >= 60 && not<70) {
            System.out.println("Notunuz : \"D\" - \"Geçer\" ");

        } else if (not >= 0 && not<60 ) {

            System.out.println("Notunuz : \"F\" - \"Kaldın, seneye yine bekleriz\" ");

        } else
            System.out.println("Lütfen geçerli bir değer giriniz");
    }
}


