package com.teachMeSkills.an15.TuskalSergey.hw8;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        /*Создать руками файл в который положить какой-то текст
        прочитать файл и удалить из него все слова, у которых длина больше 3 символов.
        Результат записать в новый файл*/

        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/teachMeSkills/an15/" +
                "TuskalSergey/hw8/firstFile.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/com/teachMeSkills/an15/" +
                "TuskalSergey/hw8/secondFile.txt"));
        String line;
        String line2 = "";
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> lines2 = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        for (int i = 0; i < lines.size(); i++) {
            String text = lines.get(i);
            String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
            for (String w : words) {
                if (w.length() <= 3) {
                    line2 = line2 + w + " ";
                }
            }
            line2 = line2.substring(0, line2.length() - 1);
            lines2.add(line2);
            line2 = "";
        }
        for (int i = 0; i < lines2.size(); i++) {
            bufferedWriter.write(lines2.get(i));
            if (i < lines.size() - 1) {
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.close();
    }
}
