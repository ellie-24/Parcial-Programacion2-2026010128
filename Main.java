public class Main {

    public static void main(String[] args) {

        EstrategiaComision estrategia = new ComisionEstandar();

        Vendedor vendedor = new Vendedor(
            "Ellie",
            1500,
            estrategia
        );

        vendedor.mostrarDetalle();
    }
}