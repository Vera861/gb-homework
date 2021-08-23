package ru.gb.lesson3.repository;

import org.springframework.stereotype.Repository;
import ru.gb.lesson3.model.Product;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;


@Repository
public class ProductRepository {
    private Map<Long, Product> productList;

    public ProductRepository() {
        this.productList = new ConcurrentHashMap<>();
        productList.put(1l, Product.builder()
                .id(1l)
                .title("Asus EEE PC 1201n")
                .coast(1250)
                .build());
    }

    public List<Product> findAll() {
        return productList.values().stream()
                .collect(Collectors.toList());
    }

    public Optional<Product> findById(Long id) {
        return productList.values().stream()
                .filter(it -> Objects.equals(it.getId(), id))
                .findFirst();
    }

    public void save(Product product) {
        if (product.getId() == null) {
            product.setId(productList.size() + 1L);
        }
        productList.put(product.getId(), product);
    }
}
