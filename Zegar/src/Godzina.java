import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Godzina {

    public void getCurrentHour(){
        LocalTime czasLokalny = LocalTime.now().truncatedTo( ChronoUnit.SECONDS ) ;;
        System.out.println("Aktualna godzina: " + czasLokalny);
    }
}
