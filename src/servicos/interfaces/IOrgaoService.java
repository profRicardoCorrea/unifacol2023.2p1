package servicos.interfaces;

import java.util.List;

import entidades.Orgao;
import repositorios.OrgaoRepositorio;

public interface IOrgaoService {
	 
	public void criarOrgao(Orgao orgao);

    public void atualizarOrgao(Orgao orgaoExistente, Orgao orgaoAtualizado) ;
    
    public void removerOrgao(Orgao orgao);

    public List<Orgao> listarTodosOrgaos();

    public List<Orgao> listarOrgaosPorNome(String nome);

    public Orgao buscarOrgaoPorSigla(String sigla);
}
