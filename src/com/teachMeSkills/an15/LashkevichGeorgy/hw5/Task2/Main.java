package com.teachMeSkills.an15.LashkevichGeorgy.hw5.Task2;

// Используя принципы ООП и язык Java, опишите класс Wine , который в дальнейшем может быть применим при создании
// электронного каталога вин (сам электронный каталог вин вам пока реализовывать не нужно). Продумайте, какие поля
// и методы понадобятся классу Wine, для выполнения следующих функций:
//1. Хранение информации о виде вина: название, торговая марка, страна, дата разлива, многострочное примечание(не реализовал)
// (может быть любое количество строк). 2. Доступ (установка и получение значений) к хранимой информации.
//3. Расчёт выдержки вина (текущая дата даётся как аргумент).
//Отдельно разработайте вспомогательный класс, который демонстрирует работоспособность вашего класса(не реализовал)
public class Main {

    public static void main(String[] args) {
        Wine wine = new Wine();
        wine.setCountry("Italy");
        wine.setMark("Shardone");
        wine.setTitle("Бырло");
        wine.setDateOfRazliv("12.04.1995");
        System.out.println(wine);
        wine.Vidergka();

    }
}
