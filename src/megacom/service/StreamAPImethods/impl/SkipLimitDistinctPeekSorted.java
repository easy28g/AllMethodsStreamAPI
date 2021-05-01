package megacom.service.StreamAPImethods.impl;

import megacom.models.Products;
import megacom.service.FillData.FillAllData;
import megacom.service.FillData.impl.FillSumAndGum;
import megacom.service.StreamAPImethods.StreamAPImethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SkipLimitDistinctPeekSorted implements StreamAPImethods {

    private void skipLimitStreamAPImethods(){

        FillAllData fillAllData = new FillSumAndGum();

        // Получение списка списков продукта
        List<ArrayList<Products>> productsList = fillAllData.getDataFromSumAndGum().stream()
                .map(placeOfSale -> placeOfSale.getSellers().stream())
                .flatMap(sellersStream -> sellersStream.map(sellers -> sellers.getSellerProducts()))
                .collect(Collectors.toList());

        List<Double> productsPriceList = fillAllData.getDataFromSumAndGum().stream()
                .map(placeOfSale -> placeOfSale.getSellers().stream())
                .flatMap(sellersStream -> sellersStream.map(sellers -> sellers.getSellerProducts()))
                .flatMap(products -> products.stream().map(products1 -> products1.getProductPrice()))
                .collect(Collectors.toList());
        System.out.println("***************************************************************************************");
        System.out.println("Все продукты");
        //productsList.forEach(products -> products.forEach(products1 -> System.out.println(products1)));
        productsList.forEach(products -> System.out.println(products));
        System.out.println("***************************************************************************************");




        List<ArrayList<Products>> productsList1 = productsList.stream()
                .skip(2)
                .limit(2)
                .collect(Collectors.toList());
        //productsList1.forEach(products -> products.forEach(products1 -> System.out.println(products1)));
        System.out.println("skip(2) and limit(2)");
        productsList1.forEach(products -> System.out.println(products));
        System.out.println("***************************************************************************************");



        float unDis = productsList.stream()
                .count();
        System.out.println("Без метода distinct == "+unDis);

        float dis = productsList.stream()
                .distinct()
                .count();
        System.out.println("С методом distinct == "+dis);
        System.out.println("***************************************************************************************");

        productsList.stream()
                .distinct()
                .limit(1)
                .peek(products -> products.forEach(products1 -> System.out.println("Peek: "+products1.getProductName())))
                .forEach(products -> products.forEach(products1 -> System.out.println("Filter: "+products1.getProductName())));


        System.out.println("***************************************************************************************");
        System.out.println("Сортировка товаров по ценне");

        Products productSort = new Products();
        List<Double> sortProduct = productsList.stream()
                .map(products -> products.stream())
                .flatMap(productsStream -> productsStream.map(products -> products.getProductPrice()))
                .sorted()
                //.forEach(products -> products.forEach(System.out::println));
                .collect(Collectors.toList());
        //sortProduct.forEach(products -> products.forEach(System.out::println));

        sortProduct.forEach(System.out::println);
    }

    @Override
    public void streamAPI() {
        skipLimitStreamAPImethods();
    }
}
















