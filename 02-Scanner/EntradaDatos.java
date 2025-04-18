
import java.util.Scanner;

public class EntradaDatos {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre: ");
            String nombre = sc.nextLine();

            System.out.printf("Es un gusto conocerte: %s%n", nombre);
        }
    }
}
