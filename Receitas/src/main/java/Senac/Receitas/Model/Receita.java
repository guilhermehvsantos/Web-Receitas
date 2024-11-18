package com.seuapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = Receita.TABLE_NAME)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 1, max = 75)
    @Column(name = "nome", nullable = false, length = 75)
    @NotBlank
    private String nome;

    @Size(min = 10, max = 150)
    @Column(name = "modoPreparo", nullable = false, length = 150)
    @NotBlank
    private String modoPreparo;

    @Size(min = 1, max = 75)
    @Column(name = "ingredientes", nullable = false, length = 75)
    @NotBlank
    private String ingredientes;

}
