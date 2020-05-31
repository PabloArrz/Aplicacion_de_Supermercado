
public class Envio {
	
	private String estado;
	
	public Envio() {}
	
	public Envio(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Envio estado=" + estado + "]";
	}	
}
