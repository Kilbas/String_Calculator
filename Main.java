package String_Calculator;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(count(s));
    }

    private static String count(String str) {
        String result = "";
        String[] stringArr;
        String s1;
        String s2;
        if (str.contains(" + ")) {
            stringArr = str.split(" \\+ ");
            s1 = stringArr[0];
            s2 = stringArr[1];
            result = Counter.addition(s1, s2);
        } else if (str.contains(" - ")) {
            stringArr = str.split(" - ");
            s1 = stringArr[0];
            s2 = stringArr[1];
            result = Counter.subtraction(s1, s2);
        } else if (str.contains(" * ")) {
            stringArr = str.split(" \\* ");
            s1 = stringArr[0];
            s2 = stringArr[1];
            result = Counter.multiplication(s1, s2);
        } else {
            if (!str.contains(" / ")) {
                throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
            }

            stringArr = str.split(" / ");
            s1 = stringArr[0];
            s2 = stringArr[1];
            result = Counter.division(s1, s2);
        }

        result = modifyLongString(result);
        result = addQuotes(result);
        return result;
    }

    private static String addQuotes(String result) {
        result = "\"" + result + "\"";
        return result;
    }

    private static String modifyLongString(String result) {
        if (result.length() > 40) {
            result = result.substring(0, 39) + "...";
        }

        return result;
    }
}


