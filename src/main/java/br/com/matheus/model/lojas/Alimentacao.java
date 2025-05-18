package br.com.matheus.model.lojas;

import br.com.matheus.model.Data;
import br.com.matheus.model.Endereco;

public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                      Endereco endereco, Data dataFundacao, int tamanhoEstoque, 
                      Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.dataAlvara = dataAlvara;
    }

    // Getters e Setters corretos
    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return super.toString() + ", Alimentacao{" +
               "dataAlvara=" + dataAlvara +
               '}';
    }
}