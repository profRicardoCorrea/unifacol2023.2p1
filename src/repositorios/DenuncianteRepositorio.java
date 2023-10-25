package repositorios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entidades.Denunciante;

public class DenuncianteRepositorio {

    private List<Denunciante> denunciantes = new ArrayList<>();

    public void salvar(Denunciante denunciante) {
        denunciantes.add(denunciante);
    }

    public void atualizar(Denunciante denuncianteExistente, Denunciante denuncianteAtualizado) {
        int index = denunciantes.indexOf(denuncianteExistente);
        if (index != -1) {
            denunciantes.set(index, denuncianteAtualizado);
        }
    }

    public void remover(Denunciante denunciante) {
        denunciantes.remove(denunciante);
    }

    public List<Denunciante> listarTodos() {
        return denunciantes;
    }

    public List<Denunciante> listarPorNome(String nome) {
        return denunciantes.stream()
            .filter(denunciante -> denunciante.getNome().equalsIgnoreCase(nome))
            .collect(Collectors.toList());
    }

    public Denunciante buscarPorCPF(String cpf) {
        return denunciantes.stream()
            .filter(denunciante -> denunciante.getCpf().equals(cpf))
            .findFirst()
            .orElse(null);
    }
}