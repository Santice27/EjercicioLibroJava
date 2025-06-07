public class MultiplosDe5DoWhile {
    public static void main(String[] args) {
        int i = 0; // Empezamos en 0

        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++; // Incrementamos para evitar bucle infinito
        } while (i <= 100);
    }
}

