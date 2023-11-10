package servicos;

import java.util.List;

import entidades.Denunciante;
import repositorios.DenuncianteRepositorio;

public class DenuncianteService {	

    private DenuncianteRepositorio repositorio ;   

    public DenuncianteService(DenuncianteRepositorio repositorio) {		
		this.repositorio = repositorio;
	}

	public void criarDenunciante(Denunciante denunciante) {
        repositorio.salvar(denunciante);
    }

    public void atualizarDenunciante( Denunciante denuncianteAtualizado) {
        repositorio.atualizar(denuncianteAtualizado);
    }

    public void removerDenunciante(Denunciante denunciante) {
        repositorio.remover(denunciante);
    }

    public List<Denunciante> listarTodosDenunciantes() {
        return repositorio.listarTodos();
    }

    public List<Denunciante> listarDenunciantesPorNome(String nome) {
        return repositorio.listarPorNome(nome);
    }

    public Denunciante buscarDenunciantePorCPF(String cpf) {
        return repositorio.buscarPorCPF(cpf);
    }
}

