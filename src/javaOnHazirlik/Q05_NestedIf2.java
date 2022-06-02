package javaOnHazirlik;

public class Q05_NestedIf2 {

    /*
   0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
  kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
  cikis "Gecersiz" olmalidir
  NestedIf ve Ternary kullanarak 2 yolla da cozunuz
*/
    public static void main(String[] args) {

        int num=10;

        String result="";

        if (num>=0 && num<=9){

            if(num==9)
                result="dokuz";
            else if(num ==8)
                result="sekiz";
            else if(num ==7)
                result="yedi";
            else if(num ==6)
                result="alti";
            else if(num ==5)
                result="bes";
            else if(num ==4)
                result="dort";
            else if(num ==3)
                result="uc";
            else if(num ==2)
                result="iki";
            else if(num ==1)
                result="bir";
            else
                result="sifir";

        } else
            result="gecersiz numara";

        System.out.println(result);

    }
}
