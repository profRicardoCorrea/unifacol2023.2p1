package servicos.interfaces;

import java.util.List;

import entidades.Denunciado;
import repositorios.DenunciadoRepositorio;

public interface IDenunciadoService {	 

	public void criarDenunciado(Denunciado denunciado);

    public void atualizarDenunciado(Denunciado denunciadoExistente, Denunciado denunciadoAtualizado);
    
    public void removerDenunciado(Denunciado denunciado) ;

    public List<Denunciado> listarTodosDenunciados() ;

    public List<Denunciado> listarDenunciadosPorNome(String nome);

    public List<Denunciado> listarDenunciadosPorNomeVulgo(String nomeVulgo) ;

    public Denunciado buscarDenunciadoPorCPF(String cpf);
}
