package Senac.Receitas.Controller;

import Senac.Receitas.Model.Receita;
import Senac.Receitas.Repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReceitaController {

    @Autowired
    private ReceitaRepository receitaRepository;

    @GetMapping("/")
    public String index() {
        return "index";  
    }

    @GetMapping("/form")
    public String form() {
        return "form"; 
    }


    @PostMapping("/form")
    public String cadastrarReceita(@RequestParam String nome, @RequestParam String descricao) {
        Receita receita = new Receita();
        receita.setNome(nome);
        receita.setDescricao(descricao);
        receitaRepository.save(receita);
        return "redirect:/list";  
    }

    @GetMapping("/list")
    public String listaReceitas(Model model) {
        model.addAttribute("receitas", receitaRepository.findAll());
        return "list";  
    }
}
