package entidades;

public abstract class Contato {
	 private String celular;
	 private String email;
	 private String telefone; 
	 private String whatsApp;
	 private String instagram;
	
	 public Contato(String celular, String email, String telefone, String whatsApp, String instagram) {
		super();
		this.celular = celular;
		this.email = email;
		this.telefone = telefone;
		this.whatsApp = whatsApp;
		this.instagram = instagram;
	}
	 public Contato() {		}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getWhatsApp() {
		return whatsApp;
	}
	public void setWhatsApp(String whatsApp) {
		this.whatsApp = whatsApp;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	 
	 
	 
	 
}
