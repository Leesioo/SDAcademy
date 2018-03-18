package binaryGap;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    private static int solution(int n) {
        if ((n < 5) || (n > 2147483647)) {
            return 0;
        }
        int startOfGap = 0;
        int count = 0;
        int maxCount = 0;
        int temp = 0;

        while (n > 0) {
            temp = n % 2;
            if (temp == 1) {
                startOfGap = 1;
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            } else if (startOfGap == 1) {
                count++;
            }
            n /= 2;
        }

        return maxCount;
    }

}

