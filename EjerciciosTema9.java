public class EjerciciosTema9 {
    public static void main(String[] args) {

        cliente Juanito=new cliente();
        Juanito.edad= 20;
        Juanito.nombre="juanito";
        Juanito.telefono=653653653;
        Juanito.credito=5000;

        System.out.println("La edad del cliente es:"+ Juanito.edad);
        System.out.println("El nombre del cliente es:"+ Juanito.nombre);
        System.out.println("El telefono del cliente es:"+ Juanito.telefono);
        System.out.println("El credito del cliente es:"+ Juanito.credito + " € " );

        System.out.println("");
        System.out.println("");

        trabajador Pepito=new trabajador();
        Pepito.edad= 20;
        Pepito.nombre="pepito";
        Pepito.telefono=653653653;
        Pepito.salario=2000;

        System.out.println("La edad del trabajador es:"+ Pepito.edad);
        System.out.println("El nombre del trabajador es:"+ Pepito.nombre);
        System.out.println("El telefono del trabajador es:"+ Pepito.telefono);
        System.out.println("El salario del trabajador es:"+ Pepito.salario + " € " );

    }
 static class Persona{
        int edad;
        String nombre;
        int telefono;

    }

   static class cliente extends Persona{
        int credito;
    }

   static class trabajador extends Persona{
        int salario;

    }


}
