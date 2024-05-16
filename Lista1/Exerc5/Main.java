import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Digite o número que vc que saber se é triangular");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int num = 1;
        while (true) {

            count =  (num * (num + 1) * (num + 2)) / 6;
            if(count >= n)
                break;
            num++;
        }

        if (count == n)
            System.out.println("É triangular");
        else
            System.out.println("Não é triangular");
    }

}