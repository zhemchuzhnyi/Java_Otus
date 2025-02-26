package practice;

// FunctionUtilsHexToBin - вместо lesson_1_3 (для порядка назвал урок lesson_1_3)
public class Lesson_1_3 {
    public static String hexToBin(String hexBase) {
        // Удаляем возможный префикс "0x" и приводим к верхнему регистру
        hexBase = hexBase.toUpperCase().replace("0X", "");

        // Преобразуем hex строку в десятичное число
        int decimal = Integer.parseInt(hexBase, 16);

        // Преобразуем десятичное число в двоичную строку
        String binary = Integer.toBinaryString(decimal);

        return binary;
    }

    private Lesson_1_3() {
    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе числа 17, метод должен вернуть 10111 - '"
                        + Lesson_1_3.hexToBin("17")
                        + "'"
        );
    }
}