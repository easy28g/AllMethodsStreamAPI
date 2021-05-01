package megacom;

import megacom.service.StreamAPImethods.StreamAPImethods;
import megacom.service.StreamAPImethods.impl.MapAPImethod;
import megacom.service.StreamAPImethods.impl.MatchMethods;
import megacom.service.StreamAPImethods.impl.ReduceOptionalAPImethod;
import megacom.service.StreamAPImethods.impl.SkipLimitDistinctPeekSorted;

public class Main {

    public static void main(String[] args) {

        System.out.println("Stream API: map(), flatMap(), filter()");
        StreamAPImethods mapAPImethod = new MapAPImethod();
        mapAPImethod.streamAPI();

        System.out.println("Stream API: skip(), limit(), ");
        StreamAPImethods skipLimitStreamAPImethods = new SkipLimitDistinctPeekSorted();
        skipLimitStreamAPImethods.streamAPI();

        StreamAPImethods matchMethods = new MatchMethods();
        matchMethods.streamAPI();

        StreamAPImethods reduceOptionalAPImethod = new ReduceOptionalAPImethod();
        reduceOptionalAPImethod.streamAPI();

    }
}
