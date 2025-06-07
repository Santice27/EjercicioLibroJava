public class MultiplosDe5While {
    public static void main(String[] args) {
        int i = 0; // Empezamos en 0

        while (i <= 100) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++; // Incrementamos i para no quedar en bucle infinito
        }
    }
}

    

