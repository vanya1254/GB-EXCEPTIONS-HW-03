public interface BankTransaction {
    void transaction(int amountTransaction) throws InsufficientFundsException, InvalidAmountException;
}
