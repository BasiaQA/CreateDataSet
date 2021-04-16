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
        StringBuilder dataSets = new StringBuilder();
        for (int i = 0; i < size; i++) {
          dataSets.append("Data Set.").append(i + 1)
                  .append(": ").append("film: ").append(films.get(i))
                  .append(", category: ").append(filmCategories.get(i))
                  .append( ", actor: ").append(actors.get(i))
                  .append('\n');
        }
        System.out.println(dataSets);
    }
    //method to read file
    static ArrayList<String> createList(String fileName) {
        String path = "C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\Files\\";

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
