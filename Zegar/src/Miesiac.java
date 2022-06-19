import java.time.LocalDate;
import java.time.YearMonth;

public class Miesiac {
    public void getCurrentMonth(){
        LocalDate localDate = LocalDate.now();
        System.out.println("Aktualny miesiąc to: " + localDate.getMonth());
    }
}
