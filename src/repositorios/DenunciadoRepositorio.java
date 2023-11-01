package repositorios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entidades.Denunciado;

public class DenunciadoRepositorio {

    private List<Denunciado> denunciados = new ArrayList<>();

    public void salvar(Denunciado denunciado) {
        denunciados.add(denunciado);
    }
    public void checkout(float valorAntecipado) {}
    public void checkout(int parcelas, float taxaJuros,float valorAntecipado) {}
  
    public void atualizar(Denunciado denunciadoExistente, Denunciado denunciadoAtualizado) {
        int index = denunciados.indexOf(denunciadoExistente);
        if (index != -1) {
            denunciados.set(index, denunciadoAtualizado);
        }
    }

    public void remover(Denunciado denunciado) {
        denunciados.remove(denunciado);
    }

    public List<Denunciado> listarTodos() {
        return denunciados;
    }

    public List<Denunciado> listarPorNome(String nome) {
        return denunciados.stream()
            .filter(denunciado -> denunciado.getNome().equalsIgnoreCase(nome))
            .collect(Collectors.toList());
    }

    public List<Denunciado> listarPorNomeVulgo(String nomeVulgo) {
        return denunciados.stream()
            .filter(denunciado -> denunciado.getNomeVulgo().equalsIgnoreCase(nomeVulgo))
            .collect(Collectors.toList());
    }

    public Denunciado buscarPorCPF(String cpf) {
        return denunciados.stream()
            .filter(denunciado -> denunciado.getCpf().equals(cpf))
            .findFirst()
            .orElse(null);
    }
}

