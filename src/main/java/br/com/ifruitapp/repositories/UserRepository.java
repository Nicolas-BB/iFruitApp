package br.com.ifruitapp.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.ifruitapp.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
