package practice;

// Конкатенация строк

public class Lesson_2_Practice {
    public static void main(String[] args) {
        String str0 = "Привет";
        String str1 = "Андрей";
        String result = str0 + " " + str1; // конкатенация строк
        System.out.println(result);


        // == и equals() сравнение обьектов
        // == сравнивает ссылки на обьекты
        // equals сравнивает содержимое обьектов

        int a = 5;
        int b = 6;
        if (a == b) {
            System.out.println("a и b равны");
        } else {
            System.out.println("a и b не равны");

        String str2 = new String("hello");
        String str3 = new String("hello");

        if (str2.equals(str3)) {
            System.out.println("str2 и str3 имеют одинаковое содержимое");
        } else {
            System.out.println("str2 и str3 имеют разное содержимое");

        }

        }

        //Арифметические операции
        // + сложение

        int a1 = 10;
        int b1 = 20;
        int c1 = a + b;
        int d1 = 4 + b1;

        // вычитание

        int a2 = 10;
        int b2 = 5;
        int c2 = a2 - b2;
        int d2 = 4 - a2;

        // % Получение остатка от деления двух чисел

        int a3 = 33;
        int b3 = 5;
        int D = 22 / 4;
        int d3 = 22 % 4;

        // * Умножение двух чисел

        int a4 = 10;
        int b4 = 7;
        int c4 = a * b;
        int d4 = b4 * 5;

        // - / - деление двух чисел

        int a5 = 20;
        int b5 = 5;
        int c5 = a5 / b5;
        double d5 = 22.5 / 4.5;


        // Унарные арифметические операции
        // ++ Префиксный инкремент

        int x = 5;
        int result1 = ++x; //  увеличение х на 1 и возвращение его нового значения
        System.out.println(result1);
        System.out.println(x);

        // ++ Постфиксный инкремент
        int x1 = 5;
        int result2 = x++; // возвращаем текущее значение - потом увеличиваем на 1
        System.out.println(result2);
        System.out.println(x1);

        // префиксный декремент
        int x2 = 5;
        int result3 = --x; //  уменьгение на 1 и возвращение нового значения
        System.out.println(result3);
        System.out.println(x2);

        // постфиксный декремент
        int x3 = 5;
        int result4 = x--; //  возвращение текущего значения а затем уменьшение на 1
        System.out.println(result4);
        System.out.println(x3);

        /* приоритет исполнения арифметических операций:
        ++ (инкремент), -- (декремент)
        *(умножение), / (деление), % (остаток от деления)
        +(сложение), - (вычитание)
         */

        int p = 8;
        int i = 7;
        int t = p + 5 * ++i;
        i++;
        System.out.println(t);

        int p1 = 8;
        int i1= 7;
        int t1 = (p1 + 5) * ++i1;
        i1++;
        System.out.println(t1);



    }
}
