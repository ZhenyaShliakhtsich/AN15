package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.LineReaderService;

import java.util.Scanner;

public class LineReaderServiceImpl implements LineReaderService {
    @Override
    public String readLine(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
