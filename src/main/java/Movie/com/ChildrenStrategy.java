package Movie.com;

public class ChildrenStrategy implements PaymentStrategy{
    public int pay(int amount, int rentDays){
        amount = (int) (rentDays * 1.5);
        return amount;
    }
}
