public class ConsultarSaldo {
    public void saldoActual(DatosUsuario usuario){
        System.out.println("----------------------------------------------");
        System.out.println("                 TUS DATOS");
        System.out.println("----------------------------------------------");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Saldo actual: "+ usuario.getSaldo());
        System.out.println("----------------------------------------------");
    }
}
