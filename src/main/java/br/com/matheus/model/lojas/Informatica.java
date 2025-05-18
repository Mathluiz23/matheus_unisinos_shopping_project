package br.com.matheus.model.lojas;

import br.com.matheus.model.Data;
import br.com.matheus.model.Endereco;

public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                       Endereco endereco, Data dataFundacao, int tamanhoEstoque, 
                       double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Getters e Setters
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Informatica{" +
                "seguroEletronicos=" + seguroEletronicos +
                '}';
    }
}