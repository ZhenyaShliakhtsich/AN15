package com.teachMeSkills.an15.SavitskyRoman.hw3.task1and2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Deposit {
    double amount;
    int month;

    public Deposit(int amount, int month) {
        this.amount = amount;
        this.month = month;
    }

    public BigDecimal getAmount() {
        BigDecimal deposit = new BigDecimal(amount);
        for (int x = 1; x <= month; x++) {
            deposit = deposit.add(deposit.multiply(BigDecimal.valueOf(0.07))).setScale(2, RoundingMode.HALF_UP);
            /*  add() - сложение
                multiply() - умножение
                т.е х = х + (х * 0.07)
                setScale (количество цифр после запятой, режим округления (конкретно этот выполняет в большую сторону, если цифра >= 5))
            */
        }
        return deposit;
    }

    public BigDecimal getAmountByWhile() {
        BigDecimal deposit = new BigDecimal(amount);
        int x = 0;
        while (x != month) {
            deposit = deposit.add(deposit.multiply(BigDecimal.valueOf(0.07))).setScale(2, RoundingMode.HALF_UP);
            x++;
        }
        return deposit;
    }
}
