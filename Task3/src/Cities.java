import java.util.ArrayList;
import java.util.Collections;

public class Cities {

    public ArrayList<City> cities = new ArrayList<>();

    public void add(City city) {

        cities.add(city);


    }

    public City getBiggestCity() {

        City max = null;
        for (City city : cities)
            if (max == null || city.getPopulation() > max.getPopulation())
                max = city;
        return max;

    }

    public int getTotalPopulation() {

        int totalPopulation = 0;

        for (City city : cities) {
            totalPopulation += city.getPopulation();
        }

        return totalPopulation;

    }

    public int getAveragePopulation() {

        return getTotalPopulation() / cities.size();

    }

}




