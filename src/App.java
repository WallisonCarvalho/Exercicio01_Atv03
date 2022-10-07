import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();
        sc.close();

        double soma = n1 + n2;

        System.out.println("A soma dos dois número é: " + soma);
    }
}
