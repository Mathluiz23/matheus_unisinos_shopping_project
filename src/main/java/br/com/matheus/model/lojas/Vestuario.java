package br.com.matheus.model.lojas;

import br.com.matheus.model.Data;
import br.com.matheus.model.Endereco;

public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                   Endereco endereco, Data dataFundacao, int tamanhoEstoque,
                   boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.produtosImportados = produtosImportados;
    }

    // Getters e Setters
    public boolean isProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return super.toString() + ", Vestuario{" +
               "produtosImportados=" + produtosImportados +
               '}';
    }
}