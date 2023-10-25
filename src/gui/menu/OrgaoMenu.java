package gui.menu;

import java.util.Scanner;

import repositorios.OrgaoRepositorio;
import repositorios.interfaces.IOrgaoRepositorio;
import servicos.OrgaoService;

public class OrgaoMenu {
	IOrgaoRepositorio orgaoRepositorio= (IOrgaoRepositorio) new OrgaoRepositorio();
    private OrgaoService orgaoService = new OrgaoService(orgaoRepositorio);
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("Menu de Orgão:");
            System.out.println("1. Criar Orgão");
            System.out.println("2. Atualizar Orgão");
            System.out.println("3. Remover Orgão");
            System.out.println("4. Listar Todos os Orgãos");
            System.out.println("5. Listar Orgão por Nome");
            System.out.println("6. Buscar Orgão por Sigla");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir o '\n' que fica no buffer
            
            switch (opcao) {
                case 1:
                    criarOrgao();
                    break;
                case 2:
                    atualizarOrgao();
                    break;
                case 3:
                    removerOrgao();
                    break;
                case 4:
                    listarTodosOrgaos();
                    break;
                case 5:
                    listarOrgaoPorNome();
                    break;
                case 6:
                    buscarOrgaoPorSigla();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void criarOrgao() {
        // Implementar a lógica de criação aqui
        // Exemplo:
        System.out.print("Digite o nome do órgão: ");
        String nome = scanner.nextLine();
        // e assim por diante para os outros campos...
        
        // orgaoService.criarOrgao(orgao);
    }

    private void atualizarOrgao() {
        // Implementar a lógica de atualização aqui
    }

    private void removerOrgao() {
        // Implementar a lógica de remoção aqui
    }

    private void listarTodosOrgaos() {
        // Implementar a lógica de listagem aqui
    }

    private void listarOrgaoPorNome() {
        // Implementar a lógica de listagem por nome aqui
    }

    private void buscarOrgaoPorSigla() {
        // Implementar a lógica de busca por sigla aqui
    }

    public static void main(String[] args) {
        OrgaoMenu menu = new OrgaoMenu();
        menu.exibirMenu();
    }
}

