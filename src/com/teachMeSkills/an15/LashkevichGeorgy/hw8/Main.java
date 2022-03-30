package com.teachMeSkills.an15.LashkevichGeorgy.hw8;

import java.io.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

//Создать руками файл в который положить какой-то текст
//прочитать файл и удалить из него все слова, у которых длина больше 3 символов.
// Результат записать в новый файл
public class Main {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
        Date date = new Date();
        String[] text;
        ArrayList<String> finalText = new ArrayList<>();
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("" +
                    "src/com/teachMeSkills/an15/LashkevichGeorgy/hw8/HandFile.txt"));
            text = bufferedReader.readLine().split(" ");
            for (int i = 0; i < text.length; i++) {
                if (text[i].length() <= 3) {
                    finalText.add(text[i]);
                }
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.format("src/com/teachMeSkills/an15/LashkevichGeorgy/hw8/HandFile_%s.txt",
                    simpleDateFormat.format(new Date()))));
            for (int i = 0; i < finalText.size(); i++) {
                bufferedWriter.write(finalText.get(i));
                bufferedWriter.write(" ");
            }
            bufferedWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
