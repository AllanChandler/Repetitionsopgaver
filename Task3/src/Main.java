public class Main {
    public static void main(String[] args) {


        Cities cities = new Cities();
        cities.getBiggestCity();

        cities.add(new City("Kongens Lyngby", 57500));
        cities.add(new City("Ribe", 8257));
        cities.add(new City("Storvorde", 3425));
        cities.add(new City("Tarm", 4010));
        cities.add(new City("Horreby", 305));

        System.out.println(cities.getBiggestCity().getName());


    }
}