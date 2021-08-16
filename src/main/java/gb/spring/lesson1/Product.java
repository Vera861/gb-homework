package gb.spring.lesson1;

import java.math.BigDecimal;

public class Product {
    private int id;
    private String title;
    private BigDecimal cost;

    public Product(int id, String title, BigDecimal coast) {
        this.id = id;
        this.title = title;
        this.cost = coast;
    }
}
