package HT_4;

public interface BankSystemImpl extends BankSystem{

    @Override
    default void withdrawOfUser(User user, int amount) {

    }

    @Override
    default void fundUser(User user, int amount) {

    }

    @Override
    default void transferMoney(User fromUser, User toUser, int amount) {

    }

    @Override
    default void paySalary(User user) {

    }
}
