package lesson10;

import java.util.HashMap;
import java.util.Map;

public class Route {
    public static void main(String[] args) {
       //«Berlin» -> «London»
        //«Tokyo» -> «Seoul»
        //«Mumbai» -> «Berlin»
        //«Seoul» -> «Mumbai»
        Citys berlin = new Citys("Berlin");
        Citys london = new Citys("London");
        Citys tokyo = new Citys("Tokyo");
        Citys seoul = new Citys("Seoul");
        Citys mumbai = new Citys("Mumbai");

        Map<String, String> trips = new HashMap<>();

        trips.put("Berlin", "London");
        trips.put("Tokyo", "Seoul");
        trips.put("Mumbai", "Berlin");
        trips.put("Seoul", "Mumbai");




    }
}
