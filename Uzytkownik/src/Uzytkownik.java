public class Uzytkownik {

    private String imie;
    private String nazwisko;
    private int wiek;

    public Uzytkownik(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Pamiatka cofnij(){
        return new Pamiatka(imie,nazwisko,wiek);
    }

    public void przywroc(Pamiatka pamiatka){
        setImie(pamiatka.getImie());
        setNazwisko(pamiatka.getNazwisko());
        setWiek(pamiatka.getWiek());
    }

    public void getUzytkownik(){
        System.out.println("Informacje o użytkowniku: " + "\n" + "Imie: " + imie + "\n" + "Nazwisko: " + nazwisko + "\n" + "Wiek: " + wiek);
    }
}
