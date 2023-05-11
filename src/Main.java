
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 6:");

        int age = 22;
        double salary = 55_000;
        double limit = salary;

        if (age < 23) {
            limit = salary * 2;
            if (salary >= 50_000 && salary < 80_000) {
                limit *= 1.2;
            } else {
                limit *= 1.5;
            }
            System.out.printf("Мы готовы выдать вам кредитную карту с лимитом %.0f рублей%n", limit);
        } else {
            limit = salary * 3;
            if (salary >= 50_000 && salary < 80_000) {
                limit *= 1.2;
            } else {
                limit *= 1.5;
            }
            System.out.printf("Мы готовы выдать вам кредитную карту с лимитом %.0f рублей%n", limit);
        }
    }

    public static void task2() {
        System.out.println("Задача 7:");
        int age = 40;
        double salary = 100_000;
        double wantedSum = 330_000;
        double rate = 10;
        double monthPay = 0;
        double maxMonthPay = salary / 2;


        if (salary >= 80_000) {
            rate -= 0.07;
        }
        if (age < 23) {
            rate += 1;
        }
        if (age < 30) {
            rate += 0.5;
        }
        monthPay = (wantedSum + (wantedSum * rate / 100)) / 12;

        if (monthPay <= maxMonthPay) {
            System.out.printf("Максимальный платеж при ЗП %.0f равен %.2f рублей. Платеж по кредиту %.2f рублей. Одобрено%n", salary, maxMonthPay, monthPay);
        } else {
            System.out.printf("Максимальный платеж при ЗП %.0f равен %.2f рублей. Платеж по кредиту %.2f рублей. отказано%n", salary, maxMonthPay, monthPay);
        }
    }
}