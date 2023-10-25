package servicos;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entidades.Denuncia;
import entidades.Denunciado;
import entidades.Denunciante;
import repositorios.DenunciaRepositorio;
public class DenunciaService {

    private DenunciaRepositorio repositorio;    

    public DenunciaService(DenunciaRepositorio repositorio) { 
		this.repositorio = repositorio;
	}

	public void criarDenuncia(Denuncia denuncia) {
        repositorio.salvar(denuncia);
    }

    public void atualizarDenuncia(Denuncia denunciaExistente, Denuncia denunciaAtualizada) {
        repositorio.atualizar(denunciaExistente, denunciaAtualizada);
    }

    public void removerDenuncia(Denuncia denuncia) {
        repositorio.remover(denuncia);
    }

    public List<Denuncia> listarTodasDenuncias() {
        return repositorio.listarTodos();
    }

    public List<Denuncia> listarDenunciasPorDenunciante(Denunciante denunciante) {
        return repositorio.listarPorDenunciante(denunciante);
    }

    public List<Denuncia> listarDenunciasPorDenunciado(Denunciado denunciado) {
        return repositorio.listarPorDenunciado(denunciado);
    }
}
