public class Main
{
    public static void main(String[] args)
    {
        double balance = 5000;
        double interestRate = 0.17;
        double firstMonthInterest = balance * interestRate;
        double secondMonthInterest = (balance + firstMonthInterest) * interestRate;
        System.out.println("Interest after one month: $" + firstMonthInterest);
        System.out.println("Interest after two months: $" + secondMonthInterest);

    }
}