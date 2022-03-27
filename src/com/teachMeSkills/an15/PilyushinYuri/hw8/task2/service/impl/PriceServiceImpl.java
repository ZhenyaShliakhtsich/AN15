package com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.impl;

import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.model.User;
import com.teachMeSkills.an15.PilyushinYuri.hw8.task2.service.PriceService;

import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class PriceServiceImpl implements PriceService {
    @Override
    public BigDecimal calculateTotalBasketPrice(User user) {
            BigDecimal totalCount = new BigDecimal(0);
            for (int i = 0; i < user.getBasket().getProducts().size(); i++) {
                totalCount = totalCount.add(user.getBasket().getProducts().get(i).getPrice());
            }
            BigDecimal discount = new BigDecimal(calculateDiscount() / 100);
            System.out.println(discount);
            BigDecimal discountedPrice;
            discountedPrice = totalCount.subtract(totalCount.multiply(discount));
        return discountedPrice;
    }


    @Override
    public int calculateDiscount() {
        Random random = new Random();
        return random.nextInt(31);
    }

    @Override
    public void receipt(User user) throws IOException {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < user.getBasket().getProducts().size(); i++) {
                stringBuilder.append("\n" + user.getBasket().getProducts());
            }
            stringBuilder.append(calculateTotalBasketPrice(user));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
            Date date = new Date();
            BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter(String.format("src/com/teachMeSkills/an15/classes/class9/receipt_%s.txt",
                            simpleDateFormat.format(new Date()))));
            bufferedWriter.write(date.toString());
            bufferedWriter.append(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}