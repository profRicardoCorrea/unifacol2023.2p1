package abstracao;

public enum TipoDenuncia {
	Religiosidade(1,"Preconceito contra pessoas com base em suas crenças religiosas ou a falta delas."),
	Idadeismo(2,"Preconceito contra indivíduos com base em sua idade."),
	Etnocentrismo(3,"Avaliação de outras culturas com base nos preconceitos da cultura do próprio."),
	Classismo(4,"Preconceito baseado na classe socioeconômica."),
	Ableismo(5,"Preconceito contra pessoas com deficiências."),
	Xenofobia(6, "Preconceito contra pessoas de outros países ou culturas."),
	Transfobia(7,"Preconceito contra pessoas transgênero ou de gênero não conformado."),
	Homofobia(8,"Preconceito contra pessoas com base em sua orientação sexual."),
	Sexismo(9,"Preconceito baseado no gênero. Pode ser direcionado a homens, mulheres ou pessoas não binárias."),
	Racismo(10,"Preconceito contra indivíduos com base em sua raça ou etnia."),
	ViolenciaFisica(11,"Envolve o uso de força física para causar dano ou lesão a outra pessoa. Exemplos incluem agressão, homicídio e abuso doméstico."),
	ViolenciaPsicologica(12,"Refere-se a ações ou palavras que causam dano emocional ou mental. Isso pode incluir humilhação, manipulação, intimidação e ameaças."),
	ViolenciaSexual(13,"Envolve atos sexuais realizados contra a vontade de uma pessoa. Isso inclui estupro, assédio sexual e abuso sexual infantil."),
	ViolenciaEconomica(14,"Pode incluir atos que privam alguém de seus recursos, propriedade ou direitos econômicos, como extorsão, fraude ou privação de recursos essenciais."),
	ViolenciaSimbolica(15,"Introduzida por Pierre Bourdieu, refere-se à normalização da dominação e da desigualdade através de meios culturais e simbólicos."),
	ViolenciaEstrutural(16,"Introduzida por Johan Galtung, refere-se a sistemas sociais, políticos e econômicos que prejudicam e impedem indivíduos ou grupos de alcançar seu pleno potencial.");
    
    private final int valor;
    private final String descricao;

    TipoDenuncia(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public static TipoDenuncia porValor(int valor) {
        for (TipoDenuncia dia : values()) {
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
