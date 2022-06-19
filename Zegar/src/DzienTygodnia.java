import java.time.LocalDate;

public class DzienTygodnia {
    public void getWeekday(){
        LocalDate localDate = LocalDate.now();
        System.out.println("Dzisiejszy dzień tygodnia to: " + localDate.getDayOfWeek());
    }
}
