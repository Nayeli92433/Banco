import java.util.Scanner;

public class Menu {
    ConsultarSaldo consultarSaldo= new ConsultarSaldo();
    Depositar depositar= new Depositar();
    Retirar retirar= new Retirar();
    Transferir transferir = new Transferir();
    public void menuPrincipal(DatosUsuario usuario) {
        Scanner scanner = new Scanner(System.in);
        int Op;
        do {
            System.out.println("----------MENU PRINCIPAL----------");
            System.out.println("       [1].-Consultar saldo");
            System.out.println("       [2].-Depositar dinero");
            System.out.println("       [3].-Retirar dinero");
            System.out.println("       [4].-Transferir dinero");
            System.out.println("       [5].-Salir");
            Op = scanner.nextInt();
            switch (Op) {
                case 1:
                    consultarSaldo.saldoActual(usuario);
                    break;
                case 2:
                    depositar.depositarSaldo(usuario);
                    break;
                case 3:
                    retirar.retirarSaldo(usuario);
                    break;
                case 4:
                    transferir.transferirSaldo(usuario);
                    break;
                case 5:
                    System.out.println("----------------------------------------------");
                    System.out.println("            QUE TENGA UN BUEN DIA");
                    System.out.println("----------------------------------------------");
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (Op != 5);
    }
}
