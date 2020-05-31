
public class Cliente {

	private String nombre;
	private String apellidos;
	private String direccion;
	private int numTarjeta;
	private String dirEntrega;
	private String email;
	private String contraseña;
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
		this.contraseña = "";
	}
	
	public Cliente(String nombre, String apellidos, String direccion, int numTarjeta, String dirEntrega, String email,
			String contraseña, int numMovil) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.numTarjeta = numTarjeta;
		this.dirEntrega = dirEntrega;
		this.email = email;
		this.contraseña = contraseña;
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

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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
				+ numTarjeta + ", dirEntrega=" + dirEntrega + ", email=" + email + ", contraseña=" + contraseña
				+ ", numMovil=" + numMovil + "]";
	}	
}
