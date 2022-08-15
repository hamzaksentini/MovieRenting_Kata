package Movie.com;

public class ComedyStrategy implements PaymentStrategy{
    public int pay(int amount, int rentDays){
        amount = (int) (rentDays * 1.75);
        return amount;
    }

}
