import java.util.Scanner;

public class AplicacionBancoConsola {
    final static String CUENTA = "12345";
    final static String CLAVE = "2026";
    static double saldo = 1000000;
    final static Scanner scanner = new Scanner(System.in);
    static int intentos = 0;

    public static void main(String[] args) {

        intentos = 0;
        do {
            System.out.println("Inicio de sesion \nIngrese su numero de cuenta");
            String cuenta = scanner.next();
            System.out.println("Ingrese su clave");
            String clave = scanner.next();

            if (iniciarSesion(cuenta, clave) == true) {
                System.out.println("Ingresando al sistema");
                desplegarMenu();

            }

        } while (intentos <= 3);
        System.out.println("Ha excedido el número de intentos. Cuenta bloqueada.");

    }

    public static boolean iniciarSesion(String cuenta, String clave) {
        boolean bandera = true;
        if (!cuenta.equals(CUENTA) || !clave.equals(CLAVE)) {
            bandera = false;
            intentos++;
        }

        return bandera;
    }

    public static void desplegarMenu() {
        int opcion;
        do {
            System.out.println(
                    "1. Consultar saldo\n2. Transferir dinero\n3. Retirar dinero\n4. Salir \nIngrese una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    System.out.println("Ingrese la cuenta destino");
                    String cuentaDestino = scanner.next();
                    System.out.println("Ingrese el monto a transferir");
                    double monto = scanner.nextDouble();

                    transferirDinero(cuentaDestino, monto);
                    break;

                case 3:
                    System.out.println("Ingrese el monto a retirar");
                    monto = scanner.nextDouble();
                    retirarDinero(monto);
                    break;
                case 4:
                    System.out.println("Gracias por usar Banco DevSenior\n"
                            + "Saldo final: $" + saldo + "\nSesion finalizada");
                    return;
                default:
                    break;
            }
        } while (opcion != 4);
    }

    public static void consultarSaldo() {
        System.out.println("Su saldo actual es: $" + saldo);
    }

    public static void transferirDinero(String cuentaDestino, double monto) {
        if (cuentaDestino.isBlank()) {
            System.out.println("La cuenta destino no puede ser vacia");
            return;
        }
        if (monto > saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }
        saldo -= monto;
        System.out.println("Transferencia realizada con exito");
        consultarSaldo();
    }

    public static void retirarDinero(double monto) {
        if (monto > saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }
        saldo -= monto;
        System.out.println("Retiro realizado con exito");
        consultarSaldo();
    }

}