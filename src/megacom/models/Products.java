package megacom.models;


import com.sun.imageio.plugins.common.I18N;
import megacom.enums.ProductCategory;

import java.util.Objects;

public class Products implements Comparable<Products>{

    private String productName;
    private double productPrice;
    private ProductCategory productCategory;

    public Products() {
    }

    public Products(String productName, double productPrice, ProductCategory productCategory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory string) {
        this.productCategory = productCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Double.compare(products.productPrice, productPrice) == 0 &&
                Objects.equals(productName, products.productName) &&
                productCategory == products.productCategory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice, productCategory);
    }

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productCategory=" + productCategory +
                '}';
    }


    @Override
    public int compareTo(Products o) {
        if(this.getProductPrice() == o.getProductPrice()){
            return 0;
        } else if(this.getProductPrice()>o.getProductPrice()){
            return -1;
        } else {
            return 1;
        }
    }


}
