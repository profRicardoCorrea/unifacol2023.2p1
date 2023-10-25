package repositorios;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entidades.Denuncia;
import entidades.Denunciado;
import entidades.Denunciante;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DenunciaRepositorio {

    private List<Denuncia> denuncias = new ArrayList<>();

    public void salvar(Denuncia denuncia) {
        denuncias.add(denuncia);
    }

    public void atualizar(Denuncia denunciaExistente, Denuncia denunciaAtualizada) {
        int index = denuncias.indexOf(denunciaExistente);
        if (index != -1) {
            denuncias.set(index, denunciaAtualizada);
        }
    }

    public void remover(Denuncia denuncia) {
        denuncias.remove(denuncia);
    }

    public List<Denuncia> listarTodos() {
        return denuncias;
    }

    public List<Denuncia> listarPorDenunciante(Denunciante denunciante) {
        return denuncias.stream()
            .filter(denuncia -> denuncia.getDenunciante().equals(denunciante))
            .collect(Collectors.toList());
    }

    public List<Denuncia> listarPorDenunciado(Denunciado denunciado) {
        return denuncias.stream()
            .filter(denuncia -> denuncia.getDenunciado().equals(denunciado))
            .collect(Collectors.toList());
    }
}
