public class ComisionPersonalizada implements EstrategiaComision {
    @Override
    public double calcularComision(double montoVenta) {
        // Cambia el 6 si tu primer nombre no tiene 6 letras:
        double porcentaje = (5 + 6) / 100.0; 
        return montoVenta * porcentaje;
    }
}