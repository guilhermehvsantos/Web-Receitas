package Senac.receitas.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "receita")
@AllArgsConstructor
@NoArgsConstructor
@Data
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