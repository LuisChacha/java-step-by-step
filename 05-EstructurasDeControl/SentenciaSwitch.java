public class SentenciaSwitch {

    public static void main(String[] args) {
        System.out.println("Sentencia Switch");
        int opcion = 2;
        switch (opcion) {
            case 0:
                System.out.println("Opcion 0");
                //break;
            case 1:
                System.out.println("Opcion 1");
                //break;
            case 2:
                System.out.println("Opcion 2");
                //break;
            case 3:
                System.out.println("Opcion 3");
                //break;
            case 4:
                System.out.println("Opcion 4");
                //break;
            default:
                System.out.println("Opcion default");
                //break;
        }

        int tipo = 80;
        switch (tipo) {
            case 0:
            case 1:
            case 2:
                System.out.println("Tipo es 1, 2, o 3");
                break;
            case 3:
                System.out.println("Tipo es 3");
            default:
                System.out.println("Tipo es mayor a 3");
                break;
        }

        String opt = "cuacua";
        switch (opt){
            case "uno":
                System.out.println("String es: uno");
                break;
            case "dos":
                System.out.println("String es: dos");
                break;
            case "tres":
                System.out.println("String es: tres");
                break;
            default:
                System.out.println("String es: Default");
                break;
        }
    }
}
