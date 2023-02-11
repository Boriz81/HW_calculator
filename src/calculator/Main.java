package calculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operation operation = new Operation() {};
        char op;
        System.out.println("Введите математическую операцию: (+ - / *) ");
        op = scanner.next().charAt(0);
        System.out.println("Введите первое значение: ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе значение: ");
        double num2 = scanner.nextDouble();
        if (op == '+') {
            System.out.println(operation.addition(num1, num2));
        } else if (op == '-') {
            System.out.println(operation.subtraction(num1, num2));
        } else if (op == '*') {
            System.out.println(operation.multiplication(num1, num2));
        } else if (op == '/') {
            try {
                System.out.println(operation.division(num1, num2));
            } catch (ArithmeticException e) {

            }  System.out.println("Деление на ноль");
        }
    }
}
