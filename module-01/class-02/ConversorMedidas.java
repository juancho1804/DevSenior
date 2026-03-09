import java.util.Scanner;

public class ConversorMedidas {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // Definicion de constantes
        final double CM_POR_METRO = 100.0;
        final double LIBRAS_POR_KG = 2.20462;
        final double FACTOR_CELSIUS_FAHRENHEIT = 1.8;
        final double OFFSET_FAHRENHEIT = 32.0;

        System.out.println("--- Bienvenido al Conversor de Medidas ! --- \nIngrese la cantidad en metros: ");
        double metros = scanner.nextDouble();
        System.out.printf("%.1f metros equivalen a %.1f centímetros \n Ingrese la cantidad en kilogramos: ",
                metros, (metros * CM_POR_METRO));
        double kilogramos = scanner.nextDouble();
        System.out.printf("%.1f kilogramos equivalen a %.2f libras \nIngrese la temperatura en grados Celsius: ",
                kilogramos, (kilogramos * LIBRAS_POR_KG));
        double celsius = scanner.nextDouble();
        System.out.printf("%.1f grados Celsius equivalen a %.1f grados Fahrenheit",
                celsius, ((celsius * FACTOR_CELSIUS_FAHRENHEIT) + OFFSET_FAHRENHEIT));

        System.out.println("--- Conversiones completadas. Gracias! ---");

    }

}