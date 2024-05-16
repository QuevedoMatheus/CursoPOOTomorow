// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, i, j;
        System.out.println("Informer 'n' o número de multiplos que vc quer de retorno");
        n = ler.nextInt();
        System.out.println("Informer 'i' um número natural não nulo para ser o multiplo");
        i = ler.nextInt();
        System.out.println("Informer 'j' um número natural não nulo para ser o multiplo");
        j = ler.nextInt();
        System.out.println("Multiplos i são");
        for(int k = 0; k < n; k++){
            System.out.print((k * i)+ " ");
        }
        System.out.println("\n");
        System.out.println("Multiplos j são");
        for(int k = 0; k < n; k++){
            System.out.print((k * j)+ " ");
        }
        System.out.println("\n");

        int count = 0;
        int num = 0;

        System.out.println("Os primeiros " + n + " múltiplos de " + i + " ou " + j + " são:");
        while (count < n) {
            if (num % i == 0 || num % j == 0) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }

    }
}