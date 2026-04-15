package com.gla.DynamicOnlineMarketplace;

public class Main {
    public static void main(String[] args) {

        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 800, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 20000, new GadgetCategory());

        MarketplaceUtils.applyDiscount(book, 10);
        MarketplaceUtils.applyDiscount(shirt, 20);
        MarketplaceUtils.applyDiscount(phone, 5);

        Catalog catalog = new Catalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        catalog.showCatalog();
    }
}
