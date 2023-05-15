import java.util.Scanner;

public class Transferir {

    public void transferirSaldo(DatosUsuario usuario){
        Scanner scanner= new Scanner(System.in);

        System.out.println("----------------------------------------------");
        System.out.println("               TRANSFERIR SALDO");
        System.out.println("----------------------------------------------");
        System.out.println("Saldo actual: " + usuario.getSaldo());
        System.out.println("----------------------------------------------");

        System.out.println("Ingresa la cantidad que deseas Transferir:");
        int transferencia = scanner.nextInt();
        int saldoFinal = usuario.getSaldo()- transferencia;

        if (usuario.getSaldo() > transferencia) {
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
