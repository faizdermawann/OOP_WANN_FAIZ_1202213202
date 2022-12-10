public class MainApp {
    public static void main (String[] arg) throws Exception{
        TransportasiAir a = new TransportasiAir(4,20000);
        a.informasi();
        System.out.println();

        Sampan b = new Sampan(4,2.40f,true);
        b.informasi();
        b.berlayar();
        b.berlabuh();
        b.berlabuh(2);
        System.out.println();

        Kapal c = new Kapal(50,100000);
        c.informasi();
        c.berlayar();
        c.berlayar(20);
        c.berlabuh();
        System.out.println();
    }
}