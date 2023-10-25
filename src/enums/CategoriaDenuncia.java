package enums;

public enum CategoriaDenuncia {
	Discriminacao (1,"Denúncias de práticas discriminatórias com base em raça, gênero, orientação sexual, religião, entre outros."),
	ViolacaoDireitos (2," Inclui denúncias de tortura, detenções ilegais, entre outros."),
	ViolenciaDomestica(3,"Violência Domestica"),
	AbusoInfantil(4,"Abuso Infantil"),
	Agressao(5,"Agressão"),
	AssedioMoral (6, "Denúncias de comportamentos abusivos no ambiente de trabalho."),
	AssedioSexual (7, "Denúncias de comportamentos abusivos sexuais no ambiente de trabalho."),
	CondicaoInadequadaTrabalho(8,"Inclui denúncias de trabalho insalubre, falta de equipamentos de proteção, entre outros.");

    private final int valor;
    private final String descricao;

    CategoriaDenuncia(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public static CategoriaDenuncia porValor(int valor) {
        for (CategoriaDenuncia dia : values()) {
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
