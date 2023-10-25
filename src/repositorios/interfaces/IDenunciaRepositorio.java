package repositorios.interfaces;

import java.util.List;
import java.util.stream.Collectors;

import entidades.Denuncia;
import entidades.Denunciado;
import entidades.Denunciante;

public interface IDenunciaRepositorio {
	
	public void salvar(Denuncia denuncia);

    public void atualizar(Denuncia denunciaExistente, Denuncia denunciaAtualizada);

    public void remover(Denuncia denuncia) ;

    public List<Denuncia> listarTodos() ;

    public List<Denuncia> listarPorDenunciante(Denunciante denunciante);

    public List<Denuncia> listarPorDenunciado(Denunciado denunciado) ;
}
