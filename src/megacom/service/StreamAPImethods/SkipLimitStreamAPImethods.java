package megacom.service.StreamAPImethods;

import megacom.models.Products;
import megacom.service.FillData.FillAllData;
import megacom.service.FillData.impl.FillSumAndGum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SkipLimitStreamAPImethods {

    public void skipLimitStreamAPImethods(){

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
        //productsList.forEach(products -> products.forEach(products1 -> System.out.println(products1)));
        productsList.forEach(products -> System.out.println(products));
        System.out.println("***************************************************************************************");

        List<ArrayList<Products>> productsList1 = productsList.stream()
                .skip(2)
                .limit(2)
                .collect(Collectors.toList());

        //productsList1.forEach(products -> products.forEach(products1 -> System.out.println(products1)));
        productsList1.forEach(products -> System.out.println(products));
    }
}
