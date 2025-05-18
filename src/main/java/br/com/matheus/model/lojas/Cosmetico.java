package br.com.matheus.model.lojas;

import br.com.matheus.model.Data;
import br.com.matheus.model.Endereco;


public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                     Endereco endereco, Data dataFundacao, int tamanhoEstoque, 
                     double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    // Getters e Setters
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cosmetico{" +
                "taxaComercializacao=" + taxaComercializacao +
                '}';
    }
}