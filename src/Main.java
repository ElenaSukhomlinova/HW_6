public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        for(int number = 0; number <=10; number++) {
            System.out.println(number);
        }
        System.out.println("");

        System.out.println("Задача 2");
        for(int number = 10; number > 0; number--) {
            System.out.println(number);
        }
        System.out.println("");

        System.out.println("Задача 3");
        for(int number = 0; number <=17; number = number+2) {
            System.out.println(number);
        }
            System.out.println("");

        System.out.println("Задача 4");
        for(int number = 10; number >=-10; number--) {
            System.out.println(number);
        }
        System.out.println("");

        System.out.println("Задача 5");
        for(int number = 1904; number <= 2096; number = number +4) {
            System.out.println(number + " год является високосным");
        }
        System.out.println("");

        System.out.println("Задача 6");
        for(int number = 7; number <= 98; number = number +7) {
            System.out.println(number);
        }
        System.out.println("");

        System.out.println("Задача 7");
        for(int number = 1; number <= 512; number = number * 2) {
            System.out.println(number);
        }
        System.out.println("");

        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for(int month = 1; month <= 12; month++) {
            total = total + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + "рублей");
        }
        System.out.println("");

        System.out.println("Задача 9");
        int salary1 = 29000;
        int total1 = 0;
        for(int month = 1; month <= 12; month++) {
            total1 = total1 + total1/100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total1 + "рублей");
        }
        System.out.println(" ");

        System.out.println("Задача 10");
        int constant = 2;
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = i * constant;
            System.out.println(constant + "*" + i + "=" + result);
        }
    }
}