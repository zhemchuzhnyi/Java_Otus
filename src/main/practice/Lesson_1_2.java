package practice;

// WordUtils - вместо lesson_1_2 (так назвал для порядка)
public class Lesson_1_2 {
    public static String reverseWords(String inputText) {
        // Проверяем на пустую строку или null
        if (inputText == null || inputText.trim().isEmpty()) {
            return "";
        }

        // Разбиваем строку на массив слов
        String[] words = inputText.trim().split("\\s+");

        // Создаем StringBuilder для построения результата
        StringBuilder reversed = new StringBuilder();

        // Проходим массив слов с конца к началу
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            // Добавляем пробел, если это не последнее слово
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    private Lesson_1_2() {
    }

    public static void main(String[] args) {
        System.out.println("Ввод пустой строки - '" + Lesson_1_2.reverseWords("") + "'");
        System.out.println("Ввод одного слова - '" + Lesson_1_2.reverseWords("word") + "'");
        System.out.println("Ввод двух слов - '" + Lesson_1_2.reverseWords("два слова") + "'");
    }
}
