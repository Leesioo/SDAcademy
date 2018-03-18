package oddOcurrancesInArray;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] A = {42, 43, 42, 5, 5, 7, 7};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        if (A.length > 1000000) {
            return 0;
        }

        HashSet<Integer> myIntegerSet = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {
            if ((A[i] == 0) || (A[i] > 1000000000)) {
                return 0;
            }
            if (myIntegerSet.contains(A[i])) {
                myIntegerSet.remove(A[i]);
            } else {
                myIntegerSet.add(A[i]);
            }
        }

        if (myIntegerSet.size() == 1) {
           Object[] result = myIntegerSet.toArray();
           Integer integerResult = (Integer) result[0];
           return integerResult;
        } else {
            return 0;
        }
    }
}
