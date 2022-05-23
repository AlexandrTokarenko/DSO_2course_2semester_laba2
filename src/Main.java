import java.util.*;
public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        String Line = in.nextLine();
        while (tests > 0) {
            Line = in.nextLine();
            check(Line);
            tests -= 1;
        }

    }
    /*public static void check(String str) {
        int countOpenRound = 0;
        int countOpenSquare = 0;
        int countCloseRound = 0;
        int countCloseSquare = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) =='(') countOpenRound++;
            else if (str.charAt(i) =='[')countOpenSquare ++;
            else if (str.charAt(i) ==')')countCloseRound ++;
            else if (str.charAt(i) ==']')countCloseSquare ++;
        }
        if (countOpenRound == countCloseRound && countOpenSquare == countCloseSquare) {
            System.out.println("Yes");
        } else System.out.println("No");
    }*/
    public static void check(String str) {
        char[] arr = new char[str.length()];
        int size = 0;
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                arr[size] = str.charAt(i);
                size++;
            } else if (str.charAt(i) == ')' || str.charAt(i) == ']') {
                if (arr[size-1] == reverse(str.charAt(i))) {
                }
            }
        }
        if (result == 1) {
            System.out.println("No");
        } else System.out.println("Yes");
    }

    public static char reverse(char i) {
        if (i == ')') {
            return '(';
        } else return '[';
    }
}