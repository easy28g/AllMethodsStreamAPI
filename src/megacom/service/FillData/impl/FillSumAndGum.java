package megacom.service.FillData.impl;

import megacom.enums.Market;
import megacom.enums.ProductCategory;
import megacom.models.PlaceOfSale;
import megacom.models.Products;
import megacom.models.Sellers;
import megacom.service.FillData.FillAllData;

import java.util.ArrayList;

public class FillSumAndGum implements FillAllData {

    private ArrayList<PlaceOfSale> addDataForSumAndGum(){

        // Продукты
        ArrayList<Products> productsArrayList = new ArrayList<>();
        productsArrayList.add(new Products("Asus", 70000, ProductCategory.TECHNIC));
        productsArrayList.add(new Products("HP", 90000, ProductCategory.TECHNIC));
        productsArrayList.add(new Products("MackBook", 100000, ProductCategory.TECHNIC));
        productsArrayList.add(new Products("Acer", 600000, ProductCategory.TECHNIC));

        ArrayList<Products> productsArrayList1 = new ArrayList<>();
        productsArrayList1.add(new Products("Asus", 80000, ProductCategory.TECHNIC));
        productsArrayList1.add(new Products("HP", 80000, ProductCategory.TECHNIC));
        productsArrayList1.add(new Products("MackBook", 120000, ProductCategory.TECHNIC));
        productsArrayList1.add(new Products("Acer", 700000, ProductCategory.TECHNIC));

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


        //Продавцы
        ArrayList<Sellers> sellersArrayListSum = new ArrayList<>();
        sellersArrayListSum.add(new Sellers("Айдар", "Dota2Forever", productsArrayList));
        sellersArrayListSum.add(new Sellers("Жылдызбек", "JekaIK", productsArrayList1));
        sellersArrayListSum.add(new Sellers("Бекмырза", "4people", productsArrayList2));
        sellersArrayListSum.add(new Sellers("Айка", "GameLike", productsArrayListToys));
        sellersArrayListSum.add(new Sellers("Мерим", "lololol", productsArrayListToys2));

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ArrayList<Products> productsArrayList2Gum = new ArrayList<>();
        productsArrayList2Gum.add(new Products("Asus", 88000, ProductCategory.TECHNIC));
        productsArrayList2Gum.add(new Products("HP", 99000, ProductCategory.TECHNIC));
        productsArrayList2Gum.add(new Products("MackBook", 110000, ProductCategory.TECHNIC));

        ArrayList<Products> productsArrayListToysGum = new ArrayList<>();
        productsArrayListToysGum.add(new Products("Мяч", 500, ProductCategory.TOYS));
        productsArrayListToysGum.add(new Products("Кукла", 1000, ProductCategory.TOYS));
        productsArrayListToysGum.add(new Products("Машинка", 2500, ProductCategory.TOYS));
        productsArrayListToysGum.add(new Products("Кубик Рубик", 200, ProductCategory.TOYS));

        ArrayList<Products> productsArrayListToys2Gum = new ArrayList<>();
        productsArrayListToys2Gum.add(new Products("Мяч", 700, ProductCategory.TOYS));
        productsArrayListToys2Gum.add(new Products("Кукла", 1500, ProductCategory.TOYS));
        productsArrayListToys2Gum.add(new Products("Пистолет", 2000, ProductCategory.TOYS));
        productsArrayListToys2Gum.add(new Products("Кубик Рубик", 250, ProductCategory.TOYS));

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
        sellersArrayListGum.add(new Sellers("Бекмырза", "4people", productsArrayList2Gum));
        sellersArrayListGum.add(new Sellers("Айка", "GameLike", productsArrayListToysGum));
        sellersArrayListGum.add(new Sellers("Мерим", "lololol", productsArrayListToys2Gum));
        sellersArrayListGum.add(new Sellers("Орозбек", "crmcrm", productsArrayListClothes));
        sellersArrayListGum.add(new Sellers("Жибек", "clothes", productsArrayListClothes1));

        ArrayList<PlaceOfSale> placeOfSaleArrayListSumAndGum = new ArrayList<>();
        placeOfSaleArrayListSumAndGum.add(new PlaceOfSale(Market.SUM, sellersArrayListSum));
        placeOfSaleArrayListSumAndGum.add(new PlaceOfSale(Market.GUM, sellersArrayListGum));


        return placeOfSaleArrayListSumAndGum;
    }

    @Override
    public ArrayList<PlaceOfSale> getDataFromSumAndGum() {
        return addDataForSumAndGum();
    }
}
