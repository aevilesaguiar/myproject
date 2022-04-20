package com.aeviles.myproject.resource;

import com.aeviles.myproject.model.CategoryModel;
import com.aeviles.myproject.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")//mapeamento de url
public class CategoryResource {

    /**
     *  ResponseEntity representa toda a resposta HTTP: código de status,
     *  cabeçalhos e corpo . Como resultado, podemos usá-lo
     * para configurar totalmente a resposta HTTP.
     * Se quisermos usá-lo, temos que devolvê-lo do endpoint;
     * ResponseEntity é um tipo genérico. Consequentemente,
     * podemos usar qualquer tipo como o corpo da resposta:
     *
     */

    @Autowired
    private CategoryRepository categoryRepository;


    @GetMapping
    public ResponseEntity <List<CategoryModel>> FindAll(){
        List<CategoryModel> categoryModels =categoryRepository.findAll();
        return ResponseEntity.ok().body(categoryModels);

    }

    @GetMapping(value= "/{id}")
    public ResponseEntity <CategoryModel> findById(@PathVariable Long id){
        List<CategoryModel> categoryModels = new ArrayList<>();
        CategoryModel category = new CategoryModel(1L,"Eletronics");

        return ResponseEntity.ok().body(category);

    }


}
