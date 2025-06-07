import java.util.Scanner;
public class PiedraPapelTijera {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugador1 = sc.nextLine().toLowerCase();
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String jugador2 = sc.nextLine().toLowerCase();
        boolean jugadaValida1 = jugador1.equals("piedra") || jugador1.equals("papel") || jugador1.equals("tijera");
        boolean jugadaValida2 = jugador2.equals("piedra") || jugador2.equals("papel") || jugador2.equals("tijera");

        if (!jugadaValida1 || !jugadaValida2) {
            System.out.println("Error: uno o ambos jugadores han introducido una opción incorrecta.");
        } else {
            // Lógica del juego
            if (jugador1.equals(jugador2)) {
                System.out.println("Empate");
            } else if (
                (jugador1.equals("piedra") && jugador2.equals("tijera")) ||
                (jugador1.equals("papel") && jugador2.equals("piedra")) ||
                (jugador1.equals("tijera") && jugador2.equals("papel"))
            ) {
                System.out.println("Gana el jugador 1");
            } else {
                System.out.println("Gana el jugador 2");
            }
        }
        sc.close();
    }
}


