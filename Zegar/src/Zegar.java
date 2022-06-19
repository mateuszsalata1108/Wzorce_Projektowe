public class Zegar {
    private Dzien dzien;
    private DzienTygodnia dzienTygodnia;
    private Godzina godzina;
    private Miesiac miesiac;
    private Rok rok;
    private Strefa strefa;

    public Zegar(){
        this.dzien = new Dzien();
        this.dzienTygodnia = new DzienTygodnia();
        this.godzina = new Godzina();
        this.miesiac = new Miesiac();
        this.rok = new Rok();
        this.strefa = new Strefa();
    }

    public void ZegarA(){
        System.out.println("Pokazuję aktualną godzinę oraz miesiąc:");
        godzina.getCurrentHour();
        miesiac.getCurrentMonth();
    }

    public void ZegarB(){
        System.out.println("Pokazuję aktualny rok i dzień tygodnia:");
        rok.getCurrentYear();
        dzienTygodnia.getWeekday();
    }

    public void ZegarC(){
        System.out.println("Pokazuję aktualną datę i strefę czasową:");
        dzien.getCurrentDay();
        strefa.getLocalTimeZone();
    }
}
