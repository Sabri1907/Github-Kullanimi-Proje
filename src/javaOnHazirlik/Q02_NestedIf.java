package javaOnHazirlik;

import java.util.Scanner;

public class Q02_NestedIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen yasinizi giriniz.");

        int age = scan.nextInt();

        if (age >= 18) {

            System.out.println("Yasi Oy kullanmaya uygun");

            if (age >= 70) {

            System.out.println("Uc kez oy kullanabilir");

            } else if (age >= 50) {

                System.out.println("Iki kez oy kullanabilir");

            } else {

                System.out.println("Bir kez oy kullanabilir");
            }

        } else if(age >0 && age<18){

            System.out.println("Yasi oy kullanmaya uygun degildir");

        } else

            System.out.println("Hatali giris yaptiniz");
    }

}
