package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> films = createList("films.txt");
        ArrayList<String> actors = createList("actors.txt");
        ArrayList<String> filmCategories = createList("filmCategories.txt");

        int size = filmCategories.size();
        //create data sets
        for (int i = 0; i < size; i++) {
            System.out.println("Data Set." + (i + 1) + ": " + "film: " + films.get(i) +
                    ", category: " + filmCategories.get(i) + ", actor: " + actors.get(i));
        }
    }
    //method to read file
    static ArrayList<String> createList(String fileName) {
        String path = "C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\";

        // reading file
        File file = new File(
                path + fileName);

        String listItem;
        ArrayList<String> list = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                listItem = sc.nextLine();
                list.add(listItem);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return list;
    }
}
