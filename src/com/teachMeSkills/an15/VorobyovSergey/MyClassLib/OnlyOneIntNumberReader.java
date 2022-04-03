package com.teachMeSkills.an15.VorobyovSergey.MyClassLib;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.OnlyOneNumberReaderService;

import java.util.Scanner;

public class OnlyOneIntNumberReader implements OnlyOneNumberReaderService {
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
