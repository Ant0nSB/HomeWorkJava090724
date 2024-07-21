import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Код для задания №1
        task1();

        // Код для задания №2
        task2();

        // Код для дополнительного задания
        additionalTask();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово (четное количество букв):");
        String word1 = scanner.nextLine();

        System.out.println("Введите второе слово (четное количество букв):");
        String word2 = scanner.nextLine();

        if (word1.length() % 2 != 0 || word2.length() % 2 != 0) {
            System.out.println("Оба слова должны состоять из четного количества букв.");
        } else {
            String newWord = word1.substring(0, word1.length() / 2) + word2.substring(word2.length() / 2);
            System.out.println("Новое слово: " + newWord);
        }
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);

        double num1 = getValidDouble(scanner, "Введите первое число:");
        double num2 = getValidDouble(scanner, "Введите второе число:");

        System.out.println("Сложение: " + add(num1, num2));
        System.out.println("Вычитание: " + subtract(num1, num2));
        System.out.println("Умножение: " + multiply(num1, num2));
        System.out.println("Деление: " + divide(num1, num2));
    }

    public static double getValidDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Ошибка: пожалуйста, введите число.");
                scanner.next(); // Очистить некорректный ввод
            }
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Ошибка: деление на ноль.");
            return Double.NaN;
        }
    }

    public static void additionalTask() {
        Scanner scanner = new Scanner(System.in);

        double euros = getValidDouble(scanner, "Введите сумму в евро для конвертации:");

        double dollars = convertToDollars(euros);
        System.out.println("Сумма в долларах: " + dollars);
    }

    public static double convertToDollars(double euros) {
        double exchangeRate = 1.1; // Пример курса конвертации
        return euros * exchangeRate;
    }
}
