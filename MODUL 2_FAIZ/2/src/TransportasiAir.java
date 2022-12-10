public class TransportasiAir {
    protected int jumlahKursi ;
    protected int biaya;

    public TransportasiAir (int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;;
    }

    public void informasi(){
        System.out.printf("Transportasi Air jenis tidak diketahui dengan kursi berjumlah %s ditetapkan dengan biaya sebesar %s", jumlahKursi, biaya);
    }
    public void berlayar(){
        System.out.printf("Transportasi Air dengan jenis tidak diketahui sedang berlayar");
    }
    public void berlabuh(){
        System.out.printf("Transportasi Air dengan jenis yang tidak diketahui berlabuh di pantai");
    }
}