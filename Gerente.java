public class Gerente extends Empleado{

    public int bono;

    public Gerente(String nombre, double salarioBase, int bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }
    @Override
    public double calcularSalario(){
        return super.calcularSalario() + bono;
        //Coloque super.calcularSalario porque ese valor esta en la clase Empleado asi que lo heredo y solo aumento
        //lo que me hace falta que es el bono
     }
}
