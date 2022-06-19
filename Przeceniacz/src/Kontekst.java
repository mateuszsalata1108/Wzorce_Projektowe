public class Kontekst {
    private Przecena _przecena;

    public Kontekst(Przecena przecena){
        this._przecena = przecena;
    }

    public double ZwrocPrzecenionaWartosc(double wartosc){
        return _przecena.Przecen(wartosc);
    }
}
