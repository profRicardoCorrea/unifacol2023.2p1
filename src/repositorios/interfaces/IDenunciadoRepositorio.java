package repositorios.interfaces;

import java.util.List;
import java.util.stream.Collectors;

import entidades.Denunciado;

public interface IDenunciadoRepositorio {
	
	public void salvar(Denunciado denunciado) ;
	
    public void atualizar(Denunciado denunciadoExistente, Denunciado denunciadoAtualizado);

    public void remover(Denunciado denunciado) ;

    public List<Denunciado> listarTodos() ;
    
    public List<Denunciado> listarPorNome(String nome) ;

    public List<Denunciado> listarPorNomeVulgo(String nomeVulgo) ;

    public Denunciado buscarPorCPF(String cpf) ;
}
