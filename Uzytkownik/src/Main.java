public class Main {

    public static void main(String[] args) {

        Uzytkownik uzytkownik = new Uzytkownik("Jan", "Kowalski", 18);

        uzytkownik.getUzytkownik();

        Zarzadzajacy zarzadzajacy = new Zarzadzajacy();
        zarzadzajacy.pamiatka = uzytkownik.cofnij();

        uzytkownik.setWiek(21);
        uzytkownik.setImie("Adam");
        uzytkownik.setNazwisko("Kowalewski");

        uzytkownik.getUzytkownik();

        uzytkownik.przywroc(zarzadzajacy.getPamiatka());
        uzytkownik.getUzytkownik();
    }
}
