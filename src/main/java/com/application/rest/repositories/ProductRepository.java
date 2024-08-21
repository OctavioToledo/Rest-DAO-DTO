package com.application.rest.repositories;

import com.application.rest.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    // ESTE ES UN QUERYMETHOD, VA LA CONSULTA A TRAVES DEL NOMBRE, UTILIZA JPA
    List<Product> findProductByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);

    //EL METODO DE ARRIBA EQUVALE A ESTE METODO

  /*

    @Query("SELECT p FROM Product p WHERE p.price BETWEEN ?1 AND ?2")
    List<Product> findProductByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);

*/
}
