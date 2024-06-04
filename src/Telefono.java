public class Telefono implements IProducto {
    private String modelo;
    private String marca;
    private double precio;

    public Telefono(String modelo, String marca, double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void imprimeDetallesProducto() {
        System.out.println("\n------TELEFONO------ ");
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio);

    }
}
