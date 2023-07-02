/*
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

public class Bank implements BankTransaction {
    int bankAmount = 10000000;
    int id = 0;
    int amount;
    private final String CUSTOM_EXCEPTION_FIRST = "Некорректная сумма перевода";
    private final String CUSTOM_EXCEPTION_SECOND = "Недостаточно средств на счете";

    public Bank(int amount) {
        this.id = id + 1;
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public int getBankAmount() {
        return this.bankAmount;
    }

    @Override                               // будем считать, что любая транзакция списывается и просто уходит в банк
    public void transaction(int amountTransaction) throws InsufficientFundsException, InvalidAmountException {
        if (amountTransaction > this.amount) {
            throw new InsufficientFundsException(CUSTOM_EXCEPTION_SECOND);
        } else if (amountTransaction < 0 || amountTransaction == 0) {
            throw new InvalidAmountException(CUSTOM_EXCEPTION_FIRST);
        } else {
            this.amount -= amountTransaction;
            this.bankAmount += amountTransaction;
        }
    }
}
