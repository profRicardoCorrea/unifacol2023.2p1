package enums;

public enum SituacaoDenuncia {
	Submissao(1,"A pessoa denunciante envia a denúncia, fornecendo detalhes, evidências e informações relevantes. Geralmente, é possível fazer isso de forma anônima."),
	Recepcao (2,"A denúncia é recebida pelo conselho de ética ou equipe responsável pelo portal de denúncias. Ela é registrada e uma notificação é enviada à pessoa denunciante (se não for anônima)."),
	TriagemInicial(3,"A equipe avalia a denúncia para determinar se ela é válida, se contém informações suficientes e se está dentro da jurisdição ou competência do conselho ou portal."),
	InvestigacaoPreliminar(4,"Se a denúncia for considerada válida, uma investigação preliminar é conduzida para reunir mais informações e entender melhor o contexto."),
	FormacaoComite(5,"Dependendo da gravidade ou complexidade do caso, um comitê ou equipe especial pode ser formado para conduzir uma investigação mais aprofundada."),
	Investigacao(6, "Entrevistas, coleta de evidências, revisão de documentos e outras atividades são realizadas para entender completamente a situação."),
	ElaboracaoRelatório(7,"Após a investigação, um relatório é elaborado detalhando os achados, conclusões e possíveis recomendações."),
	Deliberacao(8,"O conselho de ética ou o órgão responsável revisa o relatório e delibera sobre as ações a serem tomadas. Isso pode incluir sanções, medidas corretivas, treinamentos ou outras ações pertinentes."),
	Notificacao(9,"A pessoa denunciante e a parte denunciada são notificadas sobre os resultados e as ações tomadas."),
	ImplementacaoAcoes(10,"Qualquer ação decidida pelo conselho ou órgão é implementada."),
	Acompanhamento(11,"Dependendo da situação, pode haver um período de acompanhamento para garantir que as medidas corretivas sejam eficazes e que não haja retaliação contra a pessoa denunciante."),
	Arquivamento(12,"Uma vez concluído o processo, a denúncia e todos os documentos relacionados são arquivados de acordo com as políticas da organização.");
 
    private final int valor;
    private final String descricao;

    SituacaoDenuncia(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public static SituacaoDenuncia porValor(int valor) {
        for (SituacaoDenuncia dia : values()) {
            if (dia.valor == valor) {
                return dia;
            }
        }
        throw new IllegalArgumentException("Valor inválido: " + valor);
    }

    @Override
    public String toString() {
        return descricao;
    }

}
