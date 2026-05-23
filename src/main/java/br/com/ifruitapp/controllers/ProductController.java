package br.com.ifruitapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifruitapp.entities.Product;
import br.com.ifruitapp.services.ProductService;

@RestController
public class ProductController {
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @GetMapping("/product/list-products")
    public Iterable<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/product/add-product")
    public Product addProduct(@RequestBody Product newProduct) {
        return productService.addProduct(newProduct);
    }
}
