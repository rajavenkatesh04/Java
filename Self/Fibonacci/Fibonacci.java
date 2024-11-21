public class Fibonacci {

    public static void fibo(int n) {

        int a = 0;
        int b = 1;

        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 2; i < n; i++) {
            int c = a + b;

            a = b;
            b = c;

            System.out.print(c + " ");

        }

    }

    public static void main(String[] args) {
        fibo(10);
    }
}
