
    import java.util.Scanner;

public class SalarioSemanal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa las horas trabajadas esta semana: ");
        int horasTrabajadas = sc.nextInt();
        int salario = horasTrabajadas * 12;
        System.out.println("El salario semanal es: " + salario + " dolares8");
        sc.close();
    }
}


