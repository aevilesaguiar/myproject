package com.aeviles.myproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//ESSE ID É AUTOINCREMENTAVEL NO BANCO DE DADOS
    private Long id;
    private String name;
    private Double price;

    @ManyToOne
    @JoinColumn(name =  "category_id")//eu coloco entre aspas o nome da chave estrangeira no banco de dados
    private CategoryModel category;//estou dizendo que atributo category é uma chave estrangeira

}
