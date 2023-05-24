public class HW1_3 {
    public HW1_3() {
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10001; ++i) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
