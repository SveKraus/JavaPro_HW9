package lesson10;

import java.util.*;

public class Route {
    public static void main(String[] args) {
        //«Berlin» -> «London»
        //«Tokyo» -> «Seoul»
        //«Mumbai» -> «Berlin»
        //«Seoul» -> «Mumbai»

        Map<String, String> trips = new HashMap<>();

        trips.put("Berlin", "London");
        trips.put("Tokyo", "Seoul");
        trips.put("Mumbai", "Berlin");
        trips.put("Seoul", "Mumbai");


        List<String> way = new ArrayList<>();


        String wayCitiesBeginn = wayCitiesBeginn(trips);
        String wayCitiesEnd = null;
        for (int i = 0; i < trips.size(); i++) {
            wayCitiesEnd = trips.get(wayCitiesBeginn);
            way.add(wayCitiesBeginn);
            way.add(wayCitiesEnd);
            wayCitiesBeginn = wayCitiesEnd;
        }
        System.out.println(way);


    }

    private static String wayCitiesBeginn(Map<String, String> trips) {
        Set<String> keys =trips.keySet();
        String way = null;
        for (String key: keys){
            if (trips.containsKey(key)){
                return key;

            }
        }
        return null;
    }

}
