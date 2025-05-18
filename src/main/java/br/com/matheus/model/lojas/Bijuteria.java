package br.com.matheus.model.lojas;

import br.com.matheus.model.Data;
import br.com.matheus.model.Endereco;

public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                     Endereco endereco, Data dataFundacao, int tamanhoEstoque, 
                     double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.metaVendas = metaVendas;
    }

    // Getters e Setters
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bijuteria{" +
                "metaVendas=" + metaVendas +
                '}';
    }
}