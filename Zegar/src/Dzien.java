import java.time.LocalDate;

public class Dzien {

    public void getCurrentDay(){
        LocalDate dataLokalna = LocalDate.now().now();
        System.out.println("Aktualna data: " + dataLokalna);
    }
}
