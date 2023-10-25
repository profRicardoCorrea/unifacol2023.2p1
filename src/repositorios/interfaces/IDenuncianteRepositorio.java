package repositorios.interfaces;

import java.util.List;

import entidades.Denunciante;

public interface IDenuncianteRepositorio {
	
	public void criarDenunciante(Denunciante denunciante) ;

    public void atualizarDenunciante(Denunciante denuncianteExistente, Denunciante denuncianteAtualizado) ;

    public void removerDenunciante(Denunciante denunciante);

    public List<Denunciante> listarTodosDenunciantes();

    public List<Denunciante> listarDenunciantesPorNome(String nome) ;

    public Denunciante buscarDenunciantePorCPF(String cpf) ;
}
