package br.com.matheus.model;
public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data dataReferencia) {
        if (dataValidade.getAno() < dataReferencia.getAno()) {
            return true;
        } else if (dataValidade.getAno() == dataReferencia.getAno()) {
            if (dataValidade.getMes() < dataReferencia.getMes()) {
                return true;
            } else if (dataValidade.getMes() == dataReferencia.getMes()) {
                return dataValidade.getDia() < dataReferencia.getDia();
            }
        }
        return false;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", dataValidade=" + dataValidade +
                '}';
    }
}