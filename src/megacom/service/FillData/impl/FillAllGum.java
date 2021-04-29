package megacom.service.FillData.impl;

import megacom.enums.Market;
import megacom.enums.ProductCategory;
import megacom.models.PlaceOfSale;
import megacom.models.Products;
import megacom.models.Sellers;
import megacom.service.FillData.FillAllData;

import java.util.ArrayList;

public class FillAllGum implements FillAllData {

    private ArrayList<PlaceOfSale> addDataForGum(){

        ArrayList<Products> productsArrayList2 = new ArrayList<>();
        productsArrayList2.add(new Products("Asus", 88000, ProductCategory.TECHNIC));
        productsArrayList2.add(new Products("HP", 99000, ProductCategory.TECHNIC));
        productsArrayList2.add(new Products("MackBook", 110000, ProductCategory.TECHNIC));

        ArrayList<Products> productsArrayListToys = new ArrayList<>();
        productsArrayListToys.add(new Products("Мяч", 500, ProductCategory.TOYS));
        productsArrayListToys.add(new Products("Кукла", 1000, ProductCategory.TOYS));
        productsArrayListToys.add(new Products("Машинка", 2500, ProductCategory.TOYS));
        productsArrayListToys.add(new Products("Кубик Рубик", 200, ProductCategory.TOYS));

        ArrayList<Products> productsArrayListToys2 = new ArrayList<>();
        productsArrayListToys.add(new Products("Мяч", 700, ProductCategory.TOYS));
        productsArrayListToys2.add(new Products("Кукла", 1500, ProductCategory.TOYS));
        productsArrayListToys2.add(new Products("Пистолет", 2000, ProductCategory.TOYS));
        productsArrayListToys2.add(new Products("Кубик Рубик", 250, ProductCategory.TOYS));

        ArrayList<Products> productsArrayListClothes = new ArrayList<>();
        productsArrayListClothes.add(new Products("Штаны", 1000, ProductCategory.CLOTH));
        productsArrayListClothes.add(new Products("Туфли", 3500, ProductCategory.CLOTH));
        productsArrayListClothes.add(new Products("Куртка", 6000, ProductCategory.CLOTH));
        productsArrayListClothes.add(new Products("Футболка", 450, ProductCategory.CLOTH));


        ArrayList<Products> productsArrayListClothes1 = new ArrayList<>();
        productsArrayListClothes1.add(new Products("Штаны", 1200, ProductCategory.CLOTH));
        productsArrayListClothes1.add(new Products("Туфли", 4500, ProductCategory.CLOTH));
        productsArrayListClothes1.add(new Products("Куртка", 5000, ProductCategory.CLOTH));
        productsArrayListClothes1.add(new Products("Футболка", 550, ProductCategory.CLOTH));

        //Продавцы
        ArrayList<Sellers> sellersArrayListGum = new ArrayList<>();
        sellersArrayListGum.add(new Sellers("Бекмырза", "4people", productsArrayList2));
        sellersArrayListGum.add(new Sellers("Айка", "GameLike", productsArrayListToys));
        sellersArrayListGum.add(new Sellers("Мерим", "lololol", productsArrayListToys2));
        sellersArrayListGum.add(new Sellers("Орозбек", "crmcrm", productsArrayListClothes));
        sellersArrayListGum.add(new Sellers("Жибек", "clothes", productsArrayListClothes1));

        ArrayList<PlaceOfSale> placeOfSaleArrayListGum1 = new ArrayList<>();
        placeOfSaleArrayListGum1.add(new PlaceOfSale(Market.GUM, sellersArrayListGum));
        return placeOfSaleArrayListGum1;
    }

    @Override
    public ArrayList<PlaceOfSale> getDataFromSumAndGum() {
        return addDataForGum();
    }
}
