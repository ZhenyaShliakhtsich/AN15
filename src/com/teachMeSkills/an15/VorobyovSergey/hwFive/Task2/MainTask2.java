package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task2;

import java.time.LocalDate;

class MainTask2 {
    public static void main(String[] args) {
        Wine krizachek1 = new Wine("Крыжычек", Trademark.PRODUCER1,
                LocalDate.of(2020, 11, 27),
                "Веселит как танец смерти");
        Wine krizachek2 = new Wine("Крыжычек", Trademark.PRODUCER1,
                LocalDate.of(2021, 01, 27),
                "Веселит как танец");

        Wine lesnoiKaskad = new Wine("Лесной каскад", Trademark.PRODUCER2,
                LocalDate.of(2021, 01, 27),
                "Вельми выгаднае и заборыстае");

        MyWineChecker checker = new MyWineChecker();
        checker.checkWinePlease(lesnoiKaskad);
        boolean isEquals = checker.compareWinePlease(krizachek1, krizachek2);
        System.out.println("Винчик одинаковый=" + isEquals);
    }
}
