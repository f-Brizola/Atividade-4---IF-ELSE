import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num1 = scanner.nextInt();

        System.out.println("Digite um numero: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " É maior que " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " É maior que " + num1);
        } else if (num1 == num2) {
            System.out.println("Os números são iguais!");
        }
    }
}
