package String_Calculator;


public class Counter {
    public Counter() {
    }

    public static String multiplication(String s1, String s2) {
        Verification.verifyStringAndInt(s1, s2);
        s1 = deleteQuotation(s1);
        Verification.verifyStringLength(s1);
        return s1.repeat(Integer.parseInt(s2));
    }

    public static String division(String s1, String s2) {
        Verification.verifyStringAndInt(s1, s2);
        s1 = deleteQuotation(s1);
        Verification.verifyStringLength(s1);
        int length = s1.length();
        int b = Integer.parseInt(s2);
        if (length < b) {
            throw new RuntimeException("Невозможно произвести такую операцию со строкой");
        } else {
            int endIndex = length / b;
            return s1.substring(0, endIndex);
        }
    }

    public static String addition(String s1, String s2) {
        Verification.verifyTwoStrings(s1, s2);
        s1 = deleteQuotation(s1);
        s2 = deleteQuotation(s2);
        Verification.verifyStringLength(s1);
        Verification.verifyStringLength(s2);
        String s = String.join("", s1, s2);
        return s;
    }

    public static String subtraction(String s1, String s2) {
        Verification.verifyTwoStrings(s1, s2);
        s1 = deleteQuotation(s1);
        s2 = deleteQuotation(s2);
        Verification.verifyStringLength(s1);
        Verification.verifyStringLength(s2);
        return s1.replaceAll(s2, "");
    }

    private static String deleteQuotation(String str) {
        return str.substring(1, str.length() - 1);
    }
}


