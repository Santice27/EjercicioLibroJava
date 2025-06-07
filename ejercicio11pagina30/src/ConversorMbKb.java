import java.util.Scanner;

public class ConversorMbKb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de megabytes (Mb): ");
        int megabytes = sc.nextInt();
        int kilobytes = megabytes * 1024;
        System.out.println(megabytes + " Mb son " + kilobytes + " Kb");
        sc.close();
    }
}

    

