import java.util.Scanner;
/**
 * Este programa solicita al usuario ingresar tres números enteros y los ordena de menor a mayor.
 * Utiliza estructuras de control para determinar el orden correcto de los números.
 */
public class OrdenarTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int num3 = sc.nextInt();
        int menor, medio, mayor;
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                medio = num2;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                medio = num1;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                medio = num1;
                mayor = num2;
            } else {
                medio = num2;
                mayor = num1;
            }
        }
        System.out.println("Números ordenados de menor a mayor:");
        System.out.println(menor + " " + medio + " " + mayor);
        sc.close();
    }
}

