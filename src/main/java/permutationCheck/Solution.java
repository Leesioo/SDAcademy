package permutationCheck;

public class Solution {
    public int solution(int[] A) {
        int lengthOfArray = A.length;
        boolean isInArray = false;
        boolean isTooBig = false;
        if ((lengthOfArray < 1) || (lengthOfArray > 100000)) {
            return 0;
        }
        int[] helpArray = new int[lengthOfArray];
        for (int i = 0; ((i < lengthOfArray) && (!isInArray) && (!isTooBig)); i++) {
            if ((A[i] > lengthOfArray) || (A[i] < 1)) {
                isTooBig = true;
            } else {
                if (helpArray[A[i] - 1] != 0) {
                    isInArray = true;
                } else {
                    helpArray[A[i] - 1] = 1;
                }
            }
        }
        if (isInArray || isTooBig) {
            return 0;
        } else {
            for (int i = 0; ((i < lengthOfArray) && (!isInArray)); i++) {
                if (helpArray[i] == 0) {
                    isInArray = true;
                }
            }
            if (isInArray) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public int solution2(int[] A) {
        int size = A.length;
        if ((size < 1) || (size > 100000)) {
            return 0;
        }

        int[] temp = new int[size];

        for (int i = 0; i < size; i++) {
            if ((A[i] > size) || (A[i] < 1)) {
                return 0;
            }
            if (temp[A[i] - 1] != 0) {
                return 0;
            }
            temp[A[i] - 1] = 1;
        }

        return 1;
    }
}
