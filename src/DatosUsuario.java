public class DatosUsuario {
    int clave;
    String nombre;
    int saldo;

    public DatosUsuario(int clave, String nombre, int saldo) {
        this.clave = clave;
        this.nombre = nombre;
        this.saldo = saldo;
    }


    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSaldo() {
        return saldo;
    }
}
