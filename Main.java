public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Juan Perez", 1000.0, new ComisionPersonalizada());
        vendedor.mostrarDetalle();
    }
}