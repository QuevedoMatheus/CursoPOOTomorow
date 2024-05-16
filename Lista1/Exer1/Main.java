import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe um número para ser verificado:\n");
        int n;
        n = ler.nextInt();
        float resto;
        resto = n%2;
        if(resto == 0){
            System.out.println("O número é par");
        } else if (resto != 0) {
            System.out.println("O número é impar");
        }
    }
}