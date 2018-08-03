package com.itacademy.zakharenkov.task1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Рома on 03.08.2018.
 */
public final class StringUtils {

    private static final String DELIMITERS = "[,.!?:; ()]+";

    private StringUtils() {
    }

    public static Map<String, Integer> calculateCountUniqueWords(String text) {
        Map<String, Integer> words = new HashMap<>();
        String[] wordsArray = text.split(DELIMITERS);
        for (String word : wordsArray) {
            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
            } else {
                words.put(word, 1);
            }
        }
        return words;
    }
}
