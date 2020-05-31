import java.util.LinkedList;
import java.util.List;

public class Aplicacion {

	private List<Producto> productos;
	private List<Cliente> clientes;
	private List<Venta> ventas;
	
	public Aplicacion() {
		this.productos = generarProductosIniciales();
		this.clientes = new LinkedList<Cliente>();
		this.ventas = new LinkedList<Venta>();
	}
	
	public Aplicacion(List<Producto> productos, List<Cliente> clientes) {
		this.productos = productos;
		this.clientes = clientes;
		this.ventas = new LinkedList<Venta>();
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Aplicacion [productos=" + productos + ", clientes=" + clientes + "]";
	}
	
	public void altaProducto(Producto p) {
		productos.add(p);
	}
	
	public void eliminarProducto(Producto p) {
		productos.remove(p);
	}
	
	public void modificarProducto(Producto p) {
		for (Producto pr : productos) {
			if (pr.getNombre().equals(p.getNombre())) {
				pr = p;
				break;
			}
		}
	}
	
	public void altaCliente(Cliente c) {
		clientes.add(c);
	}
	
	public void eliminarCliente(Cliente p) {
		clientes.remove(p);
	}
	
	public void modificarCliente(Cliente p) {
		for (Cliente pr : clientes) {
			if (pr.getNombre().equals(p.getNombre()) && pr.getApellidos().equals(p.getApellidos())) {
				pr = p;
				break;
			}
		}
	}
	
	/**
	 * @param p Una lista de productos que se asociará a la venta
	 * @param c El cliente que se asociará a la venta
	 * @return An Venta data type.
	 * */
	public Venta generarVentaPresencial(List<Producto> p, Cliente c) {
		Venta v = new Venta(c, p, null);
		ventas.add(v);
		v.reducirStock(1);
		
		return v;
	}
	
	public void generarTicket(Venta v) {
		System.out.println(v.generarTicket());		
	}
	
	public String listadoVentas() {
		String res = "";
		
		for (Venta v : ventas) {
			res += v.resumenVenta() + "\n";
		}
		
		return res;
	}
	
	public String productosSinStock() {
		String res = "";
		
		for (Producto p : productos) {
			if (!p.hayStock()) {
				res += p.toString() + "\n";
			}
		}
		
		return res;
	}
	
	public List<Producto> generarProductosIniciales() {
		List<Producto> l = new LinkedList<Producto>();
		
		Producto p1 = new Producto("Queso", "Lacteos", 2.3, 3);
		Producto p2 = new Producto("Macarrones", "Pasta", 1.5, 5);
		Producto p3 = new Producto("Agua", "Bebida", 5, 6);
		
		l.add(p1); l.add(p2); l.add(p3);
		
		return l;
	}
	
	public String listadoProductos() {
		String res = "";
		
		for (Producto p : productos) {
			res += p.toString() + "\n";
		}
		
		return res;
	}
	
	public String listadoClientes() {
		String res = "";
		
		for (Cliente p : clientes) {
			res += p.toString() + "\n";
		}
		
		return res;
	}
	
	public String listadoClientesConTarjeta() {
		String res = "";
		
		for (Cliente p : clientes) {
			if (p.getNumTarjeta() != -1) {
				res += p.toString() + "\n";
			}			
		}
		
		return res;
	}
	
	public String listadoClientesParaVentaOnline() {
		String res = "";
		
		for (Cliente p : clientes) {
			if (!p.getEmail().isEmpty()) {
				res += p.toString() + "\n";
			}			
		}
		
		return res;
	}
	
	public Producto buscarProducto(String nombre) {
		Producto res = null;
		
		for (Producto  p : productos) {
			if (p.getNombre().equals(nombre)) {
				res = p;
				break;
			}
		}
		
		return res;
	}
	
	public Cliente buscarCliente(String nombre) {
		Cliente res = null;
		
		for (Cliente  p : clientes) {
			if (p.getNombre().equals(nombre)) {
				res = p;
				break;
			}
		}
		
		return res;
	}
	
	public void añadirVenta(Venta v) {
		ventas.add(v);
	}
}
