
import java.util.Scanner;

/*
Задача 1. Напишите программу-калькулятор, которая запрашивает у пользователя два числа и выполняет операцию возведения первого числа в степень второго числа.
Если введены некорректные числа или происходит деление на ноль, необходимо обработать соответствующие исключения и вывести информативное сообщение об ошибке.
Важно! С использованием принципа одного уровня абстракции!
**В этой задаче мы создаем класс PowerCalculator, который содержит метод calculatePower(),
выполняющий операцию возведения числа в степень. Если введено некорректное основание (ноль) и отрицательная степень,
выбрасывается исключение InvalidInputException.

В методе main() мы запрашиваем у пользователя основание и показатель степени, вызываем метод calculatePower() и выводим результат.
Если введены некорректные числа или происходит ошибка ввода, соответствующие исключения перехватываются и выводится информативное сообщение об ошибке.

Обратите внимание, что в этой задаче мы использовали собственное исключение InvalidInputException, чтобы явно указать на некорректный ввод.
Это помогает разделить обработку ошибок на соответствующие уровни абстракции.**
*/

public class PowerCalculator {
    private int numberFirst;
    private int numberSecond;
    private int result;
    private final Scanner scanner;
    private final String INPUT_STRING = "Введите два числа:\n";
    private final String INPUT_STRING_FIRST_NUMBER = "Введите первое число: ";
    private final String INPUT_STRING_SECOND_NUMBER = "Введите второе число: ";
    private final String CUSTOM_EXCEPTION = "Некорректное значение";

    public PowerCalculator() {
        this.numberFirst = 0;
        this.numberSecond = 0;
        this.result = 1;
        this.scanner = new Scanner(System.in);
    }

    public void run() throws InvalidInputException {
        inputNumbers();
        scanner.close();
        checkNumbers();
        calculatePower();
    }

    private void inputNumbers() {
        System.out.println(INPUT_STRING);
        System.out.println(INPUT_STRING_FIRST_NUMBER);
        this.numberFirst = scanner.nextInt();

        System.out.println(INPUT_STRING_SECOND_NUMBER);
        this.numberSecond = scanner.nextInt();
    }

    private void calculatePower() {
        for (int i = 1; i <= this.numberSecond ; i++) {
            this.result *= this.numberFirst;
        }
        System.out.println(this.result);
    }

    private void checkNumbers() throws InvalidInputException {
        if (this.numberFirst == 0 || this.numberSecond < 0) {
            throw new InvalidInputException(CUSTOM_EXCEPTION);
        }
    }
}
