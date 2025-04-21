public class SentenciaFor {
    public static void main(String[] args) {
        System.out.println("Sentencia: For");
        int tabla = 2;
        for (int j = 1; j <= 5; j++) {
            System.out.printf("Tabla del: %d%n", j);

            for (int i = 0; i <= 10; i++) {
                //if (i % 2 == 0) {
                    //continue;
                    //break;
                //}
                System.out.printf("%d * %d = %d%n", j, i, (j * i));
            }
            System.out.println(" ");
        }
    }
}
