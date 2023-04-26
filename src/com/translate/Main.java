package com.translate;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("E:\\TranslateHelper\\dictionary.txt");
        ArrayList<String> words = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;


        while ((st = br.readLine()) != null) {

            words.add(st);
        }

        int randomWord = new Random().nextInt(words.size());

        StringBuilder result = new StringBuilder(words.get(randomWord));
        String enWord = result.substring(0, result.indexOf("-")).trim();
        StringBuilder ruWord = new StringBuilder(result.reverse().substring(0, result.indexOf("-")));
        ruWord = new StringBuilder(ruWord).reverse();

        System.out.println("Word: " + ruWord.toString().trim());
        System.out.print("Enter the translate: ");
        Scanner sc = new Scanner(System.in);

        String translate = sc.nextLine().trim();

        if (enWord.equals(translate)) {

            System.out.println("Right!");
        } else {

            System.out.println("It's wrong!");
        }
    }
}