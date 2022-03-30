package com.teachMeSkills.an15.VorobyovSergey.hwEight;

import java.io.File;

//Создать руками файл в который положить какой-то текст
// прочитать файл и удалить из него все слова, у которых длина больше 3 символов. Результат записать в новый файл
class MainTask1 {
    public static void main(String[] args) {
        String pathRead = "src/com/teachMeSkills/an15/VorobyovSergey/hwEight/SomeFile.txt";
        File fileRead = new File(pathRead);
        System.out.println("Can we read this file- " + fileRead.canRead());
    }
}
