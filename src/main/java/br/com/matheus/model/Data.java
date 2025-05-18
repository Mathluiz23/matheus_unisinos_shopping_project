package br.com.matheus.model;
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Configurando para 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    private boolean validarData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        
        if (dia < 1) {
            return false;
        }
        
        int maxDias;
        switch (mes) {
            case 2:
                maxDias = verificaAnoBissexto() ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDias = 30;
                break;
            default:
                maxDias = 31;
        }
        
        return dia <= maxDias;
    }

    public boolean verificaAnoBissexto() {
        if (ano % 4 != 0) {
            return false;
        } else if (ano % 100 != 0) {
            return true;
        } else return ano % 400 == 0;
    }

    // Getters e Setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (validarData(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido para a data atual.");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (validarData(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido para a data atual.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (validarData(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido para a data atual.");
        }
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}