package services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.softlond.store.entities.Product;

public interface IProductService {
    public ResponseEntity<List<Product>> finAll();
}
