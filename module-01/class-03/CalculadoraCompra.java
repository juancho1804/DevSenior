import java.util.Scanner;

public class CalculadoraCompra {
    public static void main(String[] args) {
        final double TASA_IMPUESTO = 0.15; // 15% de impuesto
        // Dentro del método main, después de la constante
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de Compra ---");

        System.out.print("Ingrese el precio unitario del artículo: ");
        var precioUnitario = scanner.nextDouble(); // Infiere double

        System.out.print("Ingrese la cantidad de artículos: ");
        var cantidad = scanner.nextInt(); // Infiere int

        System.out.print("Ingrese la cantidad pagada por el cliente: ");
        var cantidadPagada = scanner.nextDouble(); // Infiere double

        // IMPORTANTE: Consumir el salto de línea después del último nextInt() o
        // nextDouble()
        scanner.nextLine();

        // Dentro del método main, después de la entrada de datos

        // Cálculos
        var subtotal = precioUnitario * cantidad;
        var montoImpuesto = subtotal * TASA_IMPUESTO;
        var totalCompra = subtotal + montoImpuesto;
        var cambio = cantidadPagada - totalCompra;

        // Dentro del método main, después de los cálculos

        System.out.println("\n--- Resumen de la Compra ---"); // \n para un salto de línea

        // Usamos %.2f para formatear a 2 decimales y %n para el salto de línea
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Impuesto (%.0f%%): $%.2f%n", TASA_IMPUESTO * 100, montoImpuesto); // Mostrar tasa como
                                                                                             // porcentaje
        System.out.printf("Total de la Compra: $%.2f%n", totalCompra);
        System.out.printf("Cantidad Pagada: $%.2f%n", cantidadPagada);
        System.out.printf("Cambio: $%.2f%n", cambio);

        System.out.println("----------------------------");

        // Dentro del método main, después de mostrar resultados
        System.out.println("¡Gracias por su compra!");

        // Cierra el objeto Scanner para liberar recursos
        scanner.close();

    }

}
