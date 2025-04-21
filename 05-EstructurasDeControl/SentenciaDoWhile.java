import java.sql.SQLOutput;

public class SentenciaDoWhile {
    public static void main(String[] args) {
        int x=3;
        do{
            System.out.println(x);
            x++;
        }while(x<=5);
        System.out.println("Fin de la ejecucion");
    }
}
