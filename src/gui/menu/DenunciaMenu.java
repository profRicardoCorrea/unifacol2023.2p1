package gui.menu;

import java.util.Scanner;

import repositorios.DenunciaRepositorio;
import servicos.DenunciaService;
import servicos.interfaces.IDenunciaService;

public class DenunciaMenu {
	private DenunciaRepositorio denunciaRepositorio =new DenunciaRepositorio();
    private IDenunciaService denunciaService = (IDenunciaService) new DenunciaService(denunciaRepositorio);
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("Menu de Denúncia:");
            System.out.println("1. Criar Denúncia");
            System.out.println("2. Atualizar Denúncia");
            System.out.println("3. Remover Denúncia");
            System.out.println("4. Listar Todas as Denúncias");
            System.out.println("5. Listar Denúncia por Denunciante");
            System.out.println("6. Listar Denúncia por Denunciado");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir o '\n' que fica no buffer
            
            switch (opcao) {
                case 1:
                    criarDenuncia();
                    break;
                case 2:
                    atualizarDenuncia();
                    break;
                case 3:
                    removerDenuncia();
                    break;
                case 4:
                    listarTodasDenuncias();
                    break;
                case 5:
                    listarDenunciaPorDenunciante();
                    break;
                case 6:
                    listarDenunciaPorDenunciado();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void criarDenuncia() {
        // Implementar a lógica de criação aqui
        // Exemplo:
        System.out.print("Digite a descrição da denúncia: ");
        String descricao = scanner.nextLine();
        // e assim por diante para os outros campos...
        
        // denunciaService.criarDenuncia(denuncia);
    }

    private void atualizarDenuncia() {
        // Implementar a lógica de atualização aqui
    }

    private void removerDenuncia() {
        // Implementar a lógica de remoção aqui
    }

    private void listarTodasDenuncias() {
        // Implementar a lógica de listagem aqui
    }

    private void listarDenunciaPorDenunciante() {
        // Implementar a lógica de listagem por denunciante aqui
    }

    private void listarDenunciaPorDenunciado() {
        // Implementar a lógica de listagem por denunciado aqui
    }

    public static void main(String[] args) {
        DenunciaMenu menu = new DenunciaMenu();
        menu.exibirMenu();
    }
}
