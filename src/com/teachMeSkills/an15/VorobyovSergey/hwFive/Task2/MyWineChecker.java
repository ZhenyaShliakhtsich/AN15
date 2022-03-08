package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task2;

class MyWineChecker {

    void checkWinePlease(Wine wine) {
        System.out.println(wine);

        System.out.println("\nСтрана производитель=" + wine.getCountry());
        System.out.println("TradeMark=" + wine.getProductTradeMark());
        System.out.println("Изменим ProductTradeMark");
        wine.setProductTradeMark(Trademark.PRODUCER1);
        System.out.println("Country=" + wine.getCountry());
        System.out.println("TradeMark=" + wine.getProductTradeMark());

        System.out.println("\nДата разлива=" + wine.getDateOfBottling());
        System.out.println("Изменим DateOfBottling()");
//        wine.setDateOfBottling(11,11,11);
//        wine.setDateOfBottling(LocalDate.of(1800,13,01));
//        wine.setDateOfBottling(1900,13,01);
        wine.setDateOfBottling(1900, 12, 01);
        System.out.println("Дата разлива=" + wine.getDateOfBottling());

        System.out.println("\nОписание=" + wine.getDescription());
        System.out.println("Изменим Description()");
        wine.setDescription("Укусна аж глаза закатываются");
        System.out.println("Описание=" + wine.getDescription());

        System.out.println("\nВозрост вина=" + wine.getAgeOfWineCounter());
    }

    boolean compareWinePlease(Wine w1, Wine w2) {
        //Проверка на сравнение только по имени и производителю
        System.out.println("\nПроверка на сравнение только по имени и производителю");
        return w1.equals(w2);
    }
}
