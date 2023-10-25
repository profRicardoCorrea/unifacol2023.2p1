package gui.menu;

import java.util.Scanner;

import repositorios.DenuncianteRepositorio;
import repositorios.interfaces.IDenuncianteRepositorio;
import servicos.DenuncianteService;

public class DenuncianteMenu {
	private IDenuncianteRepositorio denuncianteRepositorio=(IDenuncianteRepositorio) new DenuncianteRepositorio();
    private DenuncianteService denuncianteService = new DenuncianteService((DenuncianteRepositorio) denuncianteRepositorio);
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("Menu de Denunciante:");
            System.out.println("1. Criar Denunciante");
            System.out.println("2. Atualizar Denunciante");
            System.out.println("3. Remover Denunciante");
            System.out.println("4. Listar Todos os Denunciantes");
            System.out.println("5. Listar Denunciante por Nome");
            System.out.println("6. Listar Denunciante por CPF");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir o '\n' que fica no buffer
            
            switch (opcao) {
                case 1:
                    criarDenunciante();
                    break;
                case 2:
                    atualizarDenunciante();
                    break;
                case 3:
                    removerDenunciante();
                    break;
                case 4:
                    listarTodosDenunciantes();
                    break;
                case 5:
                    listarDenunciantePorNome();
                    break;
                case 6:
                    listarDenunciantePorCPF();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void criarDenunciante() {
        // Implementar a lógica de criação aqui
        // Exemplo:
        System.out.print("Digite o nome do denunciante: ");
        String nome = scanner.nextLine();
        // Continue para os outros campos...
        
        // denuncianteService.criarDenunciante(denunciante);
    }

    private void atualizarDenunciante() {
        // Implementar a lógica de atualização aqui
    }

    private void removerDenunciante() {
        // Implementar a lógica de remoção aqui
    }

    private void listarTodosDenunciantes() {
        // Implementar a lógica de listagem aqui
    }

    private void listarDenunciantePorNome() {
        // Implementar a lógica de listagem por nome aqui
    }

    private void listarDenunciantePorCPF() {
        // Implementar a lógica de listagem por CPF aqui
    }

    public static void main(String[] args) {
        DenuncianteMenu menu = new DenuncianteMenu();
        menu.exibirMenu();
    }
}
