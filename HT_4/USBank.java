package HT_4;

/*
USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
limit of funding - 10000 if EUR and no limit if USD
monthly rate - 1% with USD and 2% with EUR
commision - 5% if USD and up to 1000, 7% if USD and more than 1000
6% if EUR and up to 1000 and 8% if EUR and more than 1000
 */

/*
USBank: лимит снятия = 1000, если валюта - USD и 1200, если валюта - EUR
лимит пополнения - 10000, если EUR, и нет лимита, если USD
месячная ставка - 1% на USD и 2% на EUR
комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
6%, если EUR и до 1000 и 8%, если EUR и больше 1000
 */

abstract class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {

        if (currency == Currency.USD) {
            return 1000;
        }
        else if(currency == Currency.EUR){
            return 1200;
        }


    }
}

