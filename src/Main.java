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

Задача 2. По желанию
Вы разрабатываете систему банковских транзакций. Необходимо написать программу,
которая позволяет пользователям осуществлять переводы средств со своего банковского счета на другие счета.
Однако, в системе существуют некоторые ограничения и возможные ошибки, которые нужно обрабатывать.

Требования:

При переводе средств, сумма должна быть положительной и не превышать доступный баланс на счете.
Если сумма перевода отрицательная или равна нулю, выбрасывается исключение InvalidAmountException с сообщением "Некорректная сумма перевода".
Если на балансе недостаточно средств для перевода, выбрасывается исключение InsufficientFundsException с сообщением "Недостаточно средств на счете".
При успешном переводе, сумма должна списываться с текущего счета и зачисляться на целевой счет.
 */

public class Main {
    public static void main(String[] args) throws InvalidInputException, InsufficientFundsException, InvalidAmountException {
        PowerCalculator powerCalculator = new PowerCalculator();

        while (true) {
            powerCalculator.run();
        }


//        Bank bank = new Bank(100000);
//        System.out.println(bank.getAmount());
//        System.out.println(bank.getBankAmount());
//
//        bank.transaction(1000);
//
//        System.out.println(bank.getAmount());
//        System.out.println(bank.getBankAmount());
    }
}