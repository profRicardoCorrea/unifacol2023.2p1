package entidades;

public class Denunciado extends Pessoa{	
	private Endereco endereco;	
	private String nomeVulgo;
	private String alturaAproximada;
	private String tipoFisico;
	private String tipoQueixo;
	private String tamanhoCabelo;
	private String corCabelo;
	private String corPele;
	private String corOlhos;	
	private String formatoRosto;
	private String [] outrasCaracteristicasFisicas;
	private Endereco vistoUltimaVez;
	 
	
	public Denunciado(Endereco endereco, String nomeVulgo, String alturaAproximada, String tipoFisico,
			String tipoQueixo, String tamanhoCabelo, String corCabelo, String corPele, String corOlhos,
			String formatoRosto, String[] outrasCaracteristicasFisicas, Endereco vistoUltimaVez) {
		super();
		this.endereco = endereco;
		this.nomeVulgo = nomeVulgo;
		this.alturaAproximada = alturaAproximada;
		this.tipoFisico = tipoFisico;
		this.tipoQueixo = tipoQueixo;
		this.tamanhoCabelo = tamanhoCabelo;
		this.corCabelo = corCabelo;
		this.corPele = corPele;
		this.corOlhos = corOlhos;
		this.formatoRosto = formatoRosto;
		this.outrasCaracteristicasFisicas = outrasCaracteristicasFisicas;
		this.vistoUltimaVez = vistoUltimaVez;
	}
	
	public Denunciado() {}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNomeVulgo() {
		return nomeVulgo;
	}
	public void setNomeVulgo(String nomeVulgo) {
		this.nomeVulgo = nomeVulgo;
	}
	public String getAlturaAproximada() {
		return alturaAproximada;
	}
	public void setAlturaAproximada(String alturaAproximada) {
		this.alturaAproximada = alturaAproximada;
	}
	public String getTipoFisico() {
		return tipoFisico;
	}
	public void setTipoFisico(String tipoFisico) {
		this.tipoFisico = tipoFisico;
	}
	public String getTipoQueixo() {
		return tipoQueixo;
	}
	public void setTipoQueixo(String tipoQueixo) {
		this.tipoQueixo = tipoQueixo;
	}
	public String getTamanhoCabelo() {
		return tamanhoCabelo;
	}
	public void setTamanhoCabelo(String tamanhoCabelo) {
		this.tamanhoCabelo = tamanhoCabelo;
	}
	public String getCorCabelo() {
		return corCabelo;
	}
	public void setCorCabelo(String corCabelo) {
		this.corCabelo = corCabelo;
	}
	public String getCorPele() {
		return corPele;
	}
	public void setCorPele(String corPele) {
		this.corPele = corPele;
	}
	public String getCorOlhos() {
		return corOlhos;
	}
	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}
	public String getFormatoRosto() {
		return formatoRosto;
	}
	public void setFormatoRosto(String formatoRosto) {
		this.formatoRosto = formatoRosto;
	}
	public String[] getOutrasCaracteristicasFisicas() {
		return outrasCaracteristicasFisicas;
	}
	public void setOutrasCaracteristicasFisicas(String[] outrasCaracteristicasFisicas) {
		this.outrasCaracteristicasFisicas = outrasCaracteristicasFisicas;
	}
	public Endereco getVistoUltimaVez() {
		return vistoUltimaVez;
	}
	public void setVistoUltimaVez(Endereco vistoUltimaVez) {
		this.vistoUltimaVez = vistoUltimaVez;
	}	
}
