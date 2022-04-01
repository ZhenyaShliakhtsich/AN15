package com.teachMeSkills.an15.VorobyovSergey.hwEight;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Создать руками файл в который положить какой-то текст
// прочитать файл и удалить из него все слова, у которых длина больше 3 символов. Результат записать в новый файл
class MainTask1 {
    private static final String pathToRead = "src/com/teachMeSkills/an15/VorobyovSergey/hwEight/SomeFile1.txt";
    private static final String pathToWrite = "src/com/teachMeSkills/an15/VorobyovSergey/hwEight/SomeFilteredFile.txt";

    public static void main(String[] args) {
        File fileRead = new File(pathToRead);
        if (fileRead.canRead()) {
            System.out.println("Вроде бы мы можем попробовать прочитать файл");
            myReadWrite();
        } else {
            System.out.println("Сорян мы не можем прочитать файл");
        }

        //Эксперимент
//       fileWasRead.stream().flatMap(str -> Arrays.stream(str.split(" "))).forEach(s -> System.out.print(s + "------"));
//       ArrayList<String> toWrite = (ArrayList<String>) fileWasRead.stream().flatMap(str -> Arrays.stream(str.split(" "))).collect(Collectors.toList());
//        System.out.println(toWrite);
//       ArrayList<String> toFilter = (ArrayList<String>) fileWasRead.stream().flatMap(str -> Arrays.stream(str.split(" "))).filter(s -> s.length() < 4).collect(Collectors.toList());
//       System.out.println(toFilter);
    }

    //Сразу читаем и пишем.
    static void myReadWrite() {
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToRead));
             BufferedWriter writer = new BufferedWriter(new FileWriter(pathToWrite))) {
            String line;
            ArrayList<String> words;
            StringBuilder builder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                //обнуляем билдер перед записью новой строки
                builder.setLength(0);
                //делим строчку на слова и фильтруем
                words = (ArrayList<String>) Arrays.stream(line.split(" ")).filter(s -> s.length() < 4).collect(Collectors.toList());
                //собираем строку
                words.forEach(w -> builder.append(w).append(" "));
                //собственно запись
                writer.write(builder.toString());
                writer.newLine();
            }
            System.out.println("Запись прошла успешно!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
