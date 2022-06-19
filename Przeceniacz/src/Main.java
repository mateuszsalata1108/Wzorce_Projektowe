public class Main {

    public static void main(String[] args) {

        Kontekst kontekst;
        double cenaOryginalna = 100;

        kontekst = new Kontekst(new PrzecenaWielkanocna());
        double cenaWielkanocna = kontekst.ZwrocPrzecenionaWartosc(cenaOryginalna);
        System.out.println("W święta wielkanocne cena produktu o oryginalnej wartości " + cenaOryginalna + " zł " + " wynosi tylko " + cenaWielkanocna + " zł");

        kontekst = new Kontekst(new PrzecenaSwiateczna());
        double cenaSwiateczna = kontekst.ZwrocPrzecenionaWartosc(cenaOryginalna);
        System.out.println("W święta bożonarodzeniowe cena produktu o oryginalnej wartości " + cenaOryginalna + " zł " + " wynosi tylko " + cenaSwiateczna + " zł");


    }
}
