package gui.menu;

import java.util.Scanner;

import repositorios.DenunciadoRepositorio;
import servicos.DenunciadoService;
import servicos.interfaces.IDenunciadoService;

public class DenunciadoMenu {
	private DenunciadoRepositorio denunciadoRepositorio= new DenunciadoRepositorio();
    private IDenunciadoService denunciadoService = (IDenunciadoService) new DenunciadoService(denunciadoRepositorio);
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("Menu de Denunciado:");
            System.out.println("1. Criar Denunciado");
            System.out.println("2. Atualizar Denunciado");
            System.out.println("3. Remover Denunciado");
            System.out.println("4. Listar Todos os Denunciados");
            System.out.println("5. Listar Denunciado por Nome");
            System.out.println("6. Listar Denunciado por NomeVulgo");
            System.out.println("7. Buscar Denunciado por CPF");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir o '\n' que fica no buffer
            
            switch (opcao) {
                case 1:
                    criarDenunciado();
                    break;
                case 2:
                    atualizarDenunciado();
                    break;
                case 3:
                    removerDenunciado();
                    break;
                case 4:
                    listarTodosDenunciados();
                    break;
                case 5:
                    listarDenunciadoPorNome();
                    break;
                case 6:
                    listarDenunciadoPorNomeVulgo();
                    break;
                case 7:
                    buscarDenunciadoPorCPF();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void criarDenunciado() {
        // Implementar a lógica de criação aqui
        // Exemplo:
        System.out.print("Digite o nome do denunciado: ");
        String nome = scanner.nextLine();
        // e assim por diante para os outros campos...
        
        // denunciadoService.criarDenunciado(denunciado);
    }

    private void atualizarDenunciado() {
        // Implementar a lógica de atualização aqui
    }

    private void removerDenunciado() {
        // Implementar a lógica de remoção aqui
    }

    private void listarTodosDenunciados() {
        // Implementar a lógica de listagem aqui
    }

    private void listarDenunciadoPorNome() {
        // Implementar a lógica de listagem por nome aqui
    }

    private void listarDenunciadoPorNomeVulgo() {
        // Implementar a lógica de listagem por nome vulgo aqui
    }

    private void buscarDenunciadoPorCPF() {
        // Implementar a lógica de busca por CPF aqui
    }

    public static void main(String[] args) {
        DenunciadoMenu menu = new DenunciadoMenu();
        menu.exibirMenu();
    }
}

