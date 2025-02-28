package practice;

//Переменные, их типы и простые операции с ними

public class Lesson_2 {
    public static void main(String[] args) {

        int i = 130;
        char o = 'h';
        boolean y = true;
        System.out.println(y);

        // Переменная ссылочного типа
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Dog dog = new Dog();
        Dog dog1 = new Dog();

        // Примитивные типы хранят только 1 значение - (хранятся в стеке)
        // Ссылочный тип - ссылка на обьект хранится в 1й части (стеке),
        // информация - то что кладется в переменную во 2й части (в куче)

    }
}
