public class Balok {
    double panjang;
    double lebar;
    double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int volume(){
        double vol = panjang*lebar*tinggi;
        return (int) Math.ceil(vol);
    }
}
