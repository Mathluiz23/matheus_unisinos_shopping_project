package br.com.matheus.model;

import br.com.matheus.model.lojas.Alimentacao;
import br.com.matheus.model.lojas.Bijuteria;
import br.com.matheus.model.lojas.Cosmetico;
import br.com.matheus.model.lojas.Informatica;
import br.com.matheus.model.lojas.Loja;
import br.com.matheus.model.lojas.Vestuario;
import java.util.Arrays;
import java.util.Objects;


public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int count = 0;
        
        switch (tipoLoja.toLowerCase()) {
            case "cosmético":
            case "cosmetico":
                for (Loja loja : lojas) {
                    if (loja instanceof Cosmetico) {
                        count++;
                    }
                }
                break;
            case "vestuário":
            case "vestuario":
                for (Loja loja : lojas) {
                    if (loja instanceof Vestuario) {
                        count++;
                    }
                }
                break;
            case "bijuteria":
                for (Loja loja : lojas) {
                    if (loja instanceof Bijuteria) {
                        count++;
                    }
                }
                break;
            case "alimentação":
            case "alimentacao":
                for (Loja loja : lojas) {
                    if (loja instanceof Alimentacao) {
                        count++;
                    }
                }
                break;
            case "informática":
            case "informatica":
                for (Loja loja : lojas) {
                    if (loja instanceof Informatica) {
                        count++;
                    }
                }
                break;
            default:
                return -1;
        }
        
        return count;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica maisCara = null;
        double maiorSeguro = 0;
        
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica info = (Informatica) loja;
                if (info.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = info.getSeguroEletronicos();
                    maisCara = info;
                }
            }
        }
        
        return maisCara;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}