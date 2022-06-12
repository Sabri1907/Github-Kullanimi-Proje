package javaOnHazirlik;

public class Q16_StringManipulation03 {

    // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
    // String  str 1= "$13.99"
    // String str 2= "$10.55"
    // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */

    public static void main(String[] args) {

        String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.replaceAll("\\D", "");
        str2 = str2.replaceAll("\\D", "");
        System.out.println(str1);
        System.out.println(str2);

        //str1 ve str2 icerigi sayi olan String'lerdir.
        // Eger iceriginin tamamen sayi oladugunu bildigimiz String varsa
        // parseDouble() veya parseInteger() methodu kullanabiliriz
        // ancak primitive data tipleri method'a sahip olmadiklarindan wrapper class kullanmak lazim


        double sayi1 = Double.parseDouble(str1);
        double sayi2 = Double.parseDouble(str2);
        double toplam = (sayi1 + sayi2) / 100;

        System.out.println("Iki String Toplami: $" + toplam);


    }
}
