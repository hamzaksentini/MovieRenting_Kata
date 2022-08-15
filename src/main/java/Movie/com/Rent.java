package Movie.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rent {


    private final int rentDays;
    private final MovieType type;

    private List<Rent> rentList;


    public Rent(int rentDays, MovieType type){
        this.rentDays = rentDays;
        this.type = type;
        this.rentList= new ArrayList<>();
    }


    public int getRentDays(){
        return rentDays;
    }

    public MovieType getType(){
        return type;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent that = (Rent) o;
        return type == that.type && Objects.equals(rentDays, that.rentDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentDays,type);
    }
}



