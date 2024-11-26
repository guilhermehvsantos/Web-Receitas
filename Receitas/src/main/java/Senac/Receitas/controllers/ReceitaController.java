package Senac.receitas.controllers;

import Senac.receitas.models.Receita;
import Senac.receitas.repository.ReceitaRepository;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/receitas")
public class ReceitaController {

    @Autowired
    private ReceitaRepository receitaRepository;

    @PostMapping("/form")
    public ResponseEntity<Receita> cadastrarReceita(@RequestBody @Valid Receita receita) {
        Receita novaReceita = receitaRepository.save(receita);
        return ResponseEntity.ok(novaReceita);  
    }


    @GetMapping("/list")
    public List<Receita> listaReceitas() {
        return receitaRepository.findAll();  
    }
}
