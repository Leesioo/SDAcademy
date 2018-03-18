package cyclicRotation;

public class Main {
    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        System.out.println(solution(A, 3));
    }

    public static int[] solution(int[] A, int K) {
        int tabLength = A.length;
        if (tabLength < 2) {
            return A;
        }
        for (int i = 0; i < K; i++) {
            int temp = A[tabLength-1];
            for (int j = 0; j < tabLength-1; j++) {
                A[tabLength-1-j] = A[tabLength-2-j];
            }
            A[0] = temp;
        }
        return A;
    }
}
