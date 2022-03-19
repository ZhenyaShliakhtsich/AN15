package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.OnlyOneNumberReaderService;

import java.util.Scanner;

public class OnlyOneNumberReaderServiceImpl implements OnlyOneNumberReaderService {
    @Override
    public int readNumberFromConsole() {
        int number;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Все-таки попробуй ввести число");
        }
        number = scanner.nextInt();
        return number;
    }
}
