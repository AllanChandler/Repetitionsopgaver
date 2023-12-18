import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    private final List<Item> itemList;
    private double discount;

    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        double discountAmount = 0.0;

        for (Item item : itemList) {
            totalPrice += item.getPrice();
        }
        if (discount > 0) {
            discountAmount = totalPrice * (discount / 100.0);

        }
        totalPrice -= discountAmount;
        return totalPrice;
    }


    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public List<Item> getItems(){
        return new ArrayList<>(itemList);
    }

}