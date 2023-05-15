import java.util.Scanner;
public class DarAcceso {
    Menu menu = new Menu();
    Scanner scanner= new Scanner(System.in);
    public void confirmarNip() {
        int NIP = scanner.nextInt();
        EntradaPrincipal entradaPrincipal= new EntradaPrincipal();
        DatosUsuario usuario = new DatosUsuario(1234, "Ana",000);

        if (NIP == usuario.getClave()) {
            System.out.println("----------------------------------------------");
            System.out.println("                 BIEVENIDO " + usuario.getNombre());
            System.out.println("----------------------------------------------");
            menu.menuPrincipal(usuario);
        } else {
            System.out.println("----------------------------------------------");
            System.out.println("                    ERROR");
            System.out.println("               Vuleve a intentarlo");
            System.out.println("----------------------------------------------");
            entradaPrincipal.ingresarSistema();
        }
    }
}
