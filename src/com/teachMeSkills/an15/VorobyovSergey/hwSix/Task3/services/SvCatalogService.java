package com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.services;

import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.enums.ProductCategory;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models.SvCatalog;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models.SvProduct;
import com.teachMeSkills.an15.VorobyovSergey.hwSix.Task3.models.SvUser;

public interface SvCatalogService {
    void showAllProducts(SvCatalog catalog);

    void showProductsByCategory(ProductCategory category, SvCatalog catalog);

    void addProductInBasket(SvUser user, SvProduct product);

    //будем покупать товары по одному
    //поскольку дальнейшая логика не известна, возвращать ничего не будем
    //все оформим в void и покажем в консоли, что с корзиной и товаром
    void buyProduct(SvUser user, SvProduct product);
}
