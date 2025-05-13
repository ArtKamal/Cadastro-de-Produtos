package com.aula.crudProduto.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aula.crudProduto.Produtos.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long >{
}
