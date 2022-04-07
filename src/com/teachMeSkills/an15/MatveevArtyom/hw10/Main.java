package com.teachMeSkills.an15.MatveevArtyom.hw10;

//Создать руками файл в который положить какой-то текст
//прочитать файл и удалить из него все слова, у которых длина больше 3 символов. Результат записать в новый файл

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\tema1\\IdeaProjects\\AN15\\src\\com\\teachMeSkills\\an15\\MatveevArtyom\\hw10\\someFile.txt"));
            String s;
            String s2 ="";
            while ((s=bufferedReader.readLine())!=null){
                System.out.println(s);
                s2+=s;
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\tema1\\IdeaProjects\\AN15\\src\\com\\teachMeSkills\\an15\\MatveevArtyom\\hw10\\newFile.txt"));
            String[] words = s2.split("\\s");
            for (String word : words) {
                if (word.length() <= 3) {
                    bufferedWriter.write(word);
                    bufferedWriter.write(" ");
                }
            }
            bufferedWriter.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
