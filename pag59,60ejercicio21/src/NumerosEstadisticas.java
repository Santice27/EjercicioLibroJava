
public class NumerosEstadisticas {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int contador = 0;
        int sumaImpares = 0;
        int contadorImpares = 0;
        int mayorPar = Integer.MIN_VALUE; 
        System.out.println("Introduce números (negativo para terminar):");
        while (true) {
            int num = sc.nextInt();
            if (num < 0) {
                break; 
            }
            contador++; 
        if (num % 2 == 0) {
            if (num > mayorPar) {
                mayorPar = num;
            }
        } else {
            sumaImpares += num;
            contadorImpares++;
        }
        }
        sc.close();
        double mediaImpares = 0;
        if (contadorImpares > 0) {
            mediaImpares = (double) sumaImpares / contadorImpares;
        }
        System.out.println("Has introducido " + contador + " números.");
        if (contadorImpares > 0) {
            System.out.println("La media de los números impares es: " + mediaImpares);
        } else {
            System.out.println("No se introdujeron números impares.");
        }
        if (mayorPar != Integer.MIN_VALUE) {
            System.out.println("El mayor número par es: " + mayorPar);
        } else{
            System.out.println("No se introdujeron números pares.");
        }
    }
}

