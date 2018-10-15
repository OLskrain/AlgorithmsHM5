public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println(power(2, 10));
        System.out.println();

        //задача 2
        int n = 4;  //количество колец на башне
        hanoi('A', 'B', 'C', n); //A-B-C - сами башни
    }
    //Возведению числа в степень с помощью рекурсии и свойства чётности степени.
    private static int power(int base, int degree) {
        if (degree == 0) {
            return 1;
        } else if (degree % 2 == 0) {
            return power(base * base, degree / 2);
        } else {
            return base * power(base, --degree);
        }
    }
    //Задача: перенести все кольца с башни A на С.
    private static void hanoi(char a, char b, char c, int n) {
        if (n == 1) {
            System.out.println(String.format("Снимаем с %s переносим на %s", a, c));
        } else {
            hanoi(a, c, b, n - 1);
            System.out.println(String.format("Снимаем с %s переносим на %s", a, c));
            hanoi(b, a, c, n - 1);
        }
    }
}
