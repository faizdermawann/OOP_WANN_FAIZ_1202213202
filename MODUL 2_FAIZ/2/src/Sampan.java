public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan (int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void informasi(){
        System.out.printf("Transportasi Air jenis Sampan sedang berlayar menggunakan 2 layar", layar);
    }
    public void berlayar(int layar){
        System.out.printf("Transportasi Air dengan jenis Sampan sedang berlayar", layar);
    }
    public void berlabuh(){
        System.out.printf("Transportasi Air dengan jenis Sampan berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.printf("Transportasi Air dengan jenis Sampan berlabuh di pantai menggunakan %s jangkar");
    }
}