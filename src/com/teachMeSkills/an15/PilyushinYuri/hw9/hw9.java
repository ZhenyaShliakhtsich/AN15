package com.teachMeSkills.an15.PilyushinYuri.hw9;

import java.io.*;
import java.util.Arrays;

public class hw9 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader
                    ("src/com/teachMeSkills/an15/PilyushinYuri/hw9/startFile.txt"));
            String line;
            String line2 = "";
            BufferedWriter bufferedWriter = new BufferedWriter
                    (new FileWriter("src/com/teachMeSkills/an15/PilyushinYuri/hw9/endFile.txt"));

            while ((line = bufferedReader.readLine()) != null) {
                line2 = line2 +  " " + line ;

            }
            String[] strings =line2.split("\\s");
            System.out.println(Arrays.toString(strings));

            String readyLine = "";
            bufferedWriter.write(readyLine);
            for (String string : strings) {
                if (string.toCharArray().length>3){
                    bufferedWriter.append(" ").append(string.substring(0, 3));

                } else {
                   bufferedWriter.append(" ").append(string);
                   bufferedWriter.newLine();
                }
            }

//            }}
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}