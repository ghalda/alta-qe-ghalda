public class Perhitungan extends InputAngka{
    int biaya = 5000;
    float volumeStandar = 50;

    public Perhitungan(float panjang, float lebar, float tinggi, float berat) {
        super(panjang, lebar, tinggi, berat);
    }

    @Override
    public float volumeBarang() {
        float volume = panjang*lebar*tinggi;
        return volume;
    }

    @Override
    public float biayaOngkirBerat() {
        float ongkirBerat = 0;
        if(berat >= 1){
            ongkirBerat = (float) (Math.floor(berat) * biaya);
        } else if (berat < 1) {
            ongkirBerat = (float) (Math.ceil(berat) * biaya);
        }
        return ongkirBerat;
    }

    @Override
    public float biayaOngkirVolume() {
        float ongkirVolume = 0;
        if(volumeBarang()/volumeStandar >= 1){
            ongkirVolume = (float) ((Math.floor(volumeBarang()/volumeStandar))*biaya);
        } else if (volumeBarang()/volumeStandar < 1) {
            ongkirVolume = (float) ((Math.ceil(volumeBarang()/volumeStandar))*biaya);
        }
        return ongkirVolume;
    }

    @Override
    public void hitungOngkir() {
        int ongkirFinal = 0;
        if(biayaOngkirVolume() > biayaOngkirBerat()){
            ongkirFinal = (int) biayaOngkirVolume();
        } else if (biayaOngkirBerat() >= biayaOngkirVolume()) {
            ongkirFinal = (int) biayaOngkirBerat();
        }
        System.out.println("Biaya Ongkos Kirim Barang adalah Rp "+ ongkirFinal+ ",-");
    }
}
