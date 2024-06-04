import java.util.ArrayList;
import java.util.List;

public class Tienda implements ITienda {
    private List<IProducto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(IProducto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        for (IProducto producto : productos) {
            producto.imprimeDetallesProducto();
        }
    }

    // obtener el precio promedio de todos los productos en la tienda
    public double obtenerPromedioPrecioProductos() {
        if (productos.isEmpty()) return 0; // Si no hay productos, retorna 0
        double suma = 0;
        // Suma los precios de todos los productos
        for (IProducto producto : productos) {
            suma += producto.getPrecio();
        }
        // retorna el promedio de los precios
        return suma / productos.size();
    }

    // obtener el producto más costoso de la tienda
    public IProducto obtenerProductoMasCostoso() {
        if (productos.isEmpty()) return null; // Si no hay productos, retorna null
        IProducto masCostoso = productos.get(0); // Asume que el primer producto es el más costoso inicialmente
        // recorre la lista de productos para encontrar el más costoso
        for (IProducto producto : productos) {
            if (producto.getPrecio() > masCostoso.getPrecio()) {
                masCostoso = producto;
            }
        }
        // retorna el producto más costoso
        return masCostoso;
    }

    // buscar un producto por nombre
    public Boolean buscarProductoPorNombre(String nombre) {
        // recorre la lista de productos
        for (IProducto producto : productos) {
            if (producto.getModelo().toLowerCase().contains(nombre.toLowerCase())) {
                return true; // si encuenrra una coincidenciaa retorna true
            }
        }
        return false;
    }
}
