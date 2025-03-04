package practice;

//Переменные, их типы и простые операции с ними

import static java.lang.Integer.sum;
import static java.lang.Math.max;

public class Lesson_2 {
    public static void main(String[] args) {

        int i = 130;
        char o = 'h';
        boolean y = true;
        // System.out.println(y);

        // Переменная ссылочного типа
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat3 = new Cat();
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog3 = new Dog();
        Bird bird = new Bird();
        Bird bird1 = new Bird();
        Pig pig = new Pig();
        Pig pig1 = new Pig();
        Pig pig2 = new Pig();
        Insect insect = new Insect();
        Insect insect1 = new Insect();
        Insect insect2 = new Insect();

        // Примитивные типы хранят только 1 значение - (хранятся в стеке)
        // Ссылочный тип - ссылка на обьект хранится в 1й части (стеке),
        // информация - то что кладется в переменную во 2й части (в куче)

        Integer x = 120;
        Integer c = 180;

        // Выполняется метод - выводится максимальное значение
        Integer xx = max(11,120);

        // Выполняется метод - выводится сумма чисел
        Integer xy = sum(x,c);
        //System.out.println(xy);

        byte m = 120;
        int mm = m + 150;
        System.out.println(mm);

        byte z = 6;
        int z2 = 170; // Лежит число 6 // 2 байта
        long z4 = 56745;


        byte z3 = (byte) z2; // Большое кладем в мальнькое

        String yui = "Hello Hello Hello Hello"; // Строковый тип - ссылочный, не проимитивный
        String yui2 = yui.toUpperCase(); // преобразовывает сообщение в БОЛЬШИЕ буквы

        System.out.println(yui2);














    }
}
