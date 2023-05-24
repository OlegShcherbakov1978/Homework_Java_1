import java.util.Scanner;

public class HW1_2 {
    public static int calculateNfact(int n) {
        int nFact = 1;

        for (int i = 1; i <= n; i++) {
            nFact *= i;
        }

        return nFact;
    }

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = calculateNfact(n);
        System.out.println("Факториал чила " + n + " равен: " + result);
    }
}
