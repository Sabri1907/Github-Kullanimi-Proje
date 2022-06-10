package javaOnHazirlik;

import java.util.Scanner;

public class Q13_SwitchCase_HaftaninGunleri {

     /*
    Kullanıcıdan gün ismi girmesini isteyin. Girilen isim geçerli bir gün ise
    isminin 1,2 ve 3'üncü harflerini ilk harfi büyük diğerleri küçük olacak şekilde
    yazdırın. Geçerli gün ismi girilmezse "Geçerli gün ismi girin" yazdırın.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen gun ismi giriniz:");
        String gun = scan.next().toUpperCase();

        switch (gun) {

            case "MONDAY":
                System.out.println("Girilen Gun: " + gun.toUpperCase().charAt(0)+gun.toLowerCase().charAt(1)+
                gun.toLowerCase().toLowerCase().charAt(2));
                break;

            case "TUESDAY":
                System.out.println("Girilen Gun: " + gun.toUpperCase().charAt(0)+gun.toLowerCase().charAt(1)+
                        gun.toLowerCase().toLowerCase().charAt(2));
                break;

            case "WEDNESDAY":
                System.out.println("Girilen Gun: " + gun.toUpperCase().charAt(0)+gun.toLowerCase().charAt(1)+
                        gun.toLowerCase().toLowerCase().charAt(2));
                break;

            case "THURSDAY":
                System.out.println("Girilen Gun: " + gun.toUpperCase().charAt(0)+gun.toLowerCase().charAt(1)+
                        gun.toLowerCase().toLowerCase().charAt(2));
                break;

            case "FRIDAY":
                System.out.println("Girilen Gun: " + gun.toUpperCase().charAt(0)+gun.toLowerCase().charAt(1)+
                        gun.toLowerCase().toLowerCase().charAt(2));
                break;

            case "SATURDAY":
                System.out.println("Girilen Gun: " + gun.toUpperCase().charAt(0)+gun.toLowerCase().charAt(1)+
                        gun.toLowerCase().toLowerCase().charAt(2));
                break;

            case "SUNDAY":
                System.out.println("Girilen Gun: " + gun.toUpperCase().charAt(0)+gun.toLowerCase().charAt(1)+
                        gun.toLowerCase().toLowerCase().charAt(2));
                break;

            default:
                System.out.println("Lutfen Gecerli bir gun giriniz");


        }
    }
}
