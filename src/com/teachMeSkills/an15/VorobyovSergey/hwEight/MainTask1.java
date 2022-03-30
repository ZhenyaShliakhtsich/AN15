package com.teachMeSkills.an15.VorobyovSergey.hwEight;

import java.io.*;
import java.util.ArrayList;

//Создать руками файл в который положить какой-то текст
// прочитать файл и удалить из него все слова, у которых длина больше 3 символов. Результат записать в новый файл
class MainTask1 {
    public static void main(String[] args) {
        String pathRead = "src/com/teachMeSkills/an15/VorobyovSergey/hwEight/SomeFile.txt";
        File fileRead = new File(pathRead);
        System.out.println("Can we read this file- " + fileRead.canRead());

        //читаем
        ArrayList<String> listText = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(pathRead))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.length() <= 3) {
                    listText.add(line);
                    System.out.println(listText);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
