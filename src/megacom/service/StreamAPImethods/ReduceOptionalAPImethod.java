package megacom.service.StreamAPImethods;

import megacom.models.Products;
import megacom.service.FillData.FillAllData;
import megacom.service.FillData.impl.FillSumAndGum;

import java.util.Optional;

public class ReduceOptionalAPImethod {

    public void reduceOptional() {

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

    }

}



