package megacom.service.StreamAPImethods;

import megacom.models.PlaceOfSale;
import megacom.models.Products;
import megacom.service.FillData.FillAllData;
import megacom.service.FillData.impl.FillSumAndGum;

import java.util.*;
import java.util.stream.Collectors;

public class MatchMethods {

    public void matchMetods(){

        FillAllData fillAllData = new FillSumAndGum();

        System.out.print("anyMatch() : Цена товара дороже 2000000 == ");
        boolean anyMatchMethods = fillAllData.getDataFromSumAndGum().stream()
                .map(placeOfSale -> placeOfSale.getSellers().stream())
                .flatMap(sellersStream -> sellersStream.map(sellers -> sellers.getSellerProducts()))
                .anyMatch(products -> products.stream().anyMatch(products1 -> products1.getProductPrice()>2000000));
        System.out.println(anyMatchMethods);
        System.out.println("*************************************************");

        System.out.print("noneMatch() : Цена товара дешевлее 1 == ");
        boolean noneMatchMethods = fillAllData.getDataFromSumAndGum().stream()
                .map(placeOfSale -> placeOfSale.getSellers().stream())
                .flatMap(sellersStream -> sellersStream.map(sellers -> sellers.getSellerProducts()))
                .allMatch(products -> products.stream().noneMatch(products1 -> products1.getProductPrice()<1));
        System.out.println(noneMatchMethods);
        System.out.println("*************************************************");

        System.out.print("allMatch() : Цена товара дороже 100 == ");
        boolean allMatchMethods = fillAllData.getDataFromSumAndGum().stream()
                .map(placeOfSale -> placeOfSale.getSellers().stream())
                .flatMap(sellersStream -> sellersStream.map(sellers -> sellers.getSellerProducts()))
                .allMatch(products -> products.stream().allMatch(products1 -> products1.getProductPrice()>100));
        System.out.println(allMatchMethods);
        System.out.println("*************************************************");

        System.out.println("findFirst()");
        Optional<PlaceOfSale> optionalPlaceOfSales = fillAllData.getDataFromSumAndGum().stream()
                .findFirst();
        System.out.println(optionalPlaceOfSales);
        System.out.println("*************************************************");

        System.out.println("findAny()");
        PlaceOfSale optionalPlaceOfSalesFindAny = fillAllData.getDataFromSumAndGum().stream()
                .findAny().get();
        System.out.println(optionalPlaceOfSalesFindAny);
        System.out.println("*************************************************");


        System.out.println("max()");
        Optional<Products> productsList = fillAllData.getDataFromSumAndGum().stream()
                .map(placeOfSale -> placeOfSale.getSellers().stream())
                .flatMap(sellersStream -> sellersStream.map(sellers -> sellers.getSellerProducts()))
                .flatMap(products -> products.stream())
                .max(Comparator.comparingDouble(Products::getProductPrice));

        System.out.println(productsList);
        System.out.println("*************************************************");
;
    }
}
