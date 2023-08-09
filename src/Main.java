import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Map<String, Integer> romanToArabicMap = new HashMap<>();
    private static final Map<Integer, String> arabicToRomanMap = new HashMap<>();

   public static void fillHashMap() {
        romanToArabicMap.put("I", 1);
        romanToArabicMap.put("II", 2);
        romanToArabicMap.put("III", 3);
        romanToArabicMap.put("IV", 4);
        romanToArabicMap.put("V", 5);
        romanToArabicMap.put("VI", 6);
        romanToArabicMap.put("VII", 7);
        romanToArabicMap.put("VIII", 8);
        romanToArabicMap.put("IX", 9);
        romanToArabicMap.put("X", 10);
        romanToArabicMap.put("XI", 11);
        romanToArabicMap.put("XII", 12);
        romanToArabicMap.put("XIII", 13);
        romanToArabicMap.put("XIV", 14);
        romanToArabicMap.put("XV", 15);
        romanToArabicMap.put("XL", 40);
        romanToArabicMap.put("L", 50);
        romanToArabicMap.put("LX", 60);
        romanToArabicMap.put("LXX", 70);
        romanToArabicMap.put("LXXX", 80);
        romanToArabicMap.put("XC", 90);
        romanToArabicMap.put("C", 100);

        arabicToRomanMap.put(1, "I");
        arabicToRomanMap.put(2, "II");
        arabicToRomanMap.put(3, "III");
        arabicToRomanMap.put(4, "IV");
        arabicToRomanMap.put(5, "V");
        arabicToRomanMap.put(6, "VI");
        arabicToRomanMap.put(7, "VII");
        arabicToRomanMap.put(8, "VIII");
        arabicToRomanMap.put(9, "IX");
        arabicToRomanMap.put(10, "X");
        arabicToRomanMap.put(11, "XI");
        arabicToRomanMap.put(12, "XII");
        arabicToRomanMap.put(13, "XIII");
        arabicToRomanMap.put(14, "XIV");
        arabicToRomanMap.put(15, "XV");
        arabicToRomanMap.put(40, "XL");
        arabicToRomanMap.put(50, "L");
        arabicToRomanMap.put(60, "LX");
        arabicToRomanMap.put(70, "LXX");
        arabicToRomanMap.put(80, "LXXX");
        arabicToRomanMap.put(90, "XC");
        arabicToRomanMap.put(100, "C");
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        fillHashMap ();
        System.out.println("Введите выражение двух чисел и оператор (+, -, *, /), разделяя их пробелами");

        String expression = scanner.nextLine();
        String[] elements = expression.split(" ");

        if (elements.length != 3) {
            throw new Exception("Неверный формат операции, введите два числа и один оператор");
        } else {
            String num1Str = elements[0];
            String num2Str = elements[2];
            String operator = elements[1];

            boolean isNum1Roman = isRomanNumber(num1Str);
            boolean isNum2Roman = isRomanNumber(num2Str);
            if ((isNum1Roman && !isNum2Roman) || (!isNum1Roman && isNum2Roman)) {
                throw new Exception("Введите либо римское, либо арабское выражение");
            }
            int num1, num2;

            if (isNum1Roman) {
                num1 = romanToArabic(num1Str);
                num2 = romanToArabic(num2Str);

                if (num1 <= 0 || num1 > 10 || num2 <= 0 || num2 > 10) {
                    throw new Exception("В римской системе счисления допустимы числа от I до X включительно");
                }
            } else {
                num1 = Integer.parseInt(num1Str);
                num2 = Integer.parseInt(num2Str);

                if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
                    throw new Exception("Числа должны быть от 1 до 10 включительно");
                }
            }

            int result = calculate(num1, num2, operator);

            if (isNum1Roman) {
                if (result <= 0) {
                    throw new Exception("Результат в римской системе счисления не может быть меньше или равен нулю");
                }
                String romanResult = arabicToRoman(result);
                System.out.println("Ответ: " + romanResult);
            } else {
                System.out.println("Ответ: " + result);
            }
        }
    }

    private static boolean isRomanNumber(String str) {
        return romanToArabicMap.containsKey(str);
    }

    private static int romanToArabic(String romanNum) {
        return romanToArabicMap.get(romanNum);
    }

    private static String arabicToRoman(int arabicNum) {
        return arabicToRomanMap.get(arabicNum);
    }

    private static int calculate(int num1, int num2, String operator) throws Exception {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new Exception("Неверный оператор. Введите один из следующих: +-*/");
        }
    }
}
