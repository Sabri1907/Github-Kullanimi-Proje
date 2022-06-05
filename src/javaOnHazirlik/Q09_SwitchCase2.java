package javaOnHazirlik;

import java.util.Scanner;

public class Q09_SwitchCase2 {

    //Kullanıcıdan 1 ile 7 arasında bir sayı
    //girmesini isteyiniz. Girilen değere göre hangi gün olduğunu ekrana yazdırınız.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 1-7 arası bir rakam giriniz:");
        int sayı = scan.nextInt();

        switch (sayı) {

            case 1:
                System.out.println("Günlerden Pazartesi");
                break;

            case 2:
                System.out.println("Günlerden Salı");
                break;

            case 3:
                System.out.println("Günlerden Çarşamba");
                break;

            case 4:
                System.out.println("Günlerden Perşembe");
                break;

            case 5:
                System.out.println("Günlerden Cuma");
                break;

            case 6:
                System.out.println("Günlerden Cumartesi");
                break;

            case 7:
                System.out.println("Günlerden Pazar");
                break;


            default:
                System.out.println("Lütfen geçerli bir rakam giriniz");
        }

    }
}
