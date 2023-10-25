package repositorios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entidades.Orgao;

public class OrgaoRepositorio {

    private List<Orgao> orgaos = new ArrayList<>();

    public void salvar(Orgao orgao) {
        orgaos.add(orgao);
    }

    public void atualizar(Orgao orgaoExistente, Orgao orgaoAtualizado) {
        int index = orgaos.indexOf(orgaoExistente);
        if (index != -1) {
            orgaos.set(index, orgaoAtualizado);
        }
    }

    public void remover(Orgao orgao) {
        orgaos.remove(orgao);
    }

    public List<Orgao> listarTodos() {
        return orgaos;
    }

    public List<Orgao> listarPorNome(String nome) {
        return orgaos.stream()
            .filter(orgao -> orgao.getNome().equalsIgnoreCase(nome))
            .collect(Collectors.toList());
    }

    public Orgao buscarPorSigla(String sigla) {
        return orgaos.stream()
            .filter(orgao -> orgao.getSigla().equalsIgnoreCase(sigla))
            .findFirst()
            .orElse(null);
    }
}
