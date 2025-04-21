public class SentenciaFor {
    public static void main(String[] args) {
        System.out.println("Sentencia: For");
        int tabla = 2;
        for (int i = 0; i <= 10; i++) {
            if (i%2==0){
                continue;
                //break;
            }
            System.out.printf("%d * %d = %d%n", tabla, i, (tabla*i));
        }
    }
}
