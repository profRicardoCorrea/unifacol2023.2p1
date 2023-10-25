package servicos;

import java.util.List;

import entidades.Orgao;
import repositorios.OrgaoRepositorio;
import repositorios.interfaces.IOrgaoRepositorio;

public class OrgaoService {

    private IOrgaoRepositorio repositorio ;
    
    public OrgaoService(IOrgaoRepositorio repositorio) {
		 
		this.repositorio = repositorio;
	}

	public void criarOrgao(Orgao orgao) {
        repositorio.salvar(orgao);
    }

    public void atualizarOrgao(Orgao orgaoExistente, Orgao orgaoAtualizado) {
        repositorio.atualizar(orgaoExistente, orgaoAtualizado);
    }

    public void removerOrgao(Orgao orgao) {
        repositorio.remover(orgao);
    }

    public List<Orgao> listarTodosOrgaos() {
        return repositorio.listarTodos();
    }

    public List<Orgao> listarOrgaosPorNome(String nome) {
        return repositorio.listarPorNome(nome);
    }

    public Orgao buscarOrgaoPorSigla(String sigla) {
        return repositorio.buscarPorSigla(sigla);
    }
}

