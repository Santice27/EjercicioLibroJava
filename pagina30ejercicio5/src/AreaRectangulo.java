// Nombre del archivo: AreaRectangulo.java
// Descripción: Este programa calcula el área de un rectángulo dado su base y altura.
    import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la base del rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = sc.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
        sc.close();
    }
}


