import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class exec {

	static Aplicacion app;
	static Scanner sc;
	
	public static void main (String[]args) {		
		app = new Aplicacion();
		sc = new Scanner(System.in);
		
		int accion = 99;
		while(true) {
			menu();
			accion = sc.nextInt();
			
			switch (accion) {
			case 0:
				System.exit(0);
				break;
			case 1:
				altaProducto();
				break;
			case 2:
				bajaProducto();
				break;
			case 3:
				modificarProducto();
				break;
			case 4:
				altaCliente();
				break;
			case 5:
				bajaCliente();
				break;
			case 6:
				modificarCliente();
				break;
			case 7:
				listadoVentas();
				break;
			case 8:
				listadoProductosSinStock();
				break;
			case 9:
				compraPresencialSinTarjeta();
				break;
			case 10:
				compraPresencialConTarjeta();
				break;
			case 11:
				compraOnline();
				break;
			default:
				break;
			}
		}		
	}
	
	public static void menu() {
		System.out.println("***********************************************");
		System.out.println("Seleccionar accion");
		System.out.println("1. Alta producto");
		System.out.println("2. Baja producto");
		System.out.println("3. Modificacion producto");
		System.out.println("4. Alta cliente");
		System.out.println("5. Baja cliente");
		System.out.println("6. Modificacion cliente");
		System.out.println("7. Listado ventas");
		System.out.println("8. Listado productos sin stock");
		System.out.println("9. Compra presencial sin tarjeta");
		System.out.println("10. Compra presencial con tarjeta");
		System.out.println("11. Compra online");
		System.out.println("0. Cerrar");
		System.out.println("***********************************************");
	}
	
	//PRODUCTOS
	public static void altaProducto() {
		System.out.println("Nombre: ");
		String nombre = sc.next();
		System.out.println("Categoria: ");
		String categoria = sc.next();
		System.out.println("Precio: ");
		double precio = sc.nextDouble();
		System.out.println("Stock: ");
		int stock = sc.nextInt();
		Producto p = new Producto(nombre, categoria, precio, stock);
		app.altaProducto(p);
	}
	
	public static void bajaProducto() {
		System.out.println(app.listadoProductos());
		System.out.println("Seleccione un producto (escriba el nombre): ");
		System.out.println("Nombre: ");
		String nombre = sc.next();
		Producto p = app.buscarProducto(nombre);
		if (p != null) {
			app.eliminarProducto(p);
			System.out.println("Producto eliminado.");
		}
		else {
			System.out.println("No ha seleccionado bien el producto.");
		}
	}
	
	public static void modificarProducto() {
		System.out.println(app.listadoProductos());
		System.out.println("Seleccione un producto (escriba el nombre): ");
		System.out.println("Nombre: ");
		String nombre = sc.next();
		Producto p = app.buscarProducto(nombre);
		if (p != null) {
			System.out.println("Producto encontrado.");
			System.out.println(p.toString());
			System.out.println("Introduzca nuevos valores");
			System.out.println("Nombre: ");
			nombre = sc.next();
			System.out.println("Categoria: ");
			String categoria = sc.next();
			System.out.println("Precio: ");
			double precio = sc.nextDouble();
			System.out.println("Stock: ");
			int stock = sc.nextInt();
			p.setNombre(nombre);
			p.setCategoria(categoria);
			p.setPrecio(precio);
			p.setStock(stock);
			System.out.println("Producto modificado.");
		}
		else {
			System.out.println("No ha seleccionado bien el producto.");
		}
	}
	
	//CLIENTES
	public static void altaCliente() {
		System.out.println("Nombre: ");
		String nombre = sc.next();
		System.out.println("Apellidos: ");
		String apellidos = sc.next();
		System.out.println("Direccion: ");
		String direccion = sc.next();
		System.out.println("Numero Tarjeta: ");
		int numTarjeta = sc.nextInt();
		System.out.println("Direccion entrega: ");
		String dirEntrega = sc.next();
		System.out.println("Email: ");
		String email = sc.next();
		System.out.println("Contraseña: ");
		String contraseña = sc.next();
		System.out.println("Numero de movil: ");
		int numMovil = sc.nextInt();
		Cliente c = new Cliente(nombre, apellidos, direccion, numTarjeta, dirEntrega, email, contraseña, numMovil);
		app.altaCliente(c);
	}
	
	public static void bajaCliente() {
		System.out.println(app.listadoClientes());
		System.out.println("Seleccione un cliente (escriba el nombre): ");
		System.out.println("Nombre: ");
		String nombre = sc.next();
		Cliente p = app.buscarCliente(nombre);
		if (p != null) {
			app.eliminarCliente(p);
			System.out.println("Cliente eliminado.");
		}
		else {
			System.out.println("No ha seleccionado bien el cliente.");
		}
	}
	
	public static void modificarCliente() {
		System.out.println(app.listadoClientes());
		System.out.println("Seleccione un cliente (escriba el nombre): ");
		System.out.println("Nombre: ");
		String nombre = sc.next();
		Cliente p = app.buscarCliente(nombre);
		if (p != null) {
			System.out.println("Cliente encontrado.");
			System.out.println(p.toString());
			System.out.println("Introduzca nuevos valores");
			System.out.println("Nombre: ");
			nombre = sc.next();
			System.out.println("Apellidos: ");
			String apellidos = sc.next();
			System.out.println("Direccion: ");
			String direccion = sc.next();
			System.out.println("Numero Tarjeta: ");
			int numTarjeta = sc.nextInt();
			System.out.println("Direccion entrega: ");
			String dirEntrega = sc.next();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Contraseña: ");
			String contraseña = sc.next();
			System.out.println("Numero de movil: ");
			int numMovil = sc.nextInt();
			p.setNombre(nombre);
			p.setApellidos(apellidos);
			p.setDireccion(direccion);
			p.setNumTarjeta(numTarjeta);
			p.setDirEntrega(dirEntrega);
			p.setEmail(email);
			p.setContraseña(contraseña);
			p.setNumMovil(numMovil);
			System.out.println("Cliente modificado.");
		}
		else {
			System.out.println("No ha seleccionado bien el producto.");
		}
	}
	
	//LISTADO VENTAS
	public static void listadoVentas() {
		System.out.println(app.listadoVentas());
	}
	
	//LISTADO PRODUCTOS SIN STOCK
	public static void listadoProductosSinStock() {
		System.out.println(app.productosSinStock());
	}
	
	//COMPRAS
	public static void compraPresencialSinTarjeta() {
		Venta v = new Venta();
		List<Producto> prods = new LinkedList<Producto>();
		System.out.println(app.listadoProductos());
		String nombre = "";
		while (true) {
			System.out.println("Añada un producto (escriba el nombre): ");
			System.out.println("Para realizar la venta escriba VENTA: ");
			nombre = sc.next();
			if (nombre.equals("VENTA")) {
				v.setProd(prods);
				app.añadirVenta(v);
				System.out.println("Venta efectuada. Aquí tiene su ticket.");
				app.generarTicket(v);
				break;
			}
			else {
				Producto p = app.buscarProducto(nombre);
				if (p != null) {
					prods.add(p);
					System.out.println("Producto añadido.");
				}
				else {
					System.out.println("No se ha encontrado el producto, escoja otro.");
				}
			}
		}		
	}
	
	public static void compraPresencialConTarjeta() {
		Venta v = new Venta();
		System.out.println(app.listadoClientesConTarjeta());
		System.out.println("Seleccione un cliente (escriba el nombre): ");
		System.out.println("Nombre: ");
		String nombreCliente = sc.next();
		Cliente p = app.buscarCliente(nombreCliente);
		if (p != null) {
			v.setCl(p);
			List<Producto> prods = new LinkedList<Producto>();
			System.out.println(app.listadoProductos());
			String nombre = "";
			while (true) {
				System.out.println("Añada un producto (escriba el nombre): ");
				System.out.println("Para realizar la venta escriba VENTA: ");
				nombre = sc.next();
				if (nombre.equals("VENTA")) {
					v.setProd(prods);
					app.añadirVenta(v);
					System.out.println("Venta efectuada. Aquí tiene su ticket.");
					app.generarTicket(v);
					break;
				}
				else {
					Producto pr = app.buscarProducto(nombre);
					if (pr != null) {
						prods.add(pr);
						System.out.println("Producto añadido.");
					}
					else {
						System.out.println("No se ha encontrado el producto, escoja otro.");
					}
				}
			}
		}
		else {
			System.out.println("No se ha seleccionado bien el cliente.");
		}		
	}
	
	public static void compraOnline() {
		Venta v = new Venta();
		System.out.println(app.listadoClientesParaVentaOnline());
		System.out.println("Seleccione un cliente (escriba el nombre): ");
		System.out.println("Nombre: ");
		String nombreCliente = sc.next();
		Cliente p = app.buscarCliente(nombreCliente);
		if (p != null) {
			v.setCl(p);
			List<Producto> prods = new LinkedList<Producto>();
			System.out.println(app.listadoProductos());
			String nombre = "";
			while (true) {
				System.out.println("Añada un producto (escriba el nombre): ");
				System.out.println("Para realizar la venta escriba VENTA: ");
				nombre = sc.next();
				if (nombre.equals("VENTA")) {
					v.setProd(prods);
					v.setEnv(new Envio("cobrado"));
					app.añadirVenta(v);
					System.out.println("Venta efectuada. Aquí tiene su ticket.");
					app.generarTicket(v);
					break;
				}
				else {
					Producto pr = app.buscarProducto(nombre);
					if (pr != null) {
						prods.add(pr);
						System.out.println("Producto añadido.");
					}
					else {
						System.out.println("No se ha encontrado el producto, escoja otro.");
					}
				}
			}
		}
		else {
			System.out.println("No se ha seleccionado bien el cliente.");
		}		
	}
}
