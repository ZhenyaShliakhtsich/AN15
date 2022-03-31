package com.teachMeSkills.an15.BuzukArtyom.hw10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/com/teachMeSkills/an15/BuzukArtyom/hw10/text.txt");
        List<String> read = Files.readAllLines(path);
        System.out.println(read);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/com/teachMeSkills/an15/BuzukArtyom/hw10/textOutput.txt"))) {
            for (String s : read) {
                Pattern pattern = Pattern.compile("\\b[а-яА-Яa-zA-Z]{3}\\b"); //Поиск слов из 3-х символов
                //  Pattern pattern = Pattern.compile("\\b.{3}\\b"); Поиск слов до 3-х символов
                Matcher matcher = pattern.matcher(s);
                while (matcher.find()) {
                    System.out.println(matcher.group(0));
                    bufferedWriter.write(matcher.group() + "\n");
                }

            }
        }
    }
}


