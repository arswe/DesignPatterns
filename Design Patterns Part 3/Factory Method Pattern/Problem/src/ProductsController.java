import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProductsController extends Controller {
    public void listProducts() {
        Map<String, Object> context = new HashMap<>();
        render("products.html", context, new MatchaViewEngine());
    }
}
