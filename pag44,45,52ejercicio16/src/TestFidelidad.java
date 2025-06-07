import java.util.Scanner;
public class TestFidelidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntos = 0;
        System.out.println("Contesta con 'true' para verdadero o 'false' para falso.");
        System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
        if (sc.nextBoolean()) puntos += 3;
        System.out.print("2. Ha aumentado sus gastos de vestuario: ");
        if (sc.nextBoolean()) puntos += 3;
        System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti: ");
        if (sc.nextBoolean()) puntos += 3;
        System.out.print("4. Ahora se arregla o se asea con más frecuencia: ");
        if (sc.nextBoolean()) puntos += 3;
        System.out.print("5. No te deja que mires la agenda de su teléfono móvil: ");
        if (sc.nextBoolean()) puntos += 3;
        System.out.print("6. Tiene llamadas que no quiere contestar cuando estás tú delante: ");
        if (sc.nextBoolean()) puntos += 3;
        System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: ");
        if (sc.nextBoolean()) puntos += 3;
        System.out.print("8. Muchos días viene tarde después de trabajar: ");
        if (sc.nextBoolean()) puntos += 3;
        System.out.print("9. Has notado que últimamente se perfuma más: ");
        if (sc.nextBoolean()) puntos += 3;
        System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
        if (sc.nextBoolean()) puntos += 3;
        System.out.println("\n--- Resultado del test ---");
        if (puntos <= 10) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        } else if (puntos <= 22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más.");
        }
        sc.close();
    }
}


