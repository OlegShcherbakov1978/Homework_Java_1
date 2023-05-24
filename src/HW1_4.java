import java.util.Scanner;

public class HW1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Ответ: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Ответ: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Ответ: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Ответ: " + result);
                } else {
                    System.out.println("Ошибка: деление на ноль");
                }
                break;
            default:
                System.out.println("Ошибка: некорректная операция");
                break;
        }
    }
}
