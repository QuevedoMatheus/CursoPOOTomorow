import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite o tamanho da sequencia");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while(i <=n){
            System.out.println("Digite o " + i + "º número");
            int valor = sc.nextInt();
            i++;
            int fact = 1;
            for(int j=1;j<=valor;j++){
                fact=fact*j;
            }
            System.out.println("Fatorial de "+valor+" é: "+fact);
        }
    }
}