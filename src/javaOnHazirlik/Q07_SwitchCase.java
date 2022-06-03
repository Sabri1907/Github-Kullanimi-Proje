package javaOnHazirlik;

import java.util.Locale;
import java.util.Scanner;

public class Q07_SwitchCase {

     /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir gun giriniz:");

        String day= scanner.next();

        switch (day){

            case "Pazartesi":
            case "Sali":
            System.out.println("Java Dersi Gunleri");
            break;

            case "Persembe":
            case "Cuma":
            System.out.println("Selenium Dersi Gunleri");
            break;

            case "Carsamba":
            case "Cumartesi":
            System.out.println("SQL Dersi Gunleri");
            break;

            default:
            System.out.println("Izin Gunu");
        }

    }
}
