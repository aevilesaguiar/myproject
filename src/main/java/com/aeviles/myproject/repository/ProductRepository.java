package com.aeviles.myproject.repository;


import com.aeviles.myproject.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



/*
* Repository tem a responsabilidade de manipular os dados
* anota classes na camada de persistência, que atuará c
* omo um repositório de banco de dados;
* */
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {

    //o Jpa Já possui findAll, findById, save, delete....

}
