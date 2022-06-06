package javaOnHazirlik;

public class Q03_Ternary {

    public static void main(String[] args) {


        char finalNotu = 'B';

        String result = "";

        result =                                                                                                                              (finalNotu == 'A') ? "Gayet Basarili" :
                 (finalNotu == 'B') ? "Basarili" :
                 (finalNotu == 'C') ? "Ha Gayret" : "Digerleri";


        System.out.println("result = " + result);


    }
}
