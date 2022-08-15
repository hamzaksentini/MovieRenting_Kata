package Movie.com;

public class WarStrategy implements PaymentStrategy {
    public int pay(int amount, int rentDays){
        amount = (int) (rentDays * 2);
        Rent.add(Rent);
        return amount;
    }
}