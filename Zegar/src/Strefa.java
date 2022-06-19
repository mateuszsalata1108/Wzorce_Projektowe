import java.time.ZoneId;

public class Strefa {
    public void getLocalTimeZone(){
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("Lokalna strefa czasowa to: " + zoneId);
    }
}
