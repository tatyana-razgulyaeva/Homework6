public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }

        for (int i = 10; i > 0 ; i--) {
            System.out.println(i);
        }

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        for (int i = 10; i >= -10 ; i--) {
            System.out.println(i);
        }

        for (int i = 1904; i <= 2096 ; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        for (int i = 7; i <= 98 ; i = i + 7) {
            System.out.println(i);
        }

        for (int i = 1; i <= 512 ; i = i * 2) {
            System.out.println(i);
        }
        double money = 0;
        for (int month = 1; month <= 12 ; month++) {
            money = money + 29000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (long) money + " рублей");
        }
        money = 0;
        for (int month = 1; month <= 12 ; month++) {
            money = money * 1.01;
            money = money + 29000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (long) money + " рублей");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}