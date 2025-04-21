public class SentenciaFor {
    public static void main(String[] args) {
        System.out.println("Sentencia: For");
        int tabla = 2;
        tabla: for (int j = 1; j <= 5; j++) {
            System.out.printf("Tabla del: %d%n", j);

            digito: for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0) {
                    //continue;
                    break tabla;
                }
                System.out.printf("%d * %d = %d%n", j, i, (j * i));
            }
            System.out.println(" ");
        }
    }
}
