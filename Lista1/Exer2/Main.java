public class Main {

    public static void main(String[] args) {
        int n = 41;
        int resto=0;

        if (n <= 100){
            resto = (n % 10);
        } else if (n > 10 && n <= 1000){
            resto = n % 100;
        } if (n >1000 && n <= 10000){
            resto = n % 1000;
        }
        int comparador = 0;
        comparador = (n/10);
        if (resto == comparador) {
            System.out.println("primeiro e último número iguais");
        } else {
            System.out.println("primeiro e último número diferentes");
        }

        System.out.println("primeiro número");
        System.out.println(comparador);
        System.out.println("\n");
        System.out.printf("segundo número: %d", resto);
        System.out.println("\n");
        System.out.printf("n: %d", n);



    }

}