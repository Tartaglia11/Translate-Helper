package com.translate;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("E:\\TranslateHelper\\dictionary.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        ArrayList<String> words = new ArrayList<>();

        while ((st = br.readLine()) != null) {

            words.add(st);
        }

        System.out.println(Arrays.toString(words.toArray()));
    }
}