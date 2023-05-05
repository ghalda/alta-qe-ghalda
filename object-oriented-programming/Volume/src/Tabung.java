public class Tabung {
    double jari;
    double tinggi;

    public Tabung(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public int volume(){
        double vol = Math.PI*(Math.pow(jari,2)*tinggi);
        return (int) Math.ceil(vol);
    }
}
