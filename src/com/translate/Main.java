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

        ruWord = new StringBuilder(firstUpperCase(String.valueOf(ruWord)));

        System.out.println("Word: " + ruWord.toString().trim());
        System.out.print("Enter the translate: ");
        Scanner sc = new Scanner(System.in);

        String translate = sc.nextLine().trim();
        translate = firstUpperCase(translate);

        if (enWord.equals(translate)) {

            System.out.println("Right!");
        } else {

            System.out.println("It's wrong!");
        }
    }

    public static String firstUpperCase(String word){

        if(word == null || word.isEmpty()) return "";
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}