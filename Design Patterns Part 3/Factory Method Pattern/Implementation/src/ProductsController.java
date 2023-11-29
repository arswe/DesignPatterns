import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProductsController extends SharpController {
    public void listProducts() {
        Map<String, Object> context = new HashMap<>();
        render("products.html", context);
    }
}
