package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.services.implimentations;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.enums.ProductCategory;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models.SvBasket;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models.SvCatalog;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models.SvProduct;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models.SvUser;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.services.SvCatalogService;

import java.util.ArrayList;

public class SvCatalogServiceImpl implements SvCatalogService {

    @Override
    public void showAllProducts(SvCatalog catalog) {
        ArrayList<SvProduct> products = catalog.getCatalogList();
        System.out.println("\nВсе товары в каталоге");
        for (SvProduct p : products) {
            System.out.println(p.toString());
        }
    }

    @Override
    public void showProductsByCategory(ProductCategory category, SvCatalog catalog) {
        ArrayList<SvProduct> products = catalog.getCatalogList();
        System.out.println("\nВсе товары категории " + category.toString());
        for (SvProduct p : products) {
            if (p.getProductCategory().equals(category)) {
                System.out.println(p);
            }
        }
    }

    @Override
    public void addProductInBasket(SvUser user, SvProduct product) {
        System.out.println("\nКорзина покупателя");
        SvBasket basket = user.getUserBasket();
        basket.addToBasket(product);
        user.setUserBasket(basket);
        System.out.println("В корзине теперь");
        for (SvProduct p: user.getUserBasket().getProductList()){
            System.out.println(p);
        }
    }

    @Override
    public void buyProduct(SvUser user, SvProduct product) {
        System.out.println("\nКорзина покупок");
        for (SvProduct p: user.getUserBasket().getProductList()){
            System.out.println(p);
        }
        System.out.println("Вы хотите купить");
        System.out.println(product);

        if (user.getUserBasket().productList.contains(product)){
            System.out.println("Такой товар есть");
            user.getUserBasket().removeFromBasket(product);
        } else{
            System.out.println("Такого нет и что-то там делаем дальше");
        }
        System.out.println("\nКорзина покупок теперь");
        for (SvProduct p: user.getUserBasket().getProductList()){
            System.out.println(p);
        }
    }
}
