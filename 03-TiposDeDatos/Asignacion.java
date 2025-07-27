public class Asignacion {
    public static void main(String[] args) {
        int a =  10; //Asignación simple
        System.out.println("Aignación (=): " + a);

        a += 5; // Equivalente a: a = a + 5
        System.out.println("Suma y asignacion (+=): " + a);

        a -= 3; // Equivalente a: a = a -3
        System.out.println("Resta y asignacion (-=):"  + a);

        a *= 2; // Equivalente a: a = a * 2
        System.out.println("Multiplicacion y asignacion (*=): " + a);

        a /= 4; // Equivalente a: a = a /4
        System.out.println("Division y asignacion (/=): " + a);

        a %= 3; // Equivalente a: a = a % 3
        System.out.println("Modulo y asignacion (%=): " + a);
    }
}
