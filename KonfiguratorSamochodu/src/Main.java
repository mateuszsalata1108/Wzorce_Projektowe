import java.util.Scanner;

class Samochod {
    private String kola;
    private String silnik;
    private String skrzyniabiegow;
    private String tapicerka;
    private String opcjeDodatkowe;


    public void setKola(String kola){
        this.kola = kola;
    }

    public void setSilnik(String silnik){
        this.silnik = silnik;
    }

    public void setSkrzyniabiegow(String skrzyniabiegow) {
        this.skrzyniabiegow = skrzyniabiegow;
    }

    public void setTapicerka(String tapicerka){
        this.tapicerka = tapicerka;
    }

    public void setOpcjeDodatkowe(String opcjeDodatkowe){
        this.opcjeDodatkowe = opcjeDodatkowe;
    }

    public void show(){
        if(silnik!=null) System.out.println("Silnik: " + silnik);
        if(kola!=null) System.out.println("Koła: " + kola);
        if(skrzyniabiegow!=null) System.out.println("Skrzynia biegów: " + skrzyniabiegow);
        if(tapicerka!=null) System.out.println("Tapicerka: " + tapicerka);
        if(opcjeDodatkowe!=null) System.out.println("Opcje dodatkowe: " + opcjeDodatkowe);
    }
}

abstract class Konfigurator {
    protected Samochod samochod;

    public void newSamochod(){
        samochod = new Samochod();
    }

    public Samochod getSamochod() {
        return samochod;
    }

    public abstract void wybierzKola();
    public abstract void wybierzSilnik();
    public abstract void wybierzSkrzynieBiegow();
    public abstract void wybierzTapicerke();
    public abstract void wybierzOpcjeDodatkowe();
}

class KonfiguracjaSamochodu1 extends Konfigurator {
    public void wybierzKola() {
        samochod.setKola("18cali");
    }

    public void wybierzSilnik() {
        samochod.setSilnik("1.2");
    }

    public void wybierzSkrzynieBiegow() {
        samochod.setSkrzyniabiegow("Manulana");
    }

    public void wybierzTapicerke() {
        samochod.setTapicerka("Czarna - Materiał");
    }

    public void wybierzOpcjeDodatkowe() {

        Scanner in = new Scanner(System.in);
        int w;
        while (true) {
            System.out.println("Dodatkowe opcje do wyboru: (1) Opcja brown (Czujniki parkowania), (2) Opcja Silver (Czujniki parkowania oraz panoramiczny dach), (3) Opcja Gold (Czujniki parkowania), (2) Opcja Silver (Czujniki parkowania, panoramiczny dach + bagażnik dachowy), (4) Opcja Premium (Czujniki parkowania, panoramiczny dach, bagażnik dachowy + Autopilot wspomagający prowadzenie), (5) Brak");
            w = in.nextInt();
            if (w > 0 && w < 6) break;
        }
        String wynik = "";
        if (w == 1) wynik = "Opcja brown";
        else if (w == 2) wynik = "Opcja silver";
        else if (w == 3) wynik = "Opcja gold";
        else if (w == 4) wynik = "Opcja premium";
        else if (w == 5) wynik = "Brak";
        samochod.setOpcjeDodatkowe(wynik);
    }
}
class KonfiguracjaSamochodu2 extends Konfigurator {
    public void wybierzKola() {
        samochod.setKola("21cali");
    }

    public void wybierzSilnik() {
        samochod.setSilnik("2.0");
    }

    public void wybierzSkrzynieBiegow() {
        samochod.setSkrzyniabiegow("Automatyczna");
    }

    public void wybierzTapicerke() {
        Scanner it = new Scanner(System.in);
        int t;
        while (true) {
            System.out.println("Tapicerka do wyboru: (1) Materiałowa czarna, (2) Skórzana czarna");
            t = it.nextInt();
            if (t > 0 && t < 3) break;
        }
        String tapicerka = "";
        if (t == 1) tapicerka = "Materiałowa czarna";
        else if (t == 2) tapicerka = "Skórzana czarna";

        samochod.setTapicerka(tapicerka);
    }

    public void wybierzOpcjeDodatkowe() {

        Scanner in = new Scanner(System.in);
        int w;
        while (true) {
            System.out.println("Dodatkowe opcje do wyboru: (1) Opcja brown (Czujniki parkowania), (2) Opcja Silver (Czujniki parkowania oraz panoramiczny dach), (3) Opcja Gold (Czujniki parkowania), (2) Opcja Silver (Czujniki parkowania, panoramiczny dach + bagażnik dachowy), (4) Opcja Premium (Czujniki parkowania, panoramiczny dach, bagażnik dachowy + Autopilot wspomagający prowadzenie), (5) Brak");
            w = in.nextInt();
            if (w > 0 && w < 6) break;
        }
        String wynik = "";
        if (w == 1) wynik = "Opcja brown";
        else if (w == 2) wynik = "Opcja silver";
        else if (w == 3) wynik = "Opcja gold";
        else if (w == 4) wynik = "Opcja premium";
        else if (w == 5) wynik = "Brak";
        samochod.setOpcjeDodatkowe(wynik);
    }
}
class User{
    private Konfigurator konfigurator;

    public void setKonfigurator(Konfigurator konfigurator){
        this.konfigurator = konfigurator;
    }
    public Samochod getSamochod(){
        return konfigurator.getSamochod();
    }
    public void konfiguruj(){
        konfigurator.newSamochod();
        konfigurator.wybierzKola();
        konfigurator.wybierzSilnik();
        konfigurator.wybierzSkrzynieBiegow();
        konfigurator.wybierzTapicerke();
        konfigurator.wybierzOpcjeDodatkowe();
    }
}
public class Main {
    public static void main(String[]args){
        User uzytkownik = new User();
        Konfigurator konfigurator = new KonfiguracjaSamochodu1();
        Konfigurator konfigurator2 = new KonfiguracjaSamochodu2();

        System.out.println("\nSamochód 1");
        uzytkownik.setKonfigurator(konfigurator);
        uzytkownik.konfiguruj();
        Samochod samochod1 = uzytkownik.getSamochod();

        System.out.println("\nSamochód 2");
        uzytkownik.setKonfigurator(konfigurator2);
        uzytkownik.konfiguruj();
        Samochod samochod2 = uzytkownik.getSamochod();

        System.out.println("\n\nSamochód 1");
        samochod1.show();
        System.out.println("\n\nSamochód 2");
        samochod2.show();
    }
}


