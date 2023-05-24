public class HW1_1 {
    public static int calculateTriangularNumber(int n) {
        int triangularNumber = 0;

        for (int i = 1; i <= n; i++) {
            triangularNumber += i;
        }

        return triangularNumber;
    }

    public static void main(String[] args) {
        int n = 5;

        int result = calculateTriangularNumber(n);
        System.out.println("n-ое треугольное число: " + result);
    }
}
