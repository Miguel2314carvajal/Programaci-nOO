public class Main {
    public static void main (String [] args){

        Empleado empleado1 = new Empleado("Mónica",450.00);
        System.out.println("La Empleada " + empleado1.nombre + " " + "tiene un Salario Base de " + empleado1.calcularSalario());

        Gerente gerente1 = new Gerente("Shamyr",450.00,100);
        System.out.println("El Gerente " + gerente1.nombre + " " + "tiene un bono de " + gerente1.bono + " " + "por ende su salario es de " + gerente1.calcularSalario());

        Desarrollador desarrollador1 = new Desarrollador("Freddy",450,10);
        System.out.println("El Desarrollador " + desarrollador1.nombre + " " + "tiene un Salario Base de " + desarrollador1.salarioBase
                + " " + "pero tiene " + desarrollador1.horasExtras + " horas extras suplementarias " + "por eso el Salario Total es de: " + desarrollador1.calcularSalario());

    }
}
