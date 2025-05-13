package com.aula.crudProduto.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cadastro_produto")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int produtoId;
    private String produtoDesc;
    private String produtoEstacao;
    private String produtoSexo;
    private Double produtoValor;

    public ProdutoModel() {
    }

    public ProdutoModel(int produtoId, String produtoDesc, String produtoEstacao, String produtoSexo,
            Double produtoValor) {
        this.produtoDesc = produtoDesc;
        this.produtoEstacao = produtoEstacao;
        this.produtoSexo = produtoSexo;
        this.produtoValor = produtoValor;
    }

    public String getProdutoDesc() {
        return produtoDesc;
    }

    public void setProdutoDesc(String produtoDesc) {
        this.produtoDesc = produtoDesc;
    }

    public String getProdutoEstacao() {
        return produtoEstacao;
    }

    public void setProdutoEstacao(String produtoEstacao) {
        this.produtoEstacao = produtoEstacao;
    }

    public String getProdutoSexo() {
        return produtoSexo;
    }

    public void setProdutoSexo(String produtoSexo) {
        this.produtoSexo = produtoSexo;
    }

    public Double getProdutoValor() {
        return produtoValor;
    }

    public void setProdutoValor(Double produtoValor) {
        this.produtoValor = produtoValor;
    }
    
    
}
