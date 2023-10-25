package repositorios.interfaces;

import java.util.List;
import java.util.stream.Collectors;

import entidades.Orgao;

public interface IOrgaoRepositorio {

	public void salvar(Orgao orgao) ;
	
    public void atualizar(Orgao orgaoExistente, Orgao orgaoAtualizado);

    public void remover(Orgao orgao) ;

    public List<Orgao> listarTodos() ;

    public List<Orgao> listarPorNome(String nome);

    public Orgao buscarPorSigla(String sigla) ;
}
