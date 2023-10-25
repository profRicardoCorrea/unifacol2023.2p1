package servicos.interfaces;

import java.util.List;

import entidades.Denuncia;
import entidades.Denunciado;
import entidades.Denunciante;

public interface IDenunciaService {
	
	public void criarDenuncia(Denuncia denuncia);

    public void atualizarDenuncia(Denuncia denunciaExistente, Denuncia denunciaAtualizada) ;

    public void removerDenuncia(Denuncia denuncia);

    public List<Denuncia> listarTodasDenuncias() ;

    public List<Denuncia> listarDenunciasPorDenunciante(Denunciante denunciante);

    public List<Denuncia> listarDenunciasPorDenunciado(Denunciado denunciado) ;
}
