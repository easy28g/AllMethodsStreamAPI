package megacom.models;

import java.util.ArrayList;

public class Sellers {

    private String sellerName;
    private String sellerLogin;
    private ArrayList<Products> sellerProducts;

    public Sellers() {
    }

    public Sellers(String sellerName, String sellerLogin,  ArrayList<Products> sellerProducts) {
        this.sellerName = sellerName;
        this.sellerLogin = sellerLogin;
        this.sellerProducts = sellerProducts;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerLogin() {
        return sellerLogin;
    }

    public void setSellerLogin(String sellerLogin) {
        this.sellerLogin = sellerLogin;
    }


    public ArrayList<Products> getSellerProducts() {
        return sellerProducts;
    }

    public void setSellerProducts(ArrayList<Products> sellerProducts) {
        this.sellerProducts = sellerProducts;
    }

    @Override
    public String toString() {
        return "Sellers{" +
                "sellerName='" + sellerName + '\'' +
                ", sellerLogin='" + sellerLogin + '\'' +
                ", sellerProducts=" + sellerProducts +
                '}';
    }
}
