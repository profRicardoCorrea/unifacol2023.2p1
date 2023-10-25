package servicos;

import java.util.List;

import entidades.Denunciado;
import repositorios.DenunciadoRepositorio;

public class DenunciadoService {

	
    private DenunciadoRepositorio repositorio ;    
    
    public DenunciadoService(DenunciadoRepositorio repositorio) {		 
		this.repositorio = repositorio;
	}

	public void criarDenunciado(Denunciado denunciado) {
        repositorio.salvar(denunciado);
    }

    public void atualizarDenunciado(Denunciado denunciadoExistente, Denunciado denunciadoAtualizado) {
        repositorio.atualizar(denunciadoExistente, denunciadoAtualizado);
    }

    public void removerDenunciado(Denunciado denunciado) {
        repositorio.remover(denunciado);
    }

    public List<Denunciado> listarTodosDenunciados() {
        return repositorio.listarTodos();
    }

    public List<Denunciado> listarDenunciadosPorNome(String nome) {
        return repositorio.listarPorNome(nome);
    }

    public List<Denunciado> listarDenunciadosPorNomeVulgo(String nomeVulgo) {
        return repositorio.listarPorNomeVulgo(nomeVulgo);
    }

    public Denunciado buscarDenunciadoPorCPF(String cpf) {
        return repositorio.buscarPorCPF(cpf);
    }
}

