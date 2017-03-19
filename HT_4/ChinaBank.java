package HT_4;

public abstract class ChinaBank extends Bank{

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                     long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {

        if (currency == Currency.USD) {
            return 100;
        }
        else if(currency == Currency.EUR){
            return 150;
        }
        return 0;
    }

    @Override
    public int getLimitOfFunding() {

        if (currency == Currency.USD) {
            return 10000;
        }
        else if(currency == Currency.EUR){
            return 5000;
        }
        return 0;
    }

    @Override
    public int getMonthlyRate() {

        if (currency == Currency.USD) {
            return 1;
        }
        else if(currency == Currency.EUR){
            return 0;
        }
        return 0;
    }

    @Override
    public int getCommission(int summ) {

        if (currency == Currency.USD  && summ <= 1000) {
            return 3;
        }
        else if(currency == Currency.USD  && summ > 1000){
            return 5;
        }
        else if(currency == Currency.EUR  && summ <= 1000){
            return 10;
        }
        else if(currency == Currency.EUR  && summ > 1000){
            return 11;
        }
        return 0;
    }
}
