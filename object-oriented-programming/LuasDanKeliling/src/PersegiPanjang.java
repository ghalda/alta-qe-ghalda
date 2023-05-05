public class PersegiPanjang {
    float panjang;
    float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int keliling(){
        float kel = (panjang+lebar)*2;
        return (int) Math.ceil(kel);
    }

    public int luas(){
        float luas = panjang*lebar;
        return (int) Math.ceil(luas);
    }
}
