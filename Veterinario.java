import java.util.*;

class Veterinario extends Persona {
    private int numeroCedula;
    
        public Veterinario(String nombre, String paterno, String materno, Date fechaNacimiento, String curp, int numeroCedula) {
        super(nombre, paterno, materno, fechaNacimiento, curp);
        this.numeroCedula = numeroCedula;
    }
    
        public int getNumeroCedula() {
        return numeroCedula;
    }
    
        public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }
    
     @Override
    public String toString() {
        return "Veterinario" +
                "nombre='" + getNombre() + '\'' +
                ",Apellido paterno='" + getPaterno() + '\'' +
                ",Apellido materno='" + getMaterno() + '\'' +
                ", fechaNacimiento=" + getFechaNacimiento() +
                ", curp='" + getCurp() + '\'' +
                ", numeroCedula=" + numeroCedula ;
    }
}


