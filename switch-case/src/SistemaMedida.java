public class SistemaMedida {
    public static void main(String[] args) throws Exception {
        String sigla = "P";
        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Medio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
        }
    }
}
