package javaOnHazirlik;

import java.util.Scanner;

public class Q12_IfElse {
    /*
    Kullanıcıdan gün ismi girmesini isteyin. Girilen isim geçerli bir gün ise
    isminin 1,2 ve 3'üncü harflerini ilk harfi büyük diğerleri küçük olacak şekilde
    yazdırın. Geçerli gün ismi girilmezse "Geçerli gün ismi girin" yazdırın.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir gün ismi giriniz:");
        String gün = scan.nextLine().toUpperCase();

        if (gün.equals("MONDAY")) {

            System.out.println("Girilen Gün: " + gün.toUpperCase().charAt(0) + gün.toLowerCase().charAt(1) +
                    gün.toLowerCase().charAt(2));

        } else if (gün.equals("TUESDAY")) {

            System.out.println("Girilen Gün: " + gün.toUpperCase().charAt(0) + gün.toLowerCase().charAt(1) +
                    gün.toLowerCase().charAt(2));

        } else if (gün.equals("WEDNESDAY")) {

            System.out.println("Girilen Gün: " + gün.toUpperCase().charAt(0) + gün.toLowerCase().charAt(1) +
                    gün.toLowerCase().charAt(2));

        } else if (gün.equals("THURSDAY")) {

            System.out.println("Girilen Gün: " + gün.toUpperCase().charAt(0) + gün.toLowerCase().charAt(1) +
                    gün.toLowerCase().charAt(2));

        } else if (gün.equals("FRIDAY")) {

            System.out.println("Girilen Gün: " + gün.toUpperCase().charAt(0) + gün.toLowerCase().charAt(1) +
                    gün.toLowerCase().charAt(2));

        } else if (gün.equals("SATURDAY")) {

            System.out.println("Girilen Gün: " + gün.toUpperCase().charAt(0) + gün.toLowerCase().charAt(1) +
                    gün.toLowerCase().charAt(2));

        } else if (gün.equals("SUNDAY")) {

            System.out.println("Girilen Gün: " + gün.toUpperCase().charAt(0) + gün.toLowerCase().charAt(1) +
                    gün.toLowerCase().charAt(2));

        } else
            System.out.println("Lütfen geçerli bir gün giriniz");

    }
}
