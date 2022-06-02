package javaOnHazirlik;

public class Q06_Ternary2 {

    /*
   0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
  kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
  cikis "Gecersiz" olmalidir
  NestedIf ve Ternary kullanarak 2 yolla da cozunuz
*/
    public static void main(String[] args) {

        int n = 7;

        String result = n==9? "nine" :n==8? "eight"
                :n==7? "seven" :n==6? "six"
                :n==5? "five"  :n==4? "four"
                :n==3? "three" :n==2? "two"
                :n==1? "one" :n==0? "zero" :"Invalid";

        System.out.println(result);


    }
}

