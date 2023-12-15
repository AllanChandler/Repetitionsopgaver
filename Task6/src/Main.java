import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        Item toothbrush = new Item("Toothbrush", 25, 1);
        Item chips = new Item("Chips", 15, 1);
        Item cola = new Item("Cola", 18, 1);


        shoppingCart.addItem(toothbrush);
        shoppingCart.addItem(chips);
        shoppingCart.addItem(cola);

        System.out.println(shoppingCart.getTotalPrice());

        shoppingCart.removeItem("Cola");
        shoppingCart.setDiscount(10);

        System.out.println(shoppingCart.getTotalPrice());


        for (Item item : shoppingCart.getItems()) {
            System.out.println(item.getName() +" : "+ item.getNumber());

        }
    }
}