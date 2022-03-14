package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.enums.ProductCategory;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.enums.ProductRank;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.enums.UsersActions;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models.SvCatalog;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models.SvProduct;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models.SvUser;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.services.SvUserAuthenticationService;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.services.implimentations.SvCatalogServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.services.implimentations.SvUserAuthenticationServiceImpl;

class MainTask3 {
    public static void main(String[] args) {
        SvCatalog catalog;
        //Понадобится чтобы в дальнейшем не заморачиваться
        catalog = catalogProductAndCategoryCreator();
        SvUser user = new SvUser("User", "Qwerty");

        svAuthenticationServiceTest(user);
        svCatalogServiceTest(catalog, user);
    }

    static SvCatalog catalogProductAndCategoryCreator() {
        SvCatalog catalog = new SvCatalog();
        catalog.addProduct(new SvProduct(ProductCategory.SPORT, "Мяч", 30, ProductRank.HIGH));
        catalog.addProduct(new SvProduct(ProductCategory.SPORT, "Гиря", 20, ProductRank.HIGH));
        catalog.addProduct(new SvProduct(ProductCategory.ELECTRONIC, "Телефон", 100, ProductRank.HIGH));
        catalog.addProduct(new SvProduct(ProductCategory.ELECTRONIC, "Ноутбук", 210, ProductRank.HIGH));
        catalog.addProduct(new SvProduct(ProductCategory.HOUSEHOLD, "Кофеварка", 170, ProductRank.HIGH));
        catalog.addProduct(new SvProduct(ProductCategory.HOUSEHOLD, "Блендер", 90, ProductRank.HIGH));
        return catalog;
    }

    private static void svAuthenticationServiceTest(SvUser user) {
        System.out.println("\nTest AuthenticationService:");
        SvUserAuthenticationService service = new SvUserAuthenticationServiceImpl();
        boolean u1 = service.isUserAuthenticated(user, "Pupkin", "Parol");
        System.out.println("\nВсе хорошо с паролем и логином? - " + u1);
        boolean u2 = service.isUserAuthenticated(user, "User", "Qwerty");
        System.out.println("Все хорошо с паролем и логином? - " + u2);
    }

    static void svCatalogServiceTest(SvCatalog catalog, SvUser user) {
        System.out.println("\nTest CatalogService:");
        SvCatalogServiceImpl service = new SvCatalogServiceImpl();
        service.showAllProducts(catalog);
        service.showProductsByCategory(ProductCategory.ELECTRONIC, catalog);
        //пока не знаю как здесь удобнее реализовать!!!!
        //поэтому хардкорно передаем элемент списка.
        service.addProductInBasket(user, catalog.getCatalogList().get(2));
        service.addProductInBasket(user,
                new SvProduct(ProductCategory.HOUSEHOLD, "Блендер", 90, ProductRank.HIGH));

        service.buyProduct(user, catalog.getCatalogList().get(2));

        System.out.println("\nЧто может пользователь:");
        for (UsersActions e : UsersActions.values()) {
            System.out.println(e);
        }
    }
}
