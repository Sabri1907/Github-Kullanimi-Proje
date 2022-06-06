package javaOnHazirlik;

public class Q10_Ternary03 {

    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */

    public static void main(String[] args) {

        int fiyat= 21;

        String sonuc=(fiyat<10)?"Ucuz":fiyat<20?"Normal":"Pahalı";

        System.out.println("sonuc = " + sonuc);


    }
}
