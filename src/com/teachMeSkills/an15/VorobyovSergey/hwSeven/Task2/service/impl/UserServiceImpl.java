package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.impl;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.OnlyOneNumberReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.implementations.OnlyOneNumberReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Basket;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.Product;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.PurchaseReceipt;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service.UserService;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.util.*;

public class UserServiceImpl implements UserService {
    private Scanner scanner = new Scanner(System.in);
    private OnlyOneNumberReaderService numberReader = new OnlyOneNumberReaderServiceImpl();

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
                    tempProduct.setPrice(new BigDecimal(numberReader.readNumberFromConsole()));
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
            System.out.println("Go to if - check for null");
            user.getBasket().getProducts().add(tempProduct);
        } else {
            System.out.println("Go to else - check for null");
            user.setBasket(new Basket());
            user.getBasket().setProducts(new HashSet<>());
            user.getBasket().getProducts().add(tempProduct);
        }
        return user;
    }

    @Override
    public void payForBasket(User user) {
        //Calculate price
        PriceAndDiscountServiceImpl service = new PriceAndDiscountServiceImpl();
        PurchaseReceipt receipt = service.calculateTotalBasketPrice(user);
        //Try to pay for basket
        System.out.println("Введи ОПЛАЧИВАЮ если хочешь оплатить корзину");
        if (scanner.nextLine().equalsIgnoreCase("ОПЛАЧИВАЮ")) {
            System.out.println("Оплачено!!!");
            new PurchaseServiceImpl().savePurchaseReceipt(receipt);
            System.out.println("Чек сохранен!!!");
            user.getBasket().getProducts().removeAll(user.getBasket().getProducts());
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
                p.setComment(scanner.nextLine());
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
        String myDir = "src/com/teachMeSkills/an15/VorobyovSergey/hwSeven/Task2/purchaseDB";
        File file = new File(myDir);
        PurchaseReceipt receipt = new PurchaseReceipt();
        String regex = "^" + user.getLogin() + ".+$";

        if (file.isDirectory()) {
            //Имя директории
            System.out.println("You id dir - " + file.getName());
            //Бежим по директории
            for (File f : file.listFiles()) {
                //Имя файла для наглядности
                System.out.print(f.getName() + " - ");
                //Читаем чек, десериализуем
                if (f.isFile() && f.getName().matches(regex)) {
                    try {
                        receipt = (PurchaseReceipt) new ObjectInputStream(new FileInputStream(f)).readObject();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    //Чек на экран
                    System.out.println(receipt);
                } else {
                    System.out.println("Это нам не надо");
                }
            }
        }
    }
}
