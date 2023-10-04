public class ExemploBreakContinue {
    public static void main(String[] args) {

        // continua mesmo após cumprir o if
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;

            System.out.println(numero);
        }

        // para ao chegar na condição informada
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break;

            System.out.println(numero);
        }

    }
}
