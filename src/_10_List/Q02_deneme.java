package _10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class Q02_deneme {
    public static void main(String[] args) {

        /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

         */

        String isimler[][] = {{"Ali","Veli","Ayse"}, {"Hasan","Can"}, {"Suzan"}};
        harfSirasinaGoreIsimler(isimler);

    }

    private static void harfSirasinaGoreIsimler(String[][] isimler) {
        List<String> siraliList = new ArrayList<>();
        for (int i = 0; i < isimler.length; i++) {
            for (int j = 0; j < isimler[i].length; j++) {
                siraliList.add(isimler[i][j]);

            }

        }
        System.out.println(siraliList);
        Collections.sort(siraliList);
        System.out.println(siraliList);


    }

}

