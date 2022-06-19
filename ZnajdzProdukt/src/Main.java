class Produkt{
    private static Produkt _produkt;

    protected Produkt(){}

    public static Produkt zwrocProdukt() {
        if (_produkt == null) {
            _produkt = new Produkt();
        }
        return _produkt;
    }
        public int numerArtukulu;
        public String nazwa;
        public String marka;
        public String kodProduktu;
        public double cena;


        public void setNumerArtukulu(int NumerArtukulu) {
            numerArtukulu = NumerArtukulu;
        }
        private int getNumerArtukulu(){
            return numerArtukulu;
        }

         public void setNazwa(String Nazwa) {
            nazwa = Nazwa;
        }
        private String getNazwa(){
            return nazwa;
        }

        public void setMarka(String Marka) {
            marka = Marka;
        }
        private String getMarka(){
            return marka;
        }

        public void setKodProduktu(String KodProduktu) {
            kodProduktu = KodProduktu;
        }
        private String getKodProduktu(){
            return kodProduktu;
        }

        public void setCena(double Cena) {
            cena = Cena;
        }
        private Double getCena(){
            return cena;
        }


        public void wyszukaj(int numerArtukulu, String nazwa, String marka, String kodProduktu, double cena)
        {
            setNumerArtukulu(numerArtukulu);
            setNazwa(nazwa);
            setMarka(marka);
            setKodProduktu(kodProduktu);
            setCena(cena);
            getNumerArtukulu();
            getNazwa();
            getMarka();
            getKodProduktu();
            getCena();
        }

}

 class Program {

         public static void main(String[] args) {

             Produkt produkt = Produkt.zwrocProdukt();
             Produkt zwrocpokodzieproduktu = Produkt.zwrocProdukt();

             produkt.wyszukaj(1, "Długopis", "Bic", "112233", 3.99);

             System.out.println(produkt.numerArtukulu + ", " + produkt.kodProduktu);
             System.out.println(zwrocpokodzieproduktu.numerArtukulu + ", "+ produkt.kodProduktu);

         }
}
