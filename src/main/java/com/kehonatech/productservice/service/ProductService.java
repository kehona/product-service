package com.kehonatech.productservice.service;

import com.kehonatech.productservice.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {

    public List<Product> getAllProducts() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("LAP001", "XYZ Pro Laptop", 999.99, 50));
        productList.add(new Product("PHN002", "ABC Galaxy Phone", 699.99, 100));
        productList.add(new Product("FIT003", "SlimFit Tracker", 49.99, 200));
        productList.add(new Product("KIT004", "BrewMaster 2000", 129.99, 30));
        productList.add(new Product("EAR005", "SonicBlast Buds", 79.99, 150));
        productList.add(new Product("CAM006", "SnapShot Pro", 499.99, 40));
        productList.add(new Product("SPK007", "Echo Beats", 89.99, 80));
        productList.add(new Product("CON008", "GameMaster X", 299.99, 25));
        productList.add(new Product("FUR009", "ErgoComfort Chair", 149.99, 60));
        productList.add(new Product("CHG010", "PowerBoost 5000", 29.99, 120));
        productList.add(new Product("TEST", "YouTube Demo", 29.99, 120));

        return productList;
    }
}
