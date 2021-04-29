package megacom.models;

import megacom.enums.Market;

import java.util.ArrayList;
import java.util.Objects;

public class PlaceOfSale {

    private Market placeOfSale;
    private ArrayList<Sellers> sellers;

    public PlaceOfSale() {
    }

    public PlaceOfSale(Market  placeOfSale, ArrayList<Sellers> sellers) {
        this.placeOfSale = placeOfSale;
        this.sellers = sellers;
    }

    public Market getPlaceOfSale() {
        return placeOfSale;
    }

    public void setPlaceOfSale(Market placeOfSale) {
        this.placeOfSale = placeOfSale;
    }

    public ArrayList<Sellers> getSellers() {
        return sellers;
    }

    public void setSellers(ArrayList<Sellers> sellers) {
        this.sellers = sellers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaceOfSale that = (PlaceOfSale) o;
        return placeOfSale == that.placeOfSale &&
                Objects.equals(sellers, that.sellers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placeOfSale, sellers);
    }

    @Override
    public String toString() {
        return "PlaceOfSale{" +
                "placeOfSale=" + placeOfSale +
                ", sellers=" + sellers +
                '}';
    }
}
