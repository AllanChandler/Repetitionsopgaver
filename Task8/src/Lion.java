public class Lion extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Rooooar");
    }
    Lion(String isMammal) {
        super(isMammal);
    }
}
