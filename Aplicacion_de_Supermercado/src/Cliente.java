
public class Cliente {

	private String nombre;
	private String apellidos;
	private String direccion;
	private int numTarjeta;
	private String dirEntrega;
	private String email;
	private String contrase�a;
	private int numMovil;
	
	public Cliente() {};
	
	public Cliente(String nombre, String apellidos, String direccion, int numTarjeta) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.numTarjeta = numTarjeta;
		this.numMovil = -1;
		this.dirEntrega = "";
		this.email = "";
		this.contrase�a = "";
	}
	
	public Cliente(String nombre, String apellidos, String direccion, int numTarjeta, String dirEntrega, String email,
			String contrase�a, int numMovil) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.numTarjeta = numTarjeta;
		this.dirEntrega = dirEntrega;
		this.email = email;
		this.contrase�a = contrase�a;
		this.numMovil = numMovil;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumTarjeta() {
		return numTarjeta;
	}
	public void setNumTarjeta(int numTarjeta) {
		this.numTarjeta = numTarjeta;
	}
	
	public String getDirEntrega() {
		return dirEntrega;
	}

	public void setDirEntrega(String dirEntrega) {
		this.dirEntrega = dirEntrega;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public int getNumMovil() {
		return numMovil;
	}

	public void setNumMovil(int numMovil) {
		this.numMovil = numMovil;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", numTarjeta="
				+ numTarjeta + ", dirEntrega=" + dirEntrega + ", email=" + email + ", contrase�a=" + contrase�a
				+ ", numMovil=" + numMovil + "]";
	}	
}
