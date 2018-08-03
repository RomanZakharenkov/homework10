package com.itacademy.zakharenkov.task1;

import java.util.Map;

/**
 * Created by Рома on 03.08.2018.
 */
public class Task1 {

    public static void main(String[] args) {
        String text = "London is the capital of Great Britain, its political, economic and cultural centre. It's one of the largest cities in the world. Its population is more than million people. London is situated on the river Thames.";
        Map<String, Integer> map = StringUtils.calculateCountUniqueWords(text);
        print(map);
    }

    private static void print(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}