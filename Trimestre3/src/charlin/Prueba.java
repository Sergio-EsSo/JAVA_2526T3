package charlin;

public class Prueba {
		/**
		* Método main que crea una orden conformada por cuatro
		* productos con sus identificadores y cantidad. Luego, se añaden los
		* cuatro productos como línea de pedido a la orden y se calcula el
		* total de la orden
		*/
		
	public static void main(String[] args) {
		
		Producto producto1 = new Producto(1, "Carpeta", "Carpeta anillada metálica",1000);
		Producto producto2 = new Producto(2, "Tinta", "Tinta china de color negro.", 3000);
		//Producto producto3 = new Producto(3, "Cinta pegante", "Cinta adhesiva de color transparente.",800);
		Producto producto4 = new Producto(4, "Cartulina", "Pliego de cartulina 60x40 cm.",600);
		
		OrdenCompra orden = new OrdenCompra(12);
		
		orden.anadirItem(new LineaPedido(1, 5, producto1));
		orden.anadirItem(new LineaPedido(2, 3, producto2));
		orden.anadirItem(new LineaPedido(3, 2, producto1));
		orden.anadirItem(new LineaPedido(4, 4, producto4));
		//calc TOtal
		orden.calcularTotalOrden();
		//ves
		System.out.println(orden);
	}
}