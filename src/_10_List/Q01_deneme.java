package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01_deneme {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String> list1 = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        List<String> list2 = new ArrayList<>();

        for (String each : list1) {
            if (!each.toLowerCase().contains("a")) {
                list2.add(each);
            }

        }
        System.out.println("a harfi icermeyen isimler : " + list2);


    }
}
