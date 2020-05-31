import java.util.List;

public class Venta {

	private Cliente cl;
	private List<Producto> prod;
	private Envio env;
	
	public Venta() {}
	
	public Venta(Cliente cl, List<Producto> prod, Envio env) {
		this.cl = cl;
		this.prod = prod;
		this.env = env;
	}
	
	public Cliente getCl() {
		return cl;
	}
	public void setCl(Cliente cl) {
		this.cl = cl;
	}
	public List<Producto> getProd() {
		return prod;
	}
	public void setProd(List<Producto> prod) {
		this.prod = prod;
	}
	public Envio getEnv() {
		return env;
	}
	public void setEnv(Envio env) {
		this.env = env;
	}

	@Override
	public String toString() {
		return "Venta [cl=" + cl + ", prod=" + prod + ", env=" + env + "]";
	}	
	
	public String generarTicket() {
		String res = "";
		
		res = "Ticket compra \n";
		for (Producto p : prod) {
			res += p.toString() + "\n";
		}
		if (this.cl != null) {
			res += this.cl.toString() + "\n";			
		}		
		res += "Precio total: " + precio() + " €";
		
		return res;
	}
	
	public double precio() {
		double precio = 0.0;
		for (Producto p : prod) {
			precio += p.getPrecio();
		}
		
		return precio;
	}
	
	public void reducirStock(int cantidad) {
		for (Producto p : prod) {
			p.reducirStock(cantidad);
		}
	}
	
	public String resumenVenta() {
		String res = "VENTA: ";
		
		for (Producto p : prod) {
			res += p.getNombre() + "; ";
		}
		
		return res;		
	}
	
}
