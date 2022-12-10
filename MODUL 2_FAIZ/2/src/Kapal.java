public class Kapal extends TransportasiAir {
    protected String mesin;

    public Kapal (int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    @Override
    public void informasi(int mesin){
        System.out.printf("Transportasi Air jenis Kapal sedang berlayar menggunakan 2 layar", mesin);
    }
    public void berlayar(){
        System.out.printf("Transportasi Air dengan jenis Kapal sedang berlayar menggunakan jenis Diesel dengan kecepatan yang tidak stabil");
    }
    public void berlayar(int kecepatan){
        System.out.printf("Transportasi Air dengan jenis Kapal sedang berlayar menggunakan jenis Diesel dengan kecepatan stabil di kisaran %s knot", kecepatan);
    }
    public void berlabuh(){
        System.out.printf("Transportasi Air dengan jenis Kapal berlabuh di pantai tanpa jangkar");
    }
}