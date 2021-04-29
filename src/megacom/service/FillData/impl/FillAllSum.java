package megacom.service.FillData.impl;

import megacom.enums.Market;
import megacom.enums.ProductCategory;
import megacom.models.PlaceOfSale;
import megacom.models.Products;
import megacom.models.Sellers;
import megacom.service.FillData.FillAllData;

import java.util.ArrayList;
import java.util.Scanner;

public class FillAllSum implements FillAllData {

    private ArrayList<PlaceOfSale> addDataForSum(){
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
        ArrayList<Sellers> sellersArrayList = new ArrayList<>();
        sellersArrayList.add(new Sellers("Айдар", "Dota2Forever", productsArrayList));
        sellersArrayList.add(new Sellers("Жылдызбек", "JekaIK", productsArrayList1));
        sellersArrayList.add(new Sellers("Бекмырза", "4people", productsArrayList2));
        sellersArrayList.add(new Sellers("Айка", "GameLike", productsArrayListToys));
        sellersArrayList.add(new Sellers("Мерим", "lololol", productsArrayListToys2));



        ArrayList<PlaceOfSale> placeOfSaleArrayListSum1 = new ArrayList<>();
        placeOfSaleArrayListSum1.add(new PlaceOfSale(Market.SUM, sellersArrayList));
        return  placeOfSaleArrayListSum1;

    }

    @Override
    public ArrayList<PlaceOfSale> getDataFromSumAndGum() {
        return addDataForSum();
    }
}
