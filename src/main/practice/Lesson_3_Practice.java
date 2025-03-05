package practice;

public class Lesson_3_Practice {
    public static void main(String[] args) {

        final int SIZE = 12; // если final то значение не меняется - всегда остается - 12
        final String VER = "Eren"; // - конечная навсегда - константа
        //SIZE = 13;

        // Массивы
        int age8;
        int age0 = 12;
        int age1 = 15;
        int age2 = 18;
        int age3 = 20;

        int age[] = new int[4];
        age[0] = 12;
        age[1] = 14;
        age[2] = 16;
        age[3] = 18;
        System.out.println(age[0]);

        // так же массив можно записывать для экономии места в таком виде
        int ages[] = new int[]{11,12,13,14,15,16,17,18,19,};
        System.out.println(ages[5]);

        // узнать размер массива можно с помощь метода length
        int size = ages.length;
        System.out.println(size);

        // условные операторы - позволяют перебирать каки-то значения
        //IF - условный оператор

        int nu = 10;
        if(nu > 0) {
            System.out.println("Больше 0");
        }else{
            System.out.println("Меньше 0");
        }

        // тернарный оператор if-else

        String x = (nu > 0)? "Больше 0":"Меньше 0";
        System.out.println(x);

        // Цикл for
        int[] agell;

        int agel[] = new int[10];
        agel[0] = 12;
        agel[1] = 14;
        agel[2] = 16;
        agel[3] = 18;
        agel[4] = 20;
        agel[5] = 22;
        agel[6] = 24;

        for (int ext = 0; ext < agel.length; ext++) {
           System.out.println(agel[ext]);
        }

        // for-each
        int[] agell1;

        int agel1[] = new int[10];
        agel1[0] = 12;
        agel1[1] = 14;
        agel1[2] = 16;
        agel1[3] = 18;
        agel1[4] = 20;
        agel1[5] = 22;
        agel1[6] = 26;
        agel1[7] = 28;
        agel1[8] = 30;
        agel1[9] = 32;

        for (int ext1 : agel1){
            System.out.println(ext1);
        }

        //while
        int cash = 100;
        while (cash > 0) {
            System.out.println("Купил что то очень нужное");
            cash = cash - 20;
        }

        //do-while
        int cash1 = 80;
        do {
            System.out.println("Купил что-то очень нужное 2");
            cash1 = cash1 - 20;
        } while (cash1 > 0);













    }
}
