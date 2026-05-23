package br.com.ifruitapp.services;

import org.springframework.stereotype.Service;

import br.com.ifruitapp.entities.Product;
import br.com.ifruitapp.repositories.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product addProduct(Product newProduct) {
        return productRepository.save(newProduct);
    }
}
