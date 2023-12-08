package org.java.lesson.wishlist;

import java.util.ArrayList;
import java.util.Scanner;

public class WishList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Creo una lista vuota di regali chiedendo all'utente di aggiungerne uno alla volta
        ArrayList<String> gift = new ArrayList<>();
        System.out.println(gift.size());
        boolean stop = false;
        while (!stop) {


            //Chiedo all'utente i nomi da inserire
            System.out.print("Add a new gift? (y/n)");
            String answer = scanner.nextLine();
            switch (answer) {
                case "y":
                    // Inserisce nuovo regalo
                    System.out.print("Insert gift: ");
                    String name = scanner.nextLine();
                    // aggiungo il regalo alla lista
                    gift.add(name);
                    break;
                case "n":
                    // Esce
                    System.out.println("OK");
                    stop = true;
                    break;
                default:
                    // Risposta non valida
                    System.out.println("invalid answer");
                    break;

            }

            // Quando esco dal while stampo a video la lista
            System.out.println(gift);

            // Stampo la lista andano a capo ad ogni regalo
            for (int i = 0; i < gift.size(); i++) {
                String currentElement = gift.get(i);
                System.out.println(currentElement);
            }
        }



        scanner.close();

    }
}


