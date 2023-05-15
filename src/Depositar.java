import java.util.Scanner;

public class Depositar {
    Scanner scanner = new Scanner(System.in);
    public void depositarSaldo(DatosUsuario usuario) {
        System.out.println("----------------------------------------------");
        System.out.println("               DEPOSITAR SALDO");
        System.out.println("----------------------------------------------");
        System.out.println("Saldo actual: " + usuario.getSaldo());
        System.out.println("----------------------------------------------");

        System.out.println("Ingresa la cantidad que deseas depositar:");
        int deposito = scanner.nextInt();
        int saldoFinal = deposito + usuario.getSaldo();

        usuario.setSaldo(saldoFinal);
        System.out.println("----------------------------------------------");
        System.out.println("       SALDO ACTUALIZADO CON ÉXITO");
        System.out.println("----------------------------------------------");
        System.out.println("Nuevo saldo: " + usuario.getSaldo());
        System.out.println("----------------------------------------------");
    }
}

