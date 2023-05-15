import java.util.Scanner;

public class Retirar {

    public void retirarSaldo(DatosUsuario usuario) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------");
        System.out.println("               RETIRAR SALDO");
        System.out.println("----------------------------------------------");
        System.out.println("Saldo actual: " + usuario.getSaldo());
        System.out.println("----------------------------------------------");
        System.out.println("Ingresa la cantidad que deseas retirar:");
        int retiro = scanner.nextInt();
        int saldoFinal = usuario.getSaldo() - retiro;

        if (usuario.getSaldo() > retiro) {
            usuario.setSaldo(saldoFinal);
            System.out.println("----------------------------------------------");
            System.out.println("       SALDO ACTUALIZADO CON ÉXITO");
            System.out.println("----------------------------------------------");
            System.out.println("Nuevo saldo: " + usuario.getSaldo());
            System.out.println("----------------------------------------------");
        } else {
            System.out.println("----------------------------------------------");
            System.out.println("            SALDO INSUFICIENTE");
            System.out.println("----------------------------------------------");
        }

    }
}

