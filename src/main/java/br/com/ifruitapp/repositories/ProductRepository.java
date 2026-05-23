package br.com.ifruitapp.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.ifruitapp.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
