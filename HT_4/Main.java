package HT_4;

import java.util.Currency;

public class Main implements BankSystemImpl{
/*
    Класс Main с методом main, где вы должны создать 6 объектов класса User (2 - USBank, 2 - EUBank, 2 - ChinaBank).
    Создать интерфейс BankSystem с методами:
    ...
    и его релизацию.
*/
    public static void main(String[] args) {
        //вы должны создать 6 объектов класса User (2 - USBank, 2 - EUBank, 2 - ChinaBank).

        Bank EUBankGrigoriy = new EUBank(12, "Ukraine", Bank.Currency.EUR, 2,
                350.00, 79, 1200);

/*
        User userGrigoriy = new User(1.0, 399.00, 4, "Company cool",
                400,
*/

    }

}
