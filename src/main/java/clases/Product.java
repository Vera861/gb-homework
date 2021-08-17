package clases;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Product {
    int id;
    String title;
    int cost;

    @Override
    public String toString() {
        return "id=" + id +": " + title +" цена= " + cost +"p.";
    }
}
