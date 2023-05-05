public class Segitiga {
    float alas;
    float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int keliling(){
        float sisimiring = (float) Math.sqrt((alas*alas)+(tinggi*tinggi));
        float kel = alas+tinggi+sisimiring;
        return (int) Math.ceil(kel);
    }

    public int luas(){
        float luas = (alas*tinggi)/2;
        return (int) Math.ceil(luas);
    }
}
