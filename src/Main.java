public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int cash = 15_000;
        int total = 0;
        int m = 0;
        while (total < 2_476_000) {
            total = total + cash ;
            m++;
            System.out.println("Месяц " + m + " , сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 1;
        int n = 10;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }
    }
    public static void task3 () {
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = 17;
        int death = 8;
        int div = fertility-death;
        int i = 0;
        while (i < 10) {
            i++;
            population += population * div/1000;
            System.out.println("Год " + i + " , численность населения составляет " + population);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int sum = 12_000_000;
        int cash = 15_000;
        int i = 0;
        while (cash < sum ) {
            i++;
            cash = cash + cash*70/100;
            System.out.println("Месяц " + i + " , сумма накоплений " + cash);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int sum = 12_000_000;
        int cash = 15_000;
        int i = 0;
        while (cash < sum) {
            i++;
            cash = cash + cash*70/100;
            if (i % 6 ==0) {
                System.out.println("Месяц " + i + " , сумма накоплений " + cash);
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int sum = 15_000;
        int mounth = 9 *12;
        int i = 0;
        while (i < mounth) {
            i++;
            sum = sum + sum*70/100;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " , сумма накоплений " + sum);
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int friday = 5;
        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет");
            friday= friday + 7;
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int year = 0;
        int time = 79;
        int t = 1823;
        int f = 2123;
        while (year < f) {
            year = year + time;
            if (year > t && year < f) {
                System.out.println(year);
            }

        }
    }
}