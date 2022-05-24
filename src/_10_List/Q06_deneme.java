package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06_deneme {
    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        List<Integer> sayiler = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1));
        List<Integer> tekrarsizSayilar = new ArrayList<>();

        for (Integer each : sayiler) {
            if(!tekrarsizSayilar.contains(each)){
                tekrarsizSayilar.add(each);

            }

        }
        System.out.println(tekrarsizSayilar);

        int tekrarsizArray [] = new int [tekrarsizSayilar.size()];
        for (int i = 0; i <tekrarsizSayilar.size(); i++) {
            tekrarsizArray[i]= tekrarsizSayilar.get(i);

        }
        System.out.println(Arrays.toString(tekrarsizArray));

    }
}
