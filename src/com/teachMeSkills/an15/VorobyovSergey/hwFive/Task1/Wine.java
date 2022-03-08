package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task1;


import java.time.DateTimeException;
import java.time.LocalDate; //потому что Oracle советует пользоваться этим пакетом
import java.time.Period;
import java.util.Objects;

class Wine {
    private String productName;
    private Trademark productTradeMark;
    //Вот что мне делать с не верным LocalDate???
    //А создавать конструктор без даты я категорически не хочу!!!
    private LocalDate dateOfBottling;
    private String description;

    //Для тех кто описание не придумал
    public Wine(String productName, Trademark productTradeMark, LocalDate dateOfBottling) {
        this.productName = productName;
        this.productTradeMark = productTradeMark;
        this.dateOfBottling = dateOfBottling;
    }

    public Wine(String productName, Trademark productTradeMark,
                LocalDate dateOfBottling, String description) {
        this.productName = productName;
        this.productTradeMark = productTradeMark;
        this.dateOfBottling = dateOfBottling;
        this.description = description;
    }

    public String getCountry() {
        return productTradeMark.getNameOfTrademarkCountry();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDate getDateOfBottling() {
        return dateOfBottling;
    }

    //Почему-то здесь я не могу заставить пробрасывать DateTimeException и обрабатывать в try catch
    public void setDateOfBottling(LocalDate dateOfBottling) throws DateTimeException {
        this.dateOfBottling = dateOfBottling;
    }

    public void setDateOfBottling(int year, int month, int day) {
        try {
            this.dateOfBottling = LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            System.out.println("Ты ввел не верную дату");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Trademark getProductTradeMark() {
        return productTradeMark;
    }

    public void setProductTradeMark(Trademark productTradeMark) {
        this.productTradeMark = productTradeMark;
    }

    //Тут много вариантов что возвращать есть. Смотря что нам надо
    String getAgeOfWineCounter() {
        LocalDate dateNow = LocalDate.now();
        Period result = Period.between(dateOfBottling, dateNow);
        return result.getYears() + "-year, " + result.getMonths() + "-month and " +
                result.getDays() + "-day";
    }

    @Override
    public String toString() {
        return "Wine{" + "productName=" + productName + '\'' +
                ", productTradeMark=" + productTradeMark +
                ", country=" + productTradeMark.getNameOfTrademarkCountry() +
                ",\n dateOfBottling=" + dateOfBottling +
                ", description='" + description + '\'' +
                '}';
    }

    //сравниваем только по названию и производителю
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wine wine = (Wine) o;
        return Objects.equals(productName, wine.productName) &&
                productTradeMark == wine.productTradeMark;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productTradeMark, dateOfBottling, description);
    }
}
