public class EjercicioPrubea {
    //Atributos
    public String nombre;
    public int edad;
    public String fecha_N;

    public EjercicioPrubea(String nombre, int edad, String fecha_N) {
        this.nombre = nombre;
        this.edad = edad;
        this.fecha_N = fecha_N;
    }

    public void saludar(){

        System.out.println("Hola a todos espero tengan un lindo dia");
    }

    public static void main(String[] args){

        EjercicioPrubea persona1 = new EjercicioPrubea("Migue",20,"2003/08/08");
        persona1.saludar();
        System.out.println(persona1.nombre);
        System.out.println(persona1.edad);
        System.out.println(persona1.fecha_N);
    }

}


