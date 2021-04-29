package megacom;

import megacom.service.StreamAPImethods.MapAPImethod;
import megacom.service.StreamAPImethods.SkipLimitStreamAPImethods;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Stream API: map(), flatMap(), filter()");
//        MapAPImethod mapAPImethod = new MapAPImethod();
//        mapAPImethod.mapAPI();

        System.out.println("Stream API: skip(), limit(), ");
        SkipLimitStreamAPImethods skipLimitStreamAPImethods = new SkipLimitStreamAPImethods();
        skipLimitStreamAPImethods.skipLimitStreamAPImethods();
    }
}
