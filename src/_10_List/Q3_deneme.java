package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Q3_deneme {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        List<String> yeniList = new ArrayList<>();

        System.out.println("Lutfen sayi listesi giriniz, \nbitirmek icin 'Q' tuslayiniz");
        String islem = "";


        while (!islem.equalsIgnoreCase("q")) {
            System.out.println("Sayi giriniz");
            islem = scan.next();
            yeniList.add(islem);
        }
        yeniList.remove(yeniList.size() - 1);

        int toplam = 0;

        for (String each : yeniList
        ) {
            int a = Integer.parseInt(each);
            toplam += a * a;

        }
        System.out.println("");
        System.out.println("sayilarin karalerinin toplamı : " + toplam);
    }
}
