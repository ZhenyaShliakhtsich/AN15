package com.teachMeSkills.an15.VorobyovSergey.MyClassLib;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.LineReaderService;

import java.util.Scanner;

public class LineReader implements LineReaderService {
    public String readLine(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String line = scanner.nextLine();
        while (line.isEmpty()){
            System.out.println("Давай попробуем ввести хоть что-то!!! Не ленись!!!");
            line = scanner.nextLine();
        }
            return line;
    }
}
