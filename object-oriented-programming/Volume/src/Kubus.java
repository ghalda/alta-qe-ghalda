public class Kubus {
    double rusuk;

    public Kubus(double rusuk) {
        this.rusuk = rusuk;
    }

    public int volume(){
        double vol = Math.pow(rusuk,3);
        return (int) Math.ceil(vol);
    }
}
