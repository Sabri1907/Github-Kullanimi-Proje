package javaOnHazirlik;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen yasinizi giriniz.");

        int age= scan.nextInt();

        if (age>=18){
            System.out.println("Oy kullanmaya uygun");
        }

        if (age>=70){

            System.out.println("Uc kez oy kullanabilir");

    }

        if (70>age & age>=50) {

            System.out.println("iki kez oy kullanabilir");
        }

        if (50>age & age>=18){

            System.out.println("bir kez oy kullanabilir");
        }


        }
}
