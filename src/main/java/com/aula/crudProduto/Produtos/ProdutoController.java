package com.aula.crudProduto.Produtos;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import com.aula.crudProduto.service.ProdutoService;

@RestController
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
    
    @GetMapping("/")
    public String listAll(Model model){model.addAttribute("produtos", produtoService.getAll());
    return "list.html";}

    @GetMapping("/new")
    public String newProduto(Model model) {model.addAttribute("produto", new Produto());
    return "";}

    @PostMapping("/save")
    public String save(@ModelAttribute Produto produto){produtoService.save(produto);
    return "redirect:/";}

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model){model.addAttribute("produto", produtoService.findById(id));
    return "form";}

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){produtoService.delete(id);
    return "redirect:/";}
}
