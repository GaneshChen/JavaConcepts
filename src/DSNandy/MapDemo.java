package DSNandy;

import java.util.HashMap;

public class MapDemo {

    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington DC");

        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Germany"));
        System.out.println(capitalCities.remove("Germany"));
        System.out.println(capitalCities);

        for (String i : capitalCities.keySet())
            System.out.println(i);

        System.out.println("***********");

        for(String i : capitalCities.values())
            System.out.println(i);
    }
}
