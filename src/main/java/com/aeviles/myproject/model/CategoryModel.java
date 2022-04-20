package com.aeviles.myproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryModel implements Serializable {
    /**
     * Serializable
     * @arguments
     * Basicamente ela serve para habilitar que um objeto de uma determinada
     * classe possa ter seu estado persistido pela api padrão do java
     */

    //id padrão do Serializable
    private static final long serialVersionUID=1L;
    private Long id;
    private String name;

}
