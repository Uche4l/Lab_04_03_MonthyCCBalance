public class Main
{
    public static void main(String[] args)
    {
        double preInterest = 5000;
        double interstRate = .17;
        double interestCost1m = preInterest * interstRate;
        double interestCost2m = preInterest * interstRate;

        System.out.println("balance after one month is" + interestCost1m);

        System.out.println("balance after two months is" + interestCost2m);

    }
}