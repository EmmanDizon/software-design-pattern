import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpController {
    public void listProducts() {
        // get products from db

        Map<String, Object> context = new HashMap<>();
        // context.put(products)

        render("products", context);
    }
}
