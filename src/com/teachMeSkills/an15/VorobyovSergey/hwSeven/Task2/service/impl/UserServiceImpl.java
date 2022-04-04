package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl;

import com.teachMeSkills.an15.VorobyovSergey.MyClassLib.OnlyOneBigDecimalReader;
import com.teachMeSkills.an15.VorobyovSergey.MyClassLib.OnlyOneDoubleNumberReader;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.OnlyOneNumberReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.implementations.OnlyOneNumberReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.ConstVal;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Basket;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.PurchaseReceipt;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.PurchaseService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.UserService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    private Scanner scanner = new Scanner(System.in);
    private OnlyOneNumberReaderService numberReader = new OnlyOneNumberReaderServiceImpl();
    PurchaseService purchaseService = new PurchaseServiceImpl();

    //-------------------This is for admins-----------------------
    @Override
    public void addProduct(HashSet<Product> storage) {
        Product product = new Product();
        String carModel;
        HashSet<String> listOfCars = new HashSet<>();

        //Try to create custom product
        System.out.println("Enter product name:");
        product.setName(scanner.nextLine());

        System.out.println("Enter product price:");
        product.setPrice(BigDecimal.valueOf(numberReader.readNumberFromConsole()));

        System.out.println("Enter product amount:");
        product.setAmount(numberReader.readNumberFromConsole());

        System.out.println("Enter car model name or enter stop:");
        while (!(carModel = scanner.nextLine()).equalsIgnoreCase("Stop")) {
            System.out.println("Enter car model name or enter stop:");
            listOfCars.add(carModel);
        }
        product.setCarNames(listOfCars);

        System.out.println("You have just create and add new product:\n ->" + product);

        //Now try to add product to storage
        storage.add(product);

    }

    @Override
    public void changeProduct(HashSet<Product> storage) {
        //Storage on display
        System.out.println("Your storage now:");
        for (Product p : storage) {
            System.out.println(p);
        }

        Product tempProduct = null;
        //Try to change
        System.out.println("Enter name of product to change");
        String del = scanner.nextLine();
        for (Product p : storage) {
            if (p.getName().equals(del)) {
                tempProduct = p;
                storage.remove(p);
                break;
            }
        }

        String parameterToChange;
        if (tempProduct != null) {
            String carModel;
            HashSet<String> listOfCars = new HashSet<>();
            System.out.println("Че хочешь изменить? name, price, amount, carNames");
            parameterToChange = scanner.nextLine().toLowerCase();

            switch (parameterToChange) {
                case "name":
                    System.out.println("Enter name:");
                    tempProduct.setName(scanner.nextLine());
                    break;
                case "price":
                    System.out.println("Enter price:");
//                    tempProduct.setPrice(new BigDecimal(numberReader.readNumberFromConsole()));
//                    tempProduct.setPrice(BigDecimal.valueOf(
//                            new BigDecimal(new OnlyOneDoubleNumberReader().readNumberFromConsole()).doubleValue()));
                    tempProduct.setPrice(new OnlyOneBigDecimalReader().readNumberFromConsole());
                    break;
                case "amount":
                    System.out.println("Enter amount:");
                    tempProduct.setAmount(numberReader.readNumberFromConsole());
                    break;
                case "carnames":
                    System.out.println("Enter car model name or enter stop:");
                    while (!(carModel = scanner.nextLine()).equalsIgnoreCase("Stop")) {
                        System.out.println("Enter car model name or enter stop:");
                        listOfCars.add(carModel);
                    }
                    tempProduct.setCarNames(listOfCars);
                    break;
                default:
                    System.out.println("Значит ничего не хочешь изменить");
            }
            storage.add(tempProduct);
        }

    }

    @Override
    public void deleteProduct(HashSet<Product> storage) {
        //Storage on display
        System.out.println("Your storage now:");
        for (Product p : storage) {
            System.out.println(p);
        }

        //Try to remove
        System.out.println("Enter name of product to remove");
        String del = scanner.nextLine();
        for (Product p : storage) {
            if (p.getName().equals(del)) {
                storage.remove(p);
                break;
            }
        }
    }

    @Override
    public void showProducts(HashSet<Product> storage) {
        System.out.println("Your storage now:");
        for (Product p : storage) {
            System.out.println(p);
        }
    }


    //-------------------This is for users-----------------------
    @Override
    public User addProductToBasket(User user, HashSet<Product> storage) {
        //Storage on display
        System.out.println("Your storage now:");
        for (Product p : storage) {
            System.out.println(p);
        }

        Product tempProduct = null;
        //Try to add
        System.out.println("Enter name of product to add in basket");
        String productToAdd = scanner.nextLine();
        for (Product p : storage) {
            if (p.getName().equals(productToAdd)) {
                tempProduct = p;
                break;
            }
        }

        //Check for null
        if (user.getBasket() != null && user.getBasket().getProducts() != null) {
            System.out.println("Good!!! Basket and product is not null");
            user.getBasket().getProducts().add(tempProduct);
        } else {
            System.out.println("Awful!!! Something is null");
            user.setBasket(new Basket());
            user.getBasket().setProducts(new HashSet<>());
            user.getBasket().getProducts().add(tempProduct);
        }
        return user;
    }

    @Override
    public void payForBasket(User user) {
        //Calculate price
        if (user.getBasket().getProducts() != null) {
            PriceAndDiscountServiceImpl service = new PriceAndDiscountServiceImpl();
            PurchaseReceipt receipt = service.calculateTotalBasketPrice(user);
            //Try to pay for basket
            System.out.println("Введи ОПЛАЧИВАЮ если хочешь оплатить корзину");
            if (scanner.nextLine().equalsIgnoreCase("ОПЛАЧИВАЮ")) {
                System.out.println("Оплачено!!!");
                //Serialize and save
                purchaseService.savePurchaseReceipt(receipt);
                //Save as text
                purchaseService.savePurchaseReceiptInTxt(receipt);
                System.out.println("Чек сохранен!!!");
                user.getBasket().getProducts().removeAll(user.getBasket().getProducts());
            }
        } else {
            System.out.println("Basket is empty");
        }
    }

    @Override
    public void deleteProductFromBasket(User user) {
        //Check for empty basket and then dell
        if (showBasket(user)) {
            System.out.println("Enter name of product to dell from basket");
            String productToDell = scanner.nextLine();
            for (Product p : user.getBasket().getProducts()) {
                if (p.getName().equals(productToDell)) {
                    user.getBasket().getProducts().remove(p);
                    System.out.println("Removed product - " + p);
                    break;
                }
            }
        }
    }

    @Override
    public void rateProduct(HashSet<Product> storage) {
        //Storage on display
        System.out.println("Your storage now:");
        for (Product p : storage) {
            System.out.println(p);
        }

        //Try to rate
        System.out.println("Enter name of product to rate");
        String productToRate = scanner.nextLine();
        for (Product p : storage) {
            if (p.getName().equals(productToRate)) {
                System.out.println("Enter your rate");
                p.setAvgRate(new RateServiceImpl().calculateAvgRate(p));
                System.out.println("Now Average rate is: " + p.getAvgRate());
                break;
            }
        }
    }

    @Override
    public void commentProduct(HashSet<Product> storage) {
        //Storage on display
        System.out.println("Your storage now:");
        for (Product p : storage) {
            System.out.println(p);
        }

        //Try to comment
        System.out.println("Enter name of product to comment");
        String productToComment = scanner.nextLine();
        for (Product p : storage) {
            if (p.getName().equals(productToComment)) {
                System.out.println("Enter your comment");
                String newComment = scanner.nextLine();
                //null checker
                if (p.getComment() == null) {
                   p.setComment(new ArrayList<>());
                }
                    p.getComment().add(newComment);
                break;
            }
        }
    }

    @Override
    public boolean showBasket(User user) {
        if (user.getBasket().getProducts() != null) {
            for (Product p : user.getBasket().getProducts()) {
                System.out.println(p);
            }
            return true;
        } else {
            System.out.println("Basket is empty");
            return false;
        }
    }

    @Override
    public void showReceipts(User user) {
        String myDir = ConstVal.PATH_TO_RECEIPT_SERIALIZED;
        purchaseService.showUserReceipts(user, myDir);
    }

    @Override
    public void showReceiptsInTxt(User user) {
        String myDir = ConstVal.PATH_TO_RECEIPT_TXT;
        purchaseService.showUserReceiptsInTxt(user, myDir);
    }

}
