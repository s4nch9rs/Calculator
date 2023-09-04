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
        romanToArabicMap.put("XVI", 16);
        romanToArabicMap.put("XVII", 17);
        romanToArabicMap.put("XVIII", 18);
        romanToArabicMap.put("XIX", 19);
        romanToArabicMap.put("XX", 20);
       romanToArabicMap.put("XXI", 21);
       romanToArabicMap.put("XXII", 22);
       romanToArabicMap.put("XXIII", 23);
       romanToArabicMap.put("XXIV", 24);
       romanToArabicMap.put("XXV", 25);
       romanToArabicMap.put("XXVI", 26);
       romanToArabicMap.put("XXVII", 27);
       romanToArabicMap.put("XXVIII", 28);
       romanToArabicMap.put("XXIX", 29);
       romanToArabicMap.put("XXX", 30);
       romanToArabicMap.put("XXXI", 31);
       romanToArabicMap.put("XXXII", 32);
       romanToArabicMap.put("XXXIII", 33);
       romanToArabicMap.put("XXXIV", 34);
       romanToArabicMap.put("XXXV", 35);
       romanToArabicMap.put("XXXVI", 36);
       romanToArabicMap.put("XXXVII", 37);
       romanToArabicMap.put("XXXVIII", 38);
       romanToArabicMap.put("XXXIX", 39);
       romanToArabicMap.put("XL", 40);
       romanToArabicMap.put("XLI", 41);
       romanToArabicMap.put("XLII", 42);
       romanToArabicMap.put("XLIII", 43);
       romanToArabicMap.put("XLIV", 44);
       romanToArabicMap.put("XLV", 45);
       romanToArabicMap.put("XLVI", 46);
       romanToArabicMap.put("XLVII", 47);
       romanToArabicMap.put("XLVIII", 48);
       romanToArabicMap.put("XLIX", 49);
        romanToArabicMap.put("L", 50);
       romanToArabicMap.put("LI", 51);
       romanToArabicMap.put("LII", 52);
       romanToArabicMap.put("LIII", 53);
       romanToArabicMap.put("LIV", 54);
       romanToArabicMap.put("LV", 55);
       romanToArabicMap.put("LVI", 56);
       romanToArabicMap.put("LVII", 57);
       romanToArabicMap.put("LVIII", 58);
       romanToArabicMap.put("LIX", 59);
        romanToArabicMap.put("LX", 60);
       romanToArabicMap.put("LXI", 61);
       romanToArabicMap.put("LXII", 62);
       romanToArabicMap.put("LXIII", 63);
       romanToArabicMap.put("LXIV", 64);
       romanToArabicMap.put("LXV", 65);
       romanToArabicMap.put("LXVI", 66);
       romanToArabicMap.put("LXVII", 67);
       romanToArabicMap.put("LXVIII", 68);
       romanToArabicMap.put("LXIX", 69);
        romanToArabicMap.put("LXX", 70);
       romanToArabicMap.put("LXXI", 71);
       romanToArabicMap.put("LXXII", 72);
       romanToArabicMap.put("LXXIII", 73);
       romanToArabicMap.put("LXXIV", 74);
       romanToArabicMap.put("LXXV", 75);
       romanToArabicMap.put("LXXVI", 76);
       romanToArabicMap.put("LXXVII", 77);
       romanToArabicMap.put("LXXVIII", 78);
       romanToArabicMap.put("LXXIX", 79);
        romanToArabicMap.put("LXXX", 80);
       romanToArabicMap.put("LXXXI", 81);
       romanToArabicMap.put("LXXXII", 82);
       romanToArabicMap.put("LXXXIII", 83);
       romanToArabicMap.put("LXXXIV", 84);
       romanToArabicMap.put("LXXXV", 85);
       romanToArabicMap.put("LXXXVI", 86);
       romanToArabicMap.put("LXXXVII", 87);
       romanToArabicMap.put("LXXXVIII", 88);
       romanToArabicMap.put("LXXXIX", 89);
        romanToArabicMap.put("XC", 90);
       romanToArabicMap.put("XCI", 91);
       romanToArabicMap.put("XCII", 92);
       romanToArabicMap.put("XCIII", 93);
       romanToArabicMap.put("XCIV", 94);
       romanToArabicMap.put("XCV", 95);
       romanToArabicMap.put("XCVI", 96);
       romanToArabicMap.put("XCVII", 97);
       romanToArabicMap.put("XCVIII", 98);
       romanToArabicMap.put("XCIX", 99);
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
        arabicToRomanMap.put(16, "XVI");
        arabicToRomanMap.put(17, "XVII");
        arabicToRomanMap.put(18, "XVII");
        arabicToRomanMap.put(19, "XIX");
        arabicToRomanMap.put(20, "XX");
       arabicToRomanMap.put(21, "XXI");
       arabicToRomanMap.put(22, "XXII");
       arabicToRomanMap.put(23, "XXIII");
       arabicToRomanMap.put(24, "XXIV");
       arabicToRomanMap.put(25, "XXV");
       arabicToRomanMap.put(26, "XXVI");
       arabicToRomanMap.put(27, "XXVII");
       arabicToRomanMap.put(28, "XXVII");
       arabicToRomanMap.put(29, "XXIX");
       arabicToRomanMap.put(30, "XXX");
       arabicToRomanMap.put(31, "XXXI");
       arabicToRomanMap.put(32, "XXXII");
       arabicToRomanMap.put(33, "XXXIII");
       arabicToRomanMap.put(34, "XXXIV");
       arabicToRomanMap.put(35, "XXXV");
       arabicToRomanMap.put(36, "XXXVI");
       arabicToRomanMap.put(37, "XXXVII");
       arabicToRomanMap.put(38, "XXXVII");
       arabicToRomanMap.put(39, "XXXIX");
        arabicToRomanMap.put(40, "XL");
        arabicToRomanMap.put(41, "XLI");
        arabicToRomanMap.put(42, "XLII");
        arabicToRomanMap.put(43, "XLIII");
        arabicToRomanMap.put(44, "XLIV");
        arabicToRomanMap.put(45, "XLV");
        arabicToRomanMap.put(46, "XLVI");
        arabicToRomanMap.put(47, "XLVII");
        arabicToRomanMap.put(48, "XLVIII");
        arabicToRomanMap.put(49, "XLIX");
        arabicToRomanMap.put(50, "L");
       arabicToRomanMap.put(51, "LI");
       arabicToRomanMap.put(52, "LII");
       arabicToRomanMap.put(53, "LIII");
       arabicToRomanMap.put(54, "LIV");
       arabicToRomanMap.put(55, "LV");
       arabicToRomanMap.put(56, "LVI");
       arabicToRomanMap.put(57, "LVII");
       arabicToRomanMap.put(58, "LVIII");
       arabicToRomanMap.put(59, "LIX");
        arabicToRomanMap.put(60, "LX");
       arabicToRomanMap.put(61, "LXI");
       arabicToRomanMap.put(62, "LXII");
       arabicToRomanMap.put(63, "LXIII");
       arabicToRomanMap.put(64, "LXIV");
       arabicToRomanMap.put(65, "LXV");
       arabicToRomanMap.put(66, "LXVI");
       arabicToRomanMap.put(67, "LXVII");
       arabicToRomanMap.put(68, "LXVIII");
       arabicToRomanMap.put(69, "LXIX");
        arabicToRomanMap.put(70, "LXX");
       arabicToRomanMap.put(71, "LXXI");
       arabicToRomanMap.put(72, "LXXII");
       arabicToRomanMap.put(73, "LXXIII");
       arabicToRomanMap.put(74, "LXXIV");
       arabicToRomanMap.put(75, "LXXV");
       arabicToRomanMap.put(76, "LXXVI");
       arabicToRomanMap.put(77, "LXXVII");
       arabicToRomanMap.put(78, "LXXVIII");
       arabicToRomanMap.put(79, "LXXIX");
        arabicToRomanMap.put(80, "LXXX");
       arabicToRomanMap.put(81, "LXXXI");
       arabicToRomanMap.put(82, "LXXXII");
       arabicToRomanMap.put(83, "LXXXIII");
       arabicToRomanMap.put(84, "LXXXIV");
       arabicToRomanMap.put(85, "LXXXV");
       arabicToRomanMap.put(86, "LXXXVI");
       arabicToRomanMap.put(87, "LXXXVII");
       arabicToRomanMap.put(88, "LXXXVIII");
       arabicToRomanMap.put(89, "LXXXIX");
        arabicToRomanMap.put(90, "XC");
        arabicToRomanMap.put(91, "XCI");
        arabicToRomanMap.put(92, "XCII");
        arabicToRomanMap.put(93, "XCII");
        arabicToRomanMap.put(94, "XCIV");
        arabicToRomanMap.put(95, "XCV");
        arabicToRomanMap.put(96, "XCVI");
        arabicToRomanMap.put(97, "XCVII");
        arabicToRomanMap.put(98, "XCVIII");
        arabicToRomanMap.put(99, "XCIX");
        arabicToRomanMap.put(100, "C");
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        fillHashMap();
        System.out.println("Введите выражение двух чисел и оператор (+, -, *, /), разделяя их пробелами");

        String expression = scanner.nextLine();
        String result = calc(expression);
        System.out.println("Ответ: " + result);
    }
    public static String calc(String input) throws Exception {
        String[] elements = input.split(" ");

        if (elements.length != 3) {
            throw new Exception("Неверный формат операции, введите два числа и один оператор");
        } else {
            String num1Str = elements[0];
            String num2Str = elements[2];
            String operator = elements[1];

            boolean isNum1Roman = isRomanNumber(num1Str);
            boolean isNum2Roman = isRomanNumber(num2Str);

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
                return arabicToRoman(result);
            } else {
                return String.valueOf(result);
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
