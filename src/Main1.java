public class Main1 {
    public static void main(String[] args) {
        int start_bal = 100;
        int amount_p = 300;
        int amount_bal = start_bal + amount_p;
        int bonus_p = 1;
        if (amount_p > 1000) {
            amount_bal = start_bal + amount_p + amount_p / 100;
        } else {
            amount_bal = start_bal + amount_p;
        }


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}