import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Lion lion = new Lion("squirrel");
        Parrot parrot = new Parrot("beaver");

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(lion);
        animals.add(parrot);

        for (Animal animal : animals) {
            animal.makeSound();
        }

        for (Animal animal : animals) {
            String isMammal = animal.isMammal;
            System.out.println(isMammal);

        }

        for (Animal animal : animals) { // iterates over each Animal object in the animals arraylist
            if(animal instanceof Lion){ // checking if animal object is an instance of Lion class if true then it entes the if statement
                Lion LionInstance = (Lion) animal; // casts animal to Lion
                String isMammal = LionInstance.isMammal; // access the isMammal field from Lion class constructor
                System.out.println(isMammal); // prints it out
            }
        }


    }
}