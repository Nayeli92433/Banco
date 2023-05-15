import java.util.Scanner;

public class EntradaPrincipal {
    Scanner scanner = new Scanner(System.in);
    DarAcceso darAcceso= new DarAcceso();
    public void ingresarSistema(){
        DarAcceso darAcceso1 = darAcceso;
            System.out.println("------------------------              ----------------------");
            System.out.println("                      BIENVENIDO AL SISTEMA");
        System.out.println("------------------------              ----------------------");
            System.out.println("Ingresa tu NIP para poder acceder a las operaciones bancarias ");
            darAcceso.confirmarNip();
    }
}
