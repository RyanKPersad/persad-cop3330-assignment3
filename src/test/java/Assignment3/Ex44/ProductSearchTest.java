package Assignment3.Ex44;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductSearchTest {

    @Test
    void findProduct() {
        ProductSearch ps = new ProductSearch();
        ps.input = "doodad";
        String expected = " Name: Doodad\n Price: 5.00\n Quantity: 10";
        String Actual = ps.FindProduct();
        assertEquals(expected, Actual);
    }
    @Test
    void findProduct2() {
        ProductSearch ps = new ProductSearch();
        ps.input = "widget";
        String expected = " Name: Widget\n Price: 25.00\n Quantity: 5";
        String Actual = ps.FindProduct();
        assertEquals(expected, Actual);
    }
    @Test
    void findProduct3() {
        ProductSearch ps = new ProductSearch();
        ps.input = "thing";
        String expected = " Name: Thing\n Price: 15.00\n Quantity: 5";
        String Actual = ps.FindProduct();
        assertEquals(expected, Actual);
    }
}