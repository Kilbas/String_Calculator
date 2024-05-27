package String_Calculator;
import java.util.List;


    public class Verification {
        public static List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        public Verification() {
        }

        public static void verifyStringLength(String str) {
            if (str.length() > 10) {
                throw new RuntimeException("В строке более 10 символов");
            }
        }

        public static void verifyStringAndInt(String s1, String s2) {
            if (!isString(s1) | isString(s2)) {
                throw new RuntimeException("Действие может принимать только строку и число");
            } else if (!numbers.contains(Integer.parseInt(s2))) {
                throw new RuntimeException("Введенное число не соответсвует условию (принимаются числа от 1 до 10");
            }
        }

        public static void verifyTwoStrings(String s1, String s2) {
            if (!isString(s1) | !isString(s2)) {
                throw new RuntimeException("Действие может принимать только строки");
            }
        }

        private static boolean isString(String s) {
            return s.startsWith("\"") && s.endsWith("\"");
        }
    }



