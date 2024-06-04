public class Laptop implements IProducto {
    private String modelo;
    private String marca;
    private double precio;
    private int aniosGarantia;

    public Laptop(String modelo, String marca, double precio, int aniosGarantia) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.aniosGarantia = aniosGarantia;
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

    public int getAniosGarantia() {
        return aniosGarantia;
    }

    public void imprimeDetallesProducto() {
        System.out.println("\n------LAPTOP------ ");
        System.out.println("Modelo: "+ modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio);
        System.out.println("Años de Garantía: " + aniosGarantia);
    }
}
