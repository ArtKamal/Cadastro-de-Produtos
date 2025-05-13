package com.aula.crudProduto.Produtos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_cadastro_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long produtoId;
    private String estacao;
    private String produtoDesc;
    private String produtoSexo;
    private Double produtoValor;
    
    public Produto() {
    }

    public Produto(Long produtoId, String estacao, String produtoDesc, String produtoSexo, Double produtoValor) {
        this.produtoId = produtoId;
        this.estacao = estacao;
        this.produtoDesc = produtoDesc;
        this.produtoSexo = produtoSexo;
        this.produtoValor = produtoValor;
    }

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

    public String getProdutoDesc() {
        return produtoDesc;
    }

    public void setProdutoDesc(String produtoDesc) {
        this.produtoDesc = produtoDesc;
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
