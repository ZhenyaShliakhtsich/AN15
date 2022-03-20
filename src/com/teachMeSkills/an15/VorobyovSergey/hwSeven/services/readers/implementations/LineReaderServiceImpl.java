package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.LineReaderService;

import java.util.Scanner;

public class LineReaderServiceImpl implements LineReaderService {
    @Override
    public String readLine(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String line = scanner.nextLine();
        while (line.length() == 0){
            System.out.println("Давай попробуев ввести хоть что-то!!! Не ленись!!!");
            line = scanner.nextLine();
        }
            return line;
    }
}
