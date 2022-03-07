package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task1;

enum Trademark {
    PRODUCER1(Country.ITALY),
    PRODUCER2(Country.GERMANY),
    PRODUCER3(Country.GERMANY);

    //Так мы получим производителей и если надо их страны на всякий случай
    Country country;

    Trademark(Country country) {
        this.country = country;
    }

    //Потом можем еще методов добавить
    public String getNameOfTrademarkCountry() {
        return country.name();
    }
}
