package megacom.service.StreamAPImethods;

import megacom.models.Products;
import megacom.models.Sellers;
import megacom.service.FillData.FillAllData;
import megacom.service.FillData.impl.FillSumAndGum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAPImethod {

    public void mapAPI(){
        FillAllData fillAllData = new FillSumAndGum();
        fillAllData.getDataFromSumAndGum();
/*
        System.out.println(fillAllData.getDataFromSumAndGum().get(0).getSellers().get(0).getSellerProducts().get(0).getProductName());
        System.out.println(fillAllData.getDataFromSumAndGum().get(0).getSellers().get(0).getSellerProducts().get(0).getProductPrice());
*/


      /*  List<Double> filterCost = fillAllData.getDataFromSumAndGum().stream()
                .mapToDouble(placeOfSale -> placeOfSale.getSellers()
                        .forEach(sellers -> sellers.getSellerProducts()
                                .forEach(products -> products.getProductPrice()+10000)))
                .collect(Collectors.toList()); */


        // Получение список потока продавцов
        List<Stream<Sellers>> sellersList = fillAllData.getDataFromSumAndGum().stream()
                .map(placeOfSale -> placeOfSale.getSellers().stream())
                .collect(Collectors.toList());

        // Получение списка списков продукта
        List<ArrayList<Products>> productsList = fillAllData.getDataFromSumAndGum().stream()
                .map(placeOfSale -> placeOfSale.getSellers().stream())
                .flatMap(sellersStream -> sellersStream.map(sellers -> sellers.getSellerProducts()))
                .collect(Collectors.toList());

        // Получение только списка цен продуктов
        List<Double> productsPriceList = fillAllData.getDataFromSumAndGum().stream()
                .map(placeOfSale -> placeOfSale.getSellers().stream())
                .flatMap(sellersStream -> sellersStream.map(sellers -> sellers.getSellerProducts()))
                .flatMap(products -> products.stream().map(products1 -> products1.getProductPrice()))
                .collect(Collectors.toList());
        System.out.println("*********************************************");
        productsList.forEach(products -> System.out.println(products));
        System.out.println("*********************************************");

        // Получаем список продуктов дороже 110000
        List<Products> productsPriceListMore110k2 = fillAllData.getDataFromSumAndGum().stream()
                .map(placeOfSale -> placeOfSale.getSellers().stream())
                .flatMap(sellersStream -> sellersStream
                        .map(sellers -> sellers.getSellerProducts()))
                .flatMap(products -> products.stream()
                        .filter(products1 -> products1.getProductPrice()>110000))
                .collect(Collectors.toList());
//        System.out.println("*********************************************");
//        productsPriceListMore110k2.forEach(products -> System.out.println(products));


        // Получаем только список продуктов дороже 100000
        List<Double> productsPriceListMore100k = fillAllData.getDataFromSumAndGum().stream()
                .map(placeOfSale -> placeOfSale.getSellers().stream())
                .flatMap(sellersStream -> sellersStream
                        .map(sellers -> sellers.getSellerProducts()))
                .flatMap(products -> products.stream()
                        .filter(products1 -> products1.getProductPrice()>100000))
                        .map(products -> products.getProductPrice())
                .collect(Collectors.toList());


        System.out.println();
        System.out.println("Получение списка продуктов");
        System.out.println(productsList);
        System.out.println();

        System.out.println("Получение только списка цен продуктов");
        System.out.println(productsPriceList);
        System.out.println();

        System.out.println("Получение списка продуктов дороже 110к");
        System.out.println(productsPriceListMore110k2);
        System.out.println("");

        System.out.println("Получение только скиска цен продуктов дороже 100к");
        System.out.println(productsPriceListMore100k);

    }
}
