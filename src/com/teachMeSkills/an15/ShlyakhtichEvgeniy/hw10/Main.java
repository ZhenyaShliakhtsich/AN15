package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw10;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("src/com/teachMeSkills/an15/ShlyakhtichEvgeniy/hw10/fileInput.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter("src/com/teachMeSkills/an15/ShlyakhtichEvgeniy/hw10/fileOutput.txt"));
            String i = null;
            String str = "";
            while((i = bufferedReader.readLine()) != null ) {
               str = str + " " + i;
            }
            System.out.println(str);
            String[] strings = str.split("\\s");
            Stream<String> stringStream = Arrays.stream(strings);
            String readyString = stringStream.filter(c -> c.length()<3)
                                             .collect(Collectors.joining(" "));
            bufferedWriter.write(readyString);
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
