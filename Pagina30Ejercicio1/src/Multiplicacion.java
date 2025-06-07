
    import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer datos del teclado
        Scanner sc = new Scanner(System.in);

        // Pedimos el primer número al usuario
        System.out.print("Ingresa el primer número: ");
        int numero1 = sc.nextInt();

        // Pedimos el segundo número al usuario
        System.out.print("Ingresa el segundo número: ");
        int numero2 = sc.nextInt();

        // Calculamos la multiplicación
        int resultado = numero1 * numero2;

        // Mostramos el resultado por pantalla
        System.out.println("El resultado de la multiplicación es: " + resultado);

        // Cerramos el scanner
        sc.close();
    }

    }

