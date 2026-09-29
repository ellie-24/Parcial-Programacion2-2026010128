public class Main {

    public static void main(String[] args) {

        EstrategiaComision estrategia = new ComisionEstandar();
        //creando conflictos a proposito

        Vendedor vendedor = new Vendedor(
            "Ellie",
            1500,
            estrategia
        );

        vendedor.mostrarDetalle();
    }
}