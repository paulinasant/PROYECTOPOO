import java.util.Date;

public class Gerente extends Persona {
    //private Sucursal sucursal;
    private int numeroGerente;

    public Gerente(String nombre, String paterno, String materno, Date fechaNacimiento, String curp,/* Sucursal sucursal,*/ int numeroGerente) {
        super(nombre, paterno, materno, fechaNacimiento, curp);
       /* this.sucursal = sucursal;*/
        this.numeroGerente = numeroGerente;
    }

/*
    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
*/
    public int getNumeroGerente() {
        return numeroGerente;
    }

    public void setNumeroGerente(int numeroGerente) {
        this.numeroGerente = numeroGerente;
    }

    @Override
    public String toString() {
        return "Gerente" +
                "nombre='" + getNombre() + '\'' +
                ", paterno='" + getPaterno() + '\'' +
                ", materno='" + getMaterno() + '\'' +
                ", fechaNacimiento=" + getFechaNacimiento() +
                ", curp='" + getCurp() + '\'' +
                /*", sucursal=" + sucursal +*/
                ", numeroGerente=" + numeroGerente;
    }
}
//falta sucursal 
//Crear el enum Sucursal
