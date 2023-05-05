public class Persegi {
    float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    //method keliling
    public int keliling(){
        float kel = sisi * 4;
        return (int) Math.ceil(kel);
    }

    //method luas
    public int luas(){
        float luas = sisi*sisi;
        return (int) Math.ceil(luas);
    }
}
