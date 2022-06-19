package javaOnHazirlik;

import java.util.Scanner;

public class Q18_StringManipulation {
    /*
     * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String kelime=scan.nextLine();

        if (kelime.length()>=3){
            System.out.println("Girilen Kelimenin Son Uc Harfi: " + kelime.charAt(kelime.length()-2)+kelime.charAt(kelime.length()-1)+
                                                                    kelime.charAt(kelime.length()-2)+kelime.charAt(kelime.length()-1)+
                                                                    kelime.charAt(kelime.length()-2)+kelime.charAt(kelime.length()-1));


        } else System.out.println("Girilen Kelime : "+ kelime);
    }
}
