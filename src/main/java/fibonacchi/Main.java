package fibonacchi;

public class Main {
    public static void main(String[] args) {
//        System.out.println(fibRec(7));
//        System.out.println(fibIter(2));
//        System.out.println(fibIter(7));
//        System.out.println(powRec(2, 5));

        System.out.println(nwd(15, 14));
    }

    private static int nwd(int a, int b) {
        int x;
        if (a > b) {
            x = b;
        } else {
            x = a;
        }
        while ((a % x != 0) || (b % x != 0)) {
            x--;
        }

        return x;
    }

    public static int nwd2(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    private static int fibIterTable(int n) {
        if (n < 3) {
            return 1;
        }
        int[] tab = new int[n];
        tab[0] = 1;
        tab[1] = 1;
        for (int i = 2; i < n; i++) {
            tab[i] = tab[i - 2] + tab[i - 1];
        }

        return tab[n - 1];
    }

    private static int fibIter(int n) {
        int el2 = 1;
        int el1 = 1;
        for (int i = 3; i <= n; i++) {
            int tmp = el1 + el2;
            el2 = el1;
            el1 = tmp;
        }

        return el1;
    }

    private static double powRec(double x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * powRec(x, n - 1);
    }

    private static int fibRec(int n) {
        if (n < 3) {
            return 1;
        }

        return fibRec(n - 1) + fibRec(n - 2);
    }
}
