package megacom.service.StreamAPImethods.impl;

import megacom.enums.ProductCategory;
import megacom.models.Products;
import megacom.models.Sellers;
import megacom.service.FillData.FillAllData;
import megacom.service.FillData.impl.FillSumAndGum;
import megacom.service.StreamAPImethods.StreamAPImethods;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

public class ReduceOptionalAPImethod implements StreamAPImethods {

    private void reduceOptional() {

        FillAllData fillAllData = new FillSumAndGum();

        Optional<Double> reduce1 = fillAllData.getDataFromSumAndGum().stream()
                .map(placeOfSale -> placeOfSale.getSellers().stream())
                .flatMap(sellersStream -> sellersStream.map(sellers -> sellers.getSellerProducts()))
                .flatMap(products -> products.stream().map(products1 -> products1.getProductPrice()))
                .reduce((products, products2) -> products + products2);
        System.out.println("Reduce1 == " + reduce1);

        Double reduce2 = fillAllData.getDataFromSumAndGum().stream()
                .map(placeOfSale -> placeOfSale.getSellers().stream())
                .flatMap(sellersStream -> sellersStream.map(sellers -> sellers.getSellerProducts()))
                .flatMap(products -> products.stream().map(products1 -> products1.getProductPrice()))
                .reduce(-2473000.0, (products, products2) -> products + products2);
        System.out.println("Reduce with identity -2473000 == " + reduce2);


        ArrayList<Products> productsArrayList = new ArrayList<>();
        productsArrayList.add(new Products("Acer", 60000, ProductCategory.TECHNIC));
        productsArrayList.add(new Products("Asus", 80000, ProductCategory.TECHNIC));
        productsArrayList.add(new Products("HP", 70000, ProductCategory.TECHNIC));

        Sellers oneSeller = null;
        Optional<Sellers> sellerEmpty = Optional.empty();
        Optional<Sellers> sellerOf = Optional.of(new Sellers("Optinal", "OptionalLogin", productsArrayList));
        Optional<Sellers> sellersOfNullAble = Optional.ofNullable(null);

        Sellers sellerOrElse = sellerEmpty.orElse(new Sellers("OptinalOrElse", "OptionalLoginOrElse", productsArrayList));
        Sellers sellerOrElseGet = sellerEmpty.orElseGet(()-> new Sellers("Optinal", "OptionalLogin", productsArrayList));
//        Sellers sellerOrElseThrow = sellersOfNullAble.orElseThrow(()->{
//                throw new RuntimeException();
//        });

        System.out.println(sellerOrElse);
        System.out.println(sellerOrElseGet);
//        System.out.println(sellerOrElseThrow);

    }

    @Override
    public void streamAPI() {
        reduceOptional();
    }
}
























