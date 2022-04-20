package com.aeviles.myproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CategoryModel implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "category")// tenho que colocar o contrario da aoutra classe um para muitos e o nome do atributo
    private List<ProductModel> products = new ArrayList<>();


    public CategoryModel(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

}
