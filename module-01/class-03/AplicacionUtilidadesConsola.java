import java.util.Scanner;

public class AplicacionUtilidadesConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menuPrincipal(scanner);
    }

    public static void menuPrincipal(Scanner scanner) {
        int opcion = 0;
        do {
            System.out.println("--MENU PRINCIPAL--");
            System.out.println("1. Calcular area figura (circulo o rectangulo)");
            System.out.println("2. Calcular edad futura");
            System.out.println("3. Verificar si un numero es primo");
            System.out.println("4. Salir del programa");
            System.out.println("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    subMenuCalcularAreaFigura(scanner);
                    break;
                case 2:
                    calcularEdadFutura(scanner);
                    break;
                case 3:
                    verificarPrimo(scanner);
                    break;
                case 4:
                    System.out.println("Ha salido del programa...");
                    return;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }

        } while (opcion != 4);

    }

    public static void verificarPrimo(Scanner scanner) {
        boolean esPrimo = true;
        System.out.println("Ingrese el numero: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        String respuesta = (esPrimo) ? " si es primo" : " no es primo";
        System.out.println(numero + respuesta);
    }

    public static void calcularEdadFutura(Scanner scanner) {
        System.out.println("Ingrese su edad actual: ");
        int anioNacimiento = 2026 - scanner.nextInt();
        System.out.println("Ingrese el año del cual desea saber su edad: ");
        int anioFuturo = scanner.nextInt();
        if (anioFuturo < 2026) {
            System.out.println("Anio no valido, debe ser mayor que 2026");
        } else {
            System.out.println("Su edad en " + anioFuturo + " sera " + (anioFuturo - anioNacimiento));
        }
    }

    public static void subMenuCalcularAreaFigura(Scanner scanner) {
        int opcion = 0;
        while (opcion != 3) {
            System.out.println(
                    "--Elija la figura para calcular su area: \n1. Circulo\n2. Rectangulo\n3. Volver al menu principal");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el radio del circulo: ");
                    System.out.println("El area del circulo es: " + calcularAreaCirculo(scanner.nextDouble()));
                    break;
                case 2:
                    System.out.println("Ingrese la base del rectangulo: ");
                    double base = scanner.nextDouble();
                    System.out.println("Ingrese la altura del rectangulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("El area del rectangulo es : " + calcularAreaRectangulo(base, altura));
                    break;
                case 3:
                    System.out.println("Volviendo al menu principal...");
                    return;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }

        }

    }

    public static double calcularAreaCirculo(double radio) {
        final double PI = 3.14159265359;
        return PI * radio;
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

}