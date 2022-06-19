public class Main {

    public static void main(String[] args) {
        Predkosciomierz ferrari = new SuperSzybkiSamochod();
        Konwerter ferrariMPH = new Konwerter(ferrari);

        System.out.println("Predkosc samochodu w kilometrach na godzinę: " + ferrari.getSpeed());
        System.out.println("Predkosc samochodu w milach na godzinę: " + ferrariMPH.getSpeed());
    }
}
