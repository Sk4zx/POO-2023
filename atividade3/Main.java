package atividade3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        while (true) {
            System.out.println("\n\n==== MENU ====");
            System.out.println("1. Adicionar Item");
            System.out.println("2. Remover Item");
            System.out.println("3. Atualizar Quantidade");
            System.out.println("4. Listar Itens");
            System.out.println("5. Sair");
            System.out.print("Digite sua escolha: ");
            
            int escolha = scanner.nextInt();
            

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a quantidade do item: ");
                    int quantidade = scanner.nextInt();
                    
                    inventario.adicionarItem(nome, quantidade);
                    System.out.println("Item adicionado.");
                    break;
                case 2:
                    System.out.print("Digite o nome do item para remover: ");
                    String itemParaRemover = scanner.nextLine();
                    inventario.removerItem(itemParaRemover);
                    System.out.println("Item removido.");
                    break;
                case 3:
                    System.out.print("Digite o nome do item para atualizar a quantidade: ");
                    String nomeDoItem = scanner.nextLine();
                    System.out.print("Digite a nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    
                    inventario.atualizarQuantidade(nomeDoItem, novaQuantidade);
                    System.out.println("Quantidade atualizada.");
                    break;
                case 4:
                    System.out.println("Itens atuais no inventário:");
                    inventario.listarItens();
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Escolha inválida. Por favor, digite uma opção válida.");
            }
        }
    }
}