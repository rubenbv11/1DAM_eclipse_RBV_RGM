import java.util.Scanner;

public class Extra1_RBV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del primer producto: ");
        double producto1 = scanner.nextDouble();

        System.out.print("Ingrese el precio del segundo producto: ");
        double producto2 = scanner.nextDouble();

        System.out.print("Ingrese el precio del tercer producto: ");
        double producto3 = scanner.nextDouble();

        double descuento1 = calcularDescuento(producto1);
        double descuento2 = calcularDescuento(producto2);
        double descuento3 = calcularDescuento(producto3);

        double precioSinDescuento = producto1 + producto2 + producto3;
        double precioConDescuento = precioSinDescuento - (descuento1 + descuento2 + descuento3);
        double ahorroTotal = descuento1 + descuento2 + descuento3;

        System.out.println("---------------------------");
        System.out.printf("Precio a pagar sin descuento: %.2f euros%n", precioSinDescuento);
        System.out.printf("Precio a pagar con descuento: %.2f euros%n", precioConDescuento);
        System.out.printf("Con un ahorro de %.2f euros%n", ahorroTotal);

        scanner.close();
    }

    public static double calcularDescuento(double precio) {
        return precio < 50 ? precio * 0.08 : precio * 0.10;
    }
}

