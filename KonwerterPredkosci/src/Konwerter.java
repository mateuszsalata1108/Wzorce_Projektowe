public class Konwerter implements PredkosciomierzMPH {
    private Predkosciomierz samochod;

    public Konwerter(Predkosciomierz samochod){
        this.samochod = samochod;
    }

    @Override
    public double getSpeed() {
        return convertKMPHtoMPH(samochod.getSpeed());
    }

    private double convertKMPHtoMPH(double kmph) {
        return kmph * 0.62137;
    }
}