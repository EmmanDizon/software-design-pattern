import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ShoppingItem> items = new ArrayList<>();

        items.add(new Table("Desk", 20));
        items.add(new Chair("Chair one", 30));
        items.add(new Chair("Chair two", 50));

        double sum = 0;

        ShoppingCartVisitor scv = new ShoppingCart();

        for(ShoppingItem si: items)
            sum = sum + si.accept(scv);

        System.out.println(sum);

    }
}