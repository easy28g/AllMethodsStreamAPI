package megacom;

import megacom.service.StreamAPImethods.SkipLimitDistinctPeekSorted;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Stream API: map(), flatMap(), filter()");
//        MapAPImethod mapAPImethod = new MapAPImethod();
//        mapAPImethod.mapAPI();

        System.out.println("Stream API: skip(), limit(), ");
        SkipLimitDistinctPeekSorted skipLimitStreamAPImethods = new SkipLimitDistinctPeekSorted();
        skipLimitStreamAPImethods.skipLimitStreamAPImethods();
    }
}
