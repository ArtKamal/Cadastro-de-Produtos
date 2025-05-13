package com.aula.crudProduto.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.aula.crudProduto.Produtos.Produto;
import com.aula.crudProduto.repository.ProdutoRepository;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> getAll() {return produtoRepository.findAll();}

    public void save(Produto produto) {produtoRepository.save(produto);}

    public Produto findById(Long id){return produtoRepository.findById(id).orElse(null);}

    public void delete(Long id){produtoRepository.deleteById(id);}
}
