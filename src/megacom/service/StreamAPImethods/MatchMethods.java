package megacom.service.StreamAPImethods;

import megacom.service.FillData.FillAllData;
import megacom.service.FillData.impl.FillSumAndGum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MatchMethods {

    public void matchMetods(){

        FillAllData fillAllData = new FillSumAndGum();

        System.out.print("anyMatch() : Цена товара дороже 2000000 == ");
        boolean allMatchMethods = fillAllData.getDataFromSumAndGum().stream()
                .map(placeOfSale -> placeOfSale.getSellers().stream())
                .flatMap(sellersStream -> sellersStream.map(sellers -> sellers.getSellerProducts()))
                .anyMatch(products -> products.stream().anyMatch(products1 -> products1.getProductPrice()>2000000));
        System.out.println(allMatchMethods);
    }

}
