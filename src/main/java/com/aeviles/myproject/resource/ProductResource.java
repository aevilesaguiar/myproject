package com.aeviles.myproject.resource;

import com.aeviles.myproject.model.CategoryModel;
import com.aeviles.myproject.model.ProductModel;
import com.aeviles.myproject.repository.CategoryRepository;
import com.aeviles.myproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")//mapeamento de url
public class ProductResource {

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
    private ProductRepository productRepository;


    @GetMapping
    public ResponseEntity <List<ProductModel>> FindAll(){
       List<ProductModel> list = productRepository.findAll();
       return ResponseEntity.ok().body(list);


    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductModel> findById(@PathVariable Long id) {
        ProductModel obj = productRepository.findById(id).get();
        return ResponseEntity.ok().body(obj);
    }


}
