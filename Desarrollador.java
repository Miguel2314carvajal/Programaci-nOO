public class Desarrollador extends Empleado {
    //Atributos solo de la clase Desarrollador
    public int horasExtras;

    public Desarrollador(String nombre, double salarioBase, int horasExtras) {
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override //Sirve para sobreescribir

    public double calcularSalario(){
        return super.calcularSalario() + (horasExtras * 2.82 );
        //De igual manera coloque super.calcularSalario porque ese valor esta en la clase Empleado asi que lo heredo y solo aumento
        //lo que me hace falta que son las horasExtras.
    }
}

