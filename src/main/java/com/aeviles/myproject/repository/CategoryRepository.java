package com.aeviles.myproject.repository;

import com.aeviles.myproject.model.CategoryModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* Repository tem a responsabilidade de manipular os dados
* anota classes na camada de persistência, que atuará c
* omo um repositório de banco de dados;
* */
@Repository
@Component
public class CategoryRepository {

    //repositorio de categorias guaradndo na memoria
    private Map<Long, CategoryModel> map= new HashMap<>();

    public void save (CategoryModel obj){

        map.put(obj.getId(), obj);
    }



    public CategoryModel findById(Long id){
        return map.get(id);

    }


    public List<CategoryModel> findAll(){
        return new ArrayList<CategoryModel>(map.values());
    }


}
