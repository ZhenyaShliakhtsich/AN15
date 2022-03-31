package com.teachMeSkills.an15.AltievAli.hm9.service.impl;

import com.teachMeSkills.an15.AltievAli.hm9.service.ReadAndWriteService;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class ReadAndWriteServiceImpl implements ReadAndWriteService {
    @Override
    public void write() throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
                "C:\\Users\\Irisha\\Desktop\\TeachMeSkills\\AN15\\src\\com\\" +
                        "teachMeSkills\\an15\\AltievAli\\hm9\\UpdatedFile", false));
             BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Irisha\\Desktop\\" +
                     "TeachMeSkills\\AN15\\src\\com" +
                     "\\teachMeSkills\\an15\\AltievAli\\hm9\\File.txt"))) {
            String line = bufferedReader.lines().map(lines -> lines + "\n").collect(Collectors.joining());
            System.out.println(line + "\n");
            Pattern pattern = Pattern.compile("(\\b\\w\\b|\\b\\w\\w\\b|\\b\\w\\w\\w\\b|)");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                String s1 = matcher.group();
                bufferedWriter.write(s1);
                bufferedWriter.newLine();
                //        bufferedWriter.write("\n");
            }
        }
    }
}




