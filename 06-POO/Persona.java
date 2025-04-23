public class Persona {
    String nombre;
    int edad;
    char genero;

    Persona (){
        System.out.println("Constructor Persona");
    }

    Persona(String no, int ed, char ge){
        nombre = no;
        edad = ed;
        genero = ge;
    }

    void jugarVideojuegos(Persona p){
        System.out.println(nombre + " está jugando con " + p.nombre);
    }


    void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Luis", 41, 'M');
        //p1.nombre = "Luis";
        //p1.edad = 32;
        //p1.genero = 'M';
        p1.imprimirInformacion();

        Persona p2 = new Persona();
        p2.nombre = "Rosa";
        p2.edad = 33;
        p2.genero = 'F';
        p2.imprimirInformacion();

        p1.jugarVideojuegos(p2);

    }
}
