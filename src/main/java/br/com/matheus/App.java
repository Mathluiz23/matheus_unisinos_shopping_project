import java.util.Scanner;

import br.com.matheus.model.Data;
import br.com.matheus.model.Produto;
import br.com.matheus.model.lojas.Loja;
import br.com.matheus.model.Endereco;
import br.com.matheus.model.lojas.Alimentacao;
import br.com.matheus.model.lojas.Bijuteria;
import br.com.matheus.model.lojas.Cosmetico;
import br.com.matheus.model.lojas.Informatica;
import br.com.matheus.model.lojas.Vestuario;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;
        
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            
            switch (opcao) {
                case 1:
                    loja = criarLoja(scanner);
                    break;
                case 2:
                    produto = criarProduto(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 3);
        
        if (loja != null && produto != null) {
            // Verificar se o produto está vencido na data 20/10/2023
            Data dataReferencia = new Data(20, 10, 2023);
            if (produto.estaVencido(dataReferencia)) {
                System.out.println("PRODUTO VENCIDO");
            } else {
                System.out.println("PRODUTO NÃO VENCIDO");
            }
            
            // Imprimir informações da loja
            System.out.println("\nInformações da Loja:");
            System.out.println(loja);
        }
        
        scanner.close();
    }
    
    private static Loja criarLoja(Scanner scanner) {
        System.out.println("\nCriando uma nova loja:");
        
        System.out.print("Nome da loja: ");
        String nome = scanner.nextLine();
        
        System.out.print("Quantidade de funcionários: ");
        int quantidadeFuncionarios = scanner.nextInt();
        
        System.out.print("Salário base dos funcionários (-1 se não informado): ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer
        
        System.out.println("\nEndereço da loja:");
        System.out.print("Nome da rua: ");
        String rua = scanner.nextLine();
        
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        
        System.out.print("País: ");
        String pais = scanner.nextLine();
        
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        
        System.out.print("Complemento: ");
        String complemento = scanner.nextLine();
        
        System.out.println("\nData de fundação:");
        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        
        System.out.print("Mês: ");
        int mes = scanner.nextInt();
        
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        
        System.out.print("Tamanho máximo do estoque: ");
        int tamanhoEstoque = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        
        Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);
        Data dataFundacao = new Data(dia, mes, ano);
        
        if (salarioBase == -1) {
            return new Loja(nome, quantidadeFuncionarios, endereco, dataFundacao, tamanhoEstoque);
        } else {
            return new Loja(nome, quantidadeFuncionarios, salarioBase, endereco, dataFundacao, tamanhoEstoque);
        }
    }
    
    private static Produto criarProduto(Scanner scanner) {
        System.out.println("\nCriando um novo produto:");
        
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer
        
        System.out.println("Data de validade:");
        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        
        System.out.print("Mês: ");
        int mes = scanner.nextInt();
        
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        
        Data dataValidade = new Data(dia, mes, ano);
        
        return new Produto(nome, preco, dataValidade);
    }
}