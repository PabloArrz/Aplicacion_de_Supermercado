
public class Producto {

	private String nombre;
	private String categoria;
	private double precio;
	private int stock;
	
	public Producto() {};
	
	public Producto(String nombre, String categoria, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", stock=" + stock
				+ "]";
	}
	
	public boolean hayStock() {
		if (this.stock <= 0) {
			return false;
		}
		else {
			return true;
		}
	}	
	
	public void reducirStock(int cantidad) {
		this.stock = this.stock - cantidad;
		if (this.stock < 0) {
			this.stock = 0;
		}
	}
	
	public void aumentarStock(int cantidad) {
		this.stock = this.stock + cantidad;
	}
}
