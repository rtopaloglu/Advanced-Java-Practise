package _10_List;

import java.util.Scanner;

public class Q09_deneme {
    public static void main(String[] args) {
        /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String arr[] = scan.nextLine().split("");
        String enCokTekrarEdenHarf ="";
        int sayac = 0;
        int maxSayac = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++){
                if(arr[i].equals(arr[j])){
                    sayac++;
                }

            }
            if(sayac > maxSayac){
                maxSayac = sayac;
                enCokTekrarEdenHarf= arr[i];
            }else if(sayac==maxSayac){
                enCokTekrarEdenHarf+=", "+arr[i];

            }
            sayac=0;

        }
        System.out.println("En cok tekrar eden harf : " + enCokTekrarEdenHarf);



    }
}
