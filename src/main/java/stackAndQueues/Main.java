package stackAndQueues;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution2("{[()()]}"));
        System.out.println(solution2("()()()()[]"));
        System.out.println(solution2("[[[]]]"));
        System.out.println(solution2("{{[[(())]][][]}}"));
        System.out.println(solution2("{}()[]"));


        System.out.println(solution2("{{{{{{"));
        System.out.println(solution2(")))))))"));
        System.out.println(solution2("([)()]"));
        System.out.println(solution2("{a}"));
        System.out.println(solution2("()."));
    }

    public static int solution2(String S) {
        if (S.length() > 200000) {
            return 0;
        } else if (S.length() == 0) {
            return 1;
        }
        char[] history = new char[S.length()];
        char actualChar;
        char corelatedChar;
        int historyLength = -1;

        for (int i = 0; i < S.length(); i++) {
            actualChar = S.charAt(i);
            if ((actualChar == '{') || (actualChar == '[') || (actualChar == '(')) {
                historyLength++;
                history[historyLength] = actualChar;
            } else {
                if (historyLength < 0) {
                    return 0;
                }
                char lastOpened = history[historyLength];
                switch (lastOpened) {
                    case '(':
                        corelatedChar = ')';
                        break;
                    case '[':
                        corelatedChar = ']';
                        break;
                    case '{':
                        corelatedChar = '}';
                        break;
                    default:
                        corelatedChar = 0;
                }
                if (actualChar == corelatedChar) {
                    historyLength--;
                } else {
                    return 0;
                }
            }
        }

        if (historyLength<0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int solution(String S) {
        if (S.length() > 200000) {
            return 0;
        } else if (S.length() == 0) {
            return 1;
        }
        String history = "";
        char actualChar;
        char corelatedChar;
        int historyLength = 0;

        for (int i = 0; i < S.length(); i++) {
            actualChar = S.charAt(i);
            if ((actualChar == '{') || (actualChar == '[') || (actualChar == '(')) {
                history = history + actualChar;
                historyLength++;
            } else {
                if (historyLength < 1) {
                    return 0;
                }
                char lastOpened = history.charAt(historyLength - 1);
                switch (lastOpened) {
                    case '(':
                        corelatedChar = ')';
                        break;
                    case '[':
                        corelatedChar = ']';
                        break;
                    case '{':
                        corelatedChar = '}';
                        break;
                    default:
                        corelatedChar = 0;
                }
                if (actualChar == corelatedChar) {
                    historyLength--;
                    history = history.substring(0, historyLength);

                } else {
                    return 0;
                }
            }
        }

        if (history.equals("")) {
            return 1;
        } else {
            return 0;
        }
    }
}
