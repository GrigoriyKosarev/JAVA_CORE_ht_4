package HT_4;

public abstract class EUBank extends Bank{

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                  long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {

        if (currency == Currency.USD) {
            return 2000;
        }
        else if(currency == Currency.EUR){
            return 2200;
        }
        return 0;
    }

    @Override
    public int getLimitOfFunding() {

        if (currency == Currency.USD) {
            return 10000;
        }
        else if(currency == Currency.EUR){
            return 20000;
        }
        return 0;
    }

    @Override
    public int getMonthlyRate() {

        if (currency == Currency.USD) {
            return 0;
        }
        else if(currency == Currency.EUR){
            return 1;
        }
        return 0;
    }

    @Override
    public int getCommission(int summ) {

        if (currency == Currency.USD  && summ <= 1000) {
            return 5;
        }
        else if(currency == Currency.USD  && summ > 1000){
            return 7;
        }
        else if(currency == Currency.EUR  && summ <= 1000){
            return 2;
        }
        else if(currency == Currency.EUR  && summ > 1000){
            return 4;
        }
        return 0;
    }

}
